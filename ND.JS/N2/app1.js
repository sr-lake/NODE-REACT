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