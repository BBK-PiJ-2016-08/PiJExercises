class Rectangle {
	Point upLeft;
	Point downRight;
}
class Point {
	double x;
	double y;
}



println "Where is the top of the rectangle?"
str = System.console().readLine();
double top = Double.parseDouble(str);
println "Where is the bottom of the rectangle?"
str = System.console().readLine();
double bottom = Double.parseDouble(str);
println "Where is the left of the rectangle?"
str = System.console().readLine();
double left = Double.parseDouble(str);
println "Where is the right of the rectangle?"
str = System.console().readLine();
double right = Double.parseDouble(str);


//main logic
Point upLeft = new Point();
upLeft.x = left;
upLeft.y = top;
Point downRight = new Point();
downRight.x = right
downRight.y = bottom


//Create the rectangle

Rectangle myRectangle = new Rectangle()
myRectangle.upLeft = upLeft
myRectangle.downRight = downRight

//calculate perimeter and area

double height = myRectangle.upLeft.y - myRectangle.downRight.y
double breadth = myRectangle.downRight.x - myRectangle.upLeft.x
double area = height * breadth
double perimeter = 2 * height + 2 * breadth

println "The area of the rectangle is " + area
println "The perimeter of the rectangle is " + perimeter