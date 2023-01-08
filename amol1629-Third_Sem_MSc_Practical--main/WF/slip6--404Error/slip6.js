const http = require('http')
const fs = require('fs/promises')

const server = http.createServer(async (req, res) => {
    if (req.url == '/' || req.url == '/favicon.ico') {
        res.write("Add the file name you want to read at url")
    } else {
        try {
            let data = await fs.readFile(`.${req.url}`, 'utf-8')
            res.write(data.toString())
        } catch (e) {
            console.log(e)
            res.statusCode = 404
            res.write("File not found")
        }
    }
    return res.end()
}).listen(2000, () => {
    console.log(` Server is running at port 2000`)
})