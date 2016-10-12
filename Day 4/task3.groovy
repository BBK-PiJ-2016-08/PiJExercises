class Power{
	int base;
	int exponent;
}

Power myPower = new Power()

myPower.base = 2
myPower.exponent = 4

void calculate(int b, int e){
	int result
	
	result = Math.pow(b, e)
	
	println "result = " + result
}

calculate(myPower.base, myPower.exponent)

