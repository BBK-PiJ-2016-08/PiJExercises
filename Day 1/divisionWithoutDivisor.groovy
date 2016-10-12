print "Give me the bigger number:"
String str = System.console().readLine()
int biggerNumber = Integer.parseInt(str)
print "Give me the small number: "
str = System.console().readLine()
int smallNumber = Integer.parseInt(str)

int remainder = biggerNumber
int quotient = 0
while (remainder >= smallNumber) {
	remainder = remainder - smallNumber
	quotient = quotient + 1
}
print biggerNumber + " divided by " + smallNumber
println " is " + quotient + ", remainder " + remainder