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
        values = [
            ["aditya", "mcs"],
            ["vignesh", "datascience"],
            ["prasad" , "mcs"]
        ]
        conn.query('insert into student(name , class) values?',[values], (err, result)=>{
            if(err){
                console.log(err)
            }else{
                console.log("inserted successfully")
                console.log(result)
                conn.end()
            }
        })
    }
})