double first, second, answer
int choice

println "Calculator"

println ""

println "Please enter your first number of the calculation"

String str = System.console().readLine()
first = Double.parseDouble(str)

println "Please enter your second number of the calculation"

String str2 = System.console().readLine()
second = Double.parseDouble(str2)

println "Please choose which calculation you would like to do with these numbers \n 1 for addition \n 2 for multiplication \n 3 for subtraction \n 4 for division \n 5 to exit "
String str3 = System.console().readLine()
choice = Integer.parseInt(str3)


switch (choice){
	
	case 1:
		answer = first + second
		break;
	case 2:
		answer = first * second
		break;
	case 3:
		answer = first - second
		break;
	case 4:
		answer = first / second
		break;
	case 5:
		println "Bye"
		break;
}
		println "The answer is " + answer