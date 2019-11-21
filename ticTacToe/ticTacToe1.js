var WIDTH = 400;
var HEIGHT = 400;
setSize(WIDTH, HEIGHT);

var WINNING_LINE_WIDTH = 10;
var WINNING_LINE_COLOR = Color.red;

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
}
