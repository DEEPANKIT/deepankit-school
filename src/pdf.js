const markdownpdf = require("markdown-pdf");
const { readdir } = require("fs");
const { mkdir_if_missing } = require("./utils");
const { pdf_dir, md_dir } = require("../settings");

mkdir_if_missing(pdf_dir, (_) => {
  readdir(md_dir, (files) => {
    console.log()
    files.forEach((file) => {
      markdownpdf()
        .from(`${md_dir}/${file}`)
        .to(`${md_dir}/${file.replace(".md", ".pdf")}`, function () {
          console.log("Done");
        });
    });
  });
});
