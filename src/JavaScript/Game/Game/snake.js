var cvs=document.getElementById("canvas");
var box=cvs.getContext("2d");
var snakeW=10;
var snakeH=10;
var dir="right";

 function drawSnake(x,y){
     box.fillStyle="white";
     box.fillRect(x*snakeW,y*snakeH,snakeW,snakeH);
     box.fillStyle="black";
    box.strokeRect(x*snakeW,y*snakeH,snakeW,snakeH);
}

snake=[]; 
for(let i=3;i>=0;i--)
        snake.push({x:i,y:0})

document.addEventListener("keypress",dirControl);   
function dirControl(e){
    if(e.keyCode==37)
        dir="left";
    else if(e.keyCode==38)
        dir="up";
    else  if(e.keyCode==39)
        dir="right";
    else  if(e.keyCode==40)
        dir="down";
}
function draw(){
    box.clearRect(0,0,cvs.width,cvs.height);
for(let i=0;i<snake.length;i++) 
   drawSnake(snake[i].x,snake[i].y);
    
//Snake head
   var snakeX=snake[0].x;
    var snakeY=snake[0].y;
    
    if(dir=="right")snakeX++;
    else if(dir =="left")snakeX--;
    else if(dir =="up")snakeY--;
    else if(dir =="down") snakeY++;
   snake.pop();  
    
//New head
    var newHead={
        x:snakeX,
        y:snakeY
    }
    snake.unshift(newHead);
}
setInterval(draw,100);



