const {readdir, readFile, writeFile, exists, mkdir} = require('fs');

const ques = {
    BinarySearch: "Program for Binary Search using recursion",
    BlastRadius: "To Identify the area damaged by the bomb dropped on a particular type of field. The bomb damages all the land connected with each other and has no effect on water",
    BracketVerification: "",
    CircularQueue: "Program to demonstrate circular queue data structure",
    ComplexSubString: "Program to find to fin out the shortest possible substring from a given string. Both the strings are give by the user and the substring must contain all the characters of the smallest string given in any order",
    Postfix: "",
    Similarity: "",
    Stack: "Program to demonstrate stack data structure",
    SudokuCheck: "",
    copy: "",
    decode: "Program to decode a string where a small part of the original string is given and the encoding variable lies between -20 and 100"
};

check_out_dir(`${__dirname}/out`, (e) => {
    if (e)
        throw e;
    write_md(`${__dirname}/pro`, `${__dirname}/out`, ques);
})

function check_out_dir(dir, callback) {
    exists(dir, exists => {
        if (!exists)
            mkdir(dir, callback);
        else
            callback();
    })
}

function write_md(dir, out, ques) {
    readdir(dir, (e, files) => {
        if (e)
            throw e;
        files.forEach(file => {
            readFile(`${dir}/${file}`, (e, data) => {
                if (e)
                    throw e;
                file = file.replace('.java', '')
                writeFile(`${out}/${file}.md`, `# ${file}\n\n${ques[file]}\n\n` + "```java\n" + data.toString() + "\n```\n\n", e => {
                    if (e)
                        throw e;
                })
            });
        });
    });

}
