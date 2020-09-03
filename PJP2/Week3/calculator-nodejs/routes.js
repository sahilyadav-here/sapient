const path = require('path');
const express = require('express');
const router = express.Router();
const task = require('./components/tasks');

router.get('/', (req, res,next)=>{
   res.sendFile(path.join(__dirname, 'views', 'index.html'));
});

router.post('/post-datequery', (req, res, next)=>{

   var date = req.body.date;
   var options = req.body.options;
   var number = req.body.number;

   var pattern =/^([0-9]{4})\-([0-9]{2})\-([0-9]{2})$/;
   if(!pattern.test(date)){
      res.send("<h1> Invalid date </h1>");
   }

   console.log('date: ', date);
   console.log('option: ', options);
   
   var output = task.taskRoute(date, options, number)

   res.send('<h1 style="color:red;"> output = '+output+'</h1> <br> <h1 style="color:blue;">input = ' +date+'</h1> <br> <h1 style="color:blue;"> Number n = '+ number + '</h1> <br> <h1 style="color:blue;"> option = ' + options + '</h1>');

});

module.exports = router;