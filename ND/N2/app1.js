const os = require ('os')

const {freemem, totalmem} = os
console.log ("Olá Mundo!")

console.log (freemem(), totalmem());
// Aqui estou testando composição de comandos no NODE.JS-N1
var nome = "Gustavo"
var sobreN = "Lago"
console.log(nome + " " + sobreN);
// Aqui estou testando composição de comandos no NODE.JS-N1
var n1 = 10
var n2 = 20

function somar(a, b)
{
    return a + b
}
console.log (somar(n1, n2))






//

const express = require('express');

const app = express();
const router = express.Router();

  const route = router.get
('/', (req, res, next) => 
{
        res.status(200).send
        ({
            title: "SERVER LAKE - API", 
            version: "0.0.1"
        });
});
/* const create = router.post('/', (req, res, next) =>
{
      res.status(201).send(req.body);
});*/
app.use('/', route);
//app.use('/product');
module.exports = app;