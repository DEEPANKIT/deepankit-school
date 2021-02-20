const markdownpdf = require("markdown-pdf");
const { readdir } = require("fs");
const { mkdir_if_missing } = require("./utils");
const { pdf_dir, md_dir } = require("../settings");

var options = {
    highlightCssPath : `${__dirname}/code.css`,
    cssPath : `${__dirname}/md.css`
}

mkdir_if_missing(pdf_dir, (_) => {
  readdir(md_dir, (e, files) => {
    if (e) throw e;
    files.forEach((file) => {
      markdownpdf(options)
        .from(`${md_dir}/${file}`)
        .to(`${pdf_dir}/${file.replace(".md", ".pdf")}`, function () {
          console.log(`Done ${file.replace('.md','')}`);
        });
    });
  });
});
