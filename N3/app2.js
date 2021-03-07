var http = require('http');
//* http.createServer().listen(8081);
http.createServer(function(req,res){res.end("Hello Word! Welcome to My Website!") }).listen(8081);

console.log("O servidor esta capotando!!! Ê Tremm...")

/*var express = require("express");
var app = express();*/



const express = require("express");
const app = express();

app.get("/", function(req, res){res.send ("Seja Bem-Vindo ao Meu App!")});

app.get("/sobre", function(req, res){res.send ("Minha Pagina Sobre...")});

app.get("/blog", function(req, res){res.send ("Seja Bem-Vindo ao Meu Bolg!.")});

app.listen(8082, function(){
                                   console.log("Servidor Ativo na Url http://localhost:8082");
                                          });
