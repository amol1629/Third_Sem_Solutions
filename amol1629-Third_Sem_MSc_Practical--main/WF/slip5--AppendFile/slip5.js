const express = require('express')
const bodyParser = require('body-parser')
const app = express()

const fs = require('fs/promises')

app.use(bodyParser.urlencoded({extended:false }))

app.get("/" , (req , res)=>{
    res.sendFile(__dirname+"/form.html")
})

app.post("/data" , async(req , res)=>{


    try{
        const {file1 , file2 } = req.body
        let file1r = await fs.readFile(__dirname + `/${file1}` , "utf8")
        await fs.appendFile(__dirname + `/${file2}` , file1r , "utf8")

        res.send("File Successfully appended")

    }catch(e){
        console.log(e)
        res.send("Enter Valid Files")
    }

})

app.listen(2000 , ()=>{
    console.log("2000 port running ")
})