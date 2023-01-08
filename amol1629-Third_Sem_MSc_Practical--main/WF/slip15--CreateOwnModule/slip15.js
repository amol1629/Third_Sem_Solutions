const http = require('http')
const getDate = require('./modules')
const server = http.createServer((req , res)=>{
    res.end(getDate())
})

server.listen(2000)