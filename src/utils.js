const {exists, mkdir} = require('fs');

exports.mkdir_if_missing =  function (dir, callback) {
    exists(dir, exists => {
        if (!exists)
            mkdir(dir, (e)=> {
                if(e)
                    throw e;
                callback();
            });
        else
            callback();
    })
}