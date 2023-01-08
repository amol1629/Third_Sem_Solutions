const express = require('express')

const app = express()

app.get("/" , (req , res)=>{
    res.download("file.txt")
})

app.listen(2000)