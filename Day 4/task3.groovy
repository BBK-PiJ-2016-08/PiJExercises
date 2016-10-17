class Power{
	int base;
	int exponent;
}

Power myPower = new Power()

myPower.base = 2
myPower.exponent = 4

void calculate(int b, int e){
	int result
	
	for(int i = 1; i <= e; i++){
		result *= b
	}
	
	//result = Math.pow(b, e)
	
	println "result = " + result
}

calculate(myPower.base, myPower.exponent)

