const { readdir, readFile, writeFile } = require("fs");
const { mkdir_if_missing } = require("./utils");
const { md_dir, pro_dir ,ques} = require("../settings");

function write_md(dir, out, ques) {
  readdir(dir, (e, files) => {
    if (e) throw e;
    files.forEach((file) => {
      readFile(`${dir}/${file}`, (e, data) => {
        if (e) throw e;
        file = file.replace(".java", "");
        writeFile(
          `${out}/${file}.md`,
          `# ${file}\n\n${ques[file]}\n\n` +
            "```java\n" +
            data.toString() +
            "\n```\n\n",
          (e) => {
            if (e) throw e;
          }
        );
      });
    });
  });
}

mkdir_if_missing(md_dir, (e) => {
  write_md(pro_dir, md_dir, ques);
});
