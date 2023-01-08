const http = require('http')

const server = http.createServer((req , res)=>{
    res.setHeader("Content-Type" , "text/html")
    res.statusCode = 200
    res.write(`
    <html> 
    <body>
    <input type="file" name="fileupload">
    <br>
    <input type="submit">
    </form>
    </body>
    </html>
    `)
    return res.end()
}).listen(2000 , ()=>{
    console.log("Server running at the port 2000")
})