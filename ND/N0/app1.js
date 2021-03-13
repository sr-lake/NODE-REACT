const os = require ('os')
const {freemem, totalmem} = os
//console.log(`${parseInt(freemem() / 1024 / 1024)} MB` , totalmem())
const total = parseInt(totalmem() / 1024 / 1024)
const mem = parseInt(freemem() / 1024 / 1024)
const percents = parseInt((mem / total) *100)

const stats = 
{
    free: `${mem} MB`,
    total: `${total} MB`,
    usage: `${percents} %`,
}
console.log(stats)


//modelo de modulo para rodar API aplicação para o server local.
const router = express.Router();

  const route = router.get('/', (req, res, next) => {
        res.status(200).send({
            title: "Node Store API", 
            version: "0.0.1"
        });
  });
  app.use('/', route);
