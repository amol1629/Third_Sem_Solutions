const mysql = require('mysql')

const conn = mysql.createConnection({
    port:3306, 
    user:"root",
    password:"root12",
    database:"testdb"
})

conn.connect((err)=>{
    if(err){
        console.log(err)
    }else {
        const q = "select * from customers2"
        conn.query(q , (err, result)=>{
            if(err){
                console.log(err)
            }else {
                result.forEach((e)=>{
                    console.log(`name : ${e.name} address : ${e.address}`)
                })
            }

            conn.end()
        })
    }
})