double num1, num2, answer

//println args
//println args.length



num1 = Double.parseDouble(args[0])
num2 = Double.parseDouble(args[2])



//int val = Integer.parseInt(args[1])

//println "val is = " + args[1]

switch (args[1]){

	case "/" :
		answer = num1 / num2
		break
	case "x" :
		answer = num1 * num2
		break
	case "-" :
		answer = num1 - num2
		break
	case "+" :
		answer = num1 + num2
		break
}

println "The answer is " + answer
