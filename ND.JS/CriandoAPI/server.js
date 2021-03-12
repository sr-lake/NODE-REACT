
const express = require ( 'express' ) ;
const  debug  =  require ( 'debug' ) ( 'server : server' ) ;
const  http  =  require ( 'http' ) ;

const app = express();
const port = 3000;
app.set('port', port );

const server = http.createServer(app);
const router = express.router();

  const route = router.get('/', (req, res, next)=> {
        res.status(200).send({
            title: "Node Store API", 
            version: "0.0.1"
        });
  });

  app.use('/', route);
console.log('API rodando na porta...' + port);