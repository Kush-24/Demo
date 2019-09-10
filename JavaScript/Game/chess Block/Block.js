var can=document.getElementById("canvas");
var box=can.getContext("2d");

function drawBoard(){
    
var row=1,col=1;
for(let i=0;i<8;i++)
{
    const x=70,y=70;
for(let j=0;j<8;j++)
{
    if(row%2==0)
    {
        if(col%2==1)
        {
        box.fillStyle="white";
        box.fillRect(j*x,i*y,70,70);
        }
    else
    {
        box.fillStyle="black";
        box.fillRect(j*x,i*y,70,70);
    }
        col++;
    }
    else{
        if(col%2==1)
        {
        box.fillStyle="black";
        box.fillRect(j*x,i*y,70,70);
        }
    else
    {
        box.fillStyle="white";
        box.fillRect(j*x,i*y,70,70);
    }
        col++;
        
    }
    box.fillStyle="red";
    box.strokeRect(j*x,i*y,70,70);
}
   row++;
}
}
drawBoard();
