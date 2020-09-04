const path = require('path');
const express = require('express');
const router = express.Router();
const task = require('./components/tasks');



router.get('/', (req, res,next)=>{
   res.sendFile(path.join(__dirname, 'views', 'index.html'));
});



router.post('/post-datequery', (req, res, next)=>{

   var {date,options,number} = req.body;
   var pattern =/^([0-9]{4})\-([0-9]{2})\-([0-9]{2})$/;

   if(!pattern.test(date)){
      res.send("<h1> Invalid date </h1>");
   }
   
   var output = task.taskRoute(date, options, number)
   try{
      output = output.toDateString()
   }
   catch{}

   res.send(`<h1 style="color:red;"> output = ${output} </h1> <br> <h1 style="color:blue;">input =  ${date} </h1> <br> <h1 style="color:blue;"> Number n = ${number} </h1> <br> <h1 style="color:blue;"> option = ${options} </h1>`);
});



module.exports = router;