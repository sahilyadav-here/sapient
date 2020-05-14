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
    text.innerHTML = ""+font_name + " " + font_size + " " + font_color;
  }