var WIDTH = 400;
var HEIGHT = 400;
setSize(WIDTH, HEIGHT);

var WINNING_LINE_WIDTH = 10;
var WINNING_LINE_COLOR = Color.red;
var turn =1;
var gameBoard = [['a','b','c'],['d','e','f'],['g','h','i']];
function handleClick(e){
    var y =getRowForClick(e.getY());
    var x =getColForClick(e.getX());
    if(gameBoard[y][x] == 'x' || gameBoard[y][x] =='o'){}else{
        if(turn %2==0){
            drawX(x,y);
            gameBoard[y][x]='x';
            turn+=1;
        } else if(turn%2==1){
            drawO(x,y);
            gameBoard[y][x]='o';
            turn+=1;
        }
    }
    if(winnerInRow(gameBoard[0])){
        var line = new Line(0,50,500,50);
        line.setColor(Color.red);
        line.setLineWidth(10);
        add(line);
    }
    if(winnerInRow(gameBoard[1])){
        var line = new Line(0,200,500,200);
        line.setColor(Color.red);
        line.setLineWidth(10);
        add(line);
    }
    if(winnerInRow(gameBoard[2])){
        var line = new Line(0,350,500,350);
        line.setColor(Color.red);
        line.setLineWidth(10);
        add(line);
    }
    if(winnerInCol(0)){
        var line = new Line(100,0,100,400);
        line.setColor(Color.red);
        line.setLineWidth(10);
        add(line);
    }
    if(winnerInCol(1)){
        var line = new Line(200,0,200,400);
        line.setColor(Color.red);
        line.setLineWidth(10);
        add(line);
    }
    if(winnerInCol(2)){
        var line = new Line(350,0,350,400);
        line.setColor(Color.red);
        line.setLineWidth(10);
        add(line);
    }
    if(winnerInDownDiagonal()){
        var line = new Line(0,0,400,400);
        line.setColor(Color.red);
        line.setLineWidth(10);
        add(line);
    }
    if(winnerInUpDiagonal()){
        var line = new Line(400,0,0,400);
        line.setColor(Color.red);
        line.setLineWidth(10);
        add(line);
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
            x = 50;
            break;
        case 1:
            x = 200;
            break;
        case 2:
            x = 350;
            break;
    }
    switch(col){
        case 0:
            y = 50;
            break;
        case 1:
            y = 200;
            break;
        case 2:
            y = 350;
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
            x = 50;
            break;
        case 1:
            x = 200;
            break;
        case 2:
            x = 350;
            break;
    }
    switch(col){
        case 0:
            y = 50;
            break;
        case 1:
            y = 200;
            break;
        case 2:
            y = 350;
            break;
    }
    var txt = new Text("O","30pt Arial");
    txt.setPosition(x,y);
    add(txt);
}
function winnerInRow(row){
    if(row[0]==row[1] && row[1]===row[2]){
        return true;
    } else {
        return false;
    }
}
function winnerInCol(col){
    if(gameBoard[0][col]==gameBoard[1][col]&&gameBoard[1][col]==gameBoard[2][col]){
        return true;
    } else {
        return false;
    }
}
function winnerInDownDiagonal(){
    if(gameBoard[0][0]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[2][2]){
        return true;
    } else {
        return false;
    }
}
function winnerInUpDiagonal(){
    if(gameBoard[2][0]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[0][2]){
        return true;
    } else {
        return false;
    }
}


function start(){
	var line1 = new Line(getWidth()/3,0,getWidth()/3,500);
	line1.setColor(Color.black);
	line1.setLineWidth(10);
	add(line1);
	var line2 = new Line(2*getWidth()/3,0,2*getWidth()/3,500);
	line2.setColor(Color.black);
	line2.setLineWidth(10);
	add(line2);
	var line3 = new Line(0,getHeight()/3,500,getHeight()/3);
	line3.setColor(Color.black);
	line3.setLineWidth(10);
	add(line3);
	var line4 = new Line(0,2*getHeight()/3,500,2*getHeight()/3);
	line4.setColor(Color.black);
	line4.setLineWidth(10);
	add(line4);
	mouseClickMethod(handleClick);
}
