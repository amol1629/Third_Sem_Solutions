// 8)	Create a Node.js file that demonstrates create database and table in MySQL. 

const mysql = require('mysql')

const conn = mysql.createConnection({
    host:3306,
    user:"root",
    password:"root12"
})


conn.connect((err)=>{
    if(err){
        console.log(err)
    }else {
        console.log("Connected")
        conn.query("CREATE DATABASE testdb", function(err, result){
            if(err){
                console.log(err)
            }else {
                console.log("created database")
                conn.end()
            }
        })
    }
})