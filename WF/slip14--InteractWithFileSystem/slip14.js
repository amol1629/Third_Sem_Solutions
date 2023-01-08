let fs = require('fs/promises')

let http = require('http')

const server = http.createServer(async(req, res)=>{
   let data = await fs.readFile('file.html')
   data = data.toString()
   res.setHeader('Content-Type', 'text/html')
   res.write(data)
   res.end()
})

server.listen(2000)