// import { name } from './ntc.js';
  
  window.addEventListener("load", function(){
    var text = document.getElementById("text");
    changeText(text);
    window.addEventListener("resize",function(){
        var text = document.getElementById("text");
        changeText(text);
    });
  });

  function changeText(text){
    const style = getComputedStyle(text);
    var font_name = style.fontFamily;
    var font_size = style.fontSize;
    var font_color = style.color;
    font_color = font_color.split('(')[1].split(')')[0].split(',');
    var r = parseInt(font_color[0].trim());
    var g = parseInt(font_color[1].trim());
    var b = parseInt(font_color[2].trim());
    var colorHex = rgbToHex(r,g,b);
    var colorName = ntc.name(colorHex);
    
    text.innerHTML = ""+font_name + " " + font_size + " " + colorName[1];
  }