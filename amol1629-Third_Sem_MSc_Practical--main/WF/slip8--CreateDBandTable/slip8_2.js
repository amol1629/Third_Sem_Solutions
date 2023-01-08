const mysql = require('mysql')

const conn = mysql.createConnection({
    host:3306,
    user:"root",
    password:"root12",
    database:"testdb"
})

conn.connect((err)=>{
    if(err){
        console.log(err)
    }else {
        const createTableQuery = "create table student(name varchar(20) , class varchar(20))"
        conn.query(createTableQuery , (err, result) =>{
            if(err){
                console.log(err)
            }else {
                console.log("Table Created ")
                conn.end()
            }
        })
    }
})