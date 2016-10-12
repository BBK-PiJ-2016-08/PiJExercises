String str
boolean isFinished = false
boolean isConsecutive = true
boolean isFirstNum = true
int input, prev

println "Please enter some numbers and finish with -1"

while(!isFinished){
	str = System.console().readLine()
	input = Integer.parseInt(str)
	
	if (input == -1){
		isFinished = true
	}else{
		if (isFirstNum == true){
			prev = input
			isFirstNum = false
		}
		int iPlus = prev + 1
		int iMinus = prev - 1	
		if (prev == iPlus || iMinus){
				isConsecutive = true
				prev  = input
			}
			else{
				isConsecutive = false
			}
	}
	

}


if (isConsecutive == true  && input != -1){
	println "the numbers went up consistently"
}else{
	println "the numbers did not go up consistently"
}