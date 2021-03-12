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