print "Give me a number: "
String str = System.console().readLine()
int number = Integer.parseInt(str)


boolean number_is_prime = true
int divisor = 2
while (divisor < number) {
	if (number % divisor == 0) {
		number_is_prime = false;
	}
	divisor = divisor + 1
}
if (number_is_prime) {
	print "Number " + number + " is prime"
} else {
	print "Number " + number + " is not prime"
}