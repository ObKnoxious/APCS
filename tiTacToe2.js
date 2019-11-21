var WIDTH = 400;
var HEIGHT = 400;
setSize(WIDTH, HEIGHT);

var WINNING_LINE_WIDTH = 10;
var WINNING_LINE_COLOR = Color.red;
var turn =1;
function handleClick(e){
    var y =getRowForClick(e.getY());
    var x =getColForClick(e.getX());
    if(turn %2==0){
        drawX(x,y);
        turn+=1;
    } else if(turn%2==1){
        drawO(x,y);
        turn+=1;
    }
}
function getRowForClick(y){
    if(y<= getHeight()/3){
        return 0;
    } else if(y <= 2*getHeight()/3){
        return 1;
    } else {
        return 2;
    }
}

function getColForClick(x){
    if(x<= getWidth()/3){
        return 0;
    } else if(x <= 2*getWidth()/3){
        return 1;
    } else {
        return 2;
    }
}
function drawX(row, col){
    var x=50;
    var y=50;
    switch(row){
        case 0:
            x = 100;
            break;
        case 1:
            x = 200;
            break;
        case 2:
            x = 300;
            break;
    }
    switch(col){
        case 0:
            y = 100;
            break;
        case 1:
            y = 200;
            break;
        case 2:
            y = 300;
            break;
    }
    var txt = new Text("X","30pt Arial");
    txt.setPosition(x,y);
    add(txt);
}
function drawO(row, col){
   var x=50;
    var y=50;
    switch(row){
        case 0:
            x = 100;
            break;
        case 1:
            x = 200;
            break;
        case 2:
            x = 300;
            break;
    }
    switch(col){
        case 0:
            y = 100;
            break;
        case 1:
            y = 200;
            break;
        case 2:
            y = 300;
            break;
    }
    var txt = new Text("O","30pt Arial");
    txt.setPosition(x,y);
    add(txt);
}

function start(){
    mouseClickMethod(handleClick);
}
