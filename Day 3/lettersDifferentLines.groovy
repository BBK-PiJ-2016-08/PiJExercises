String sentence
int letterLength, noLetter
letterLength = 0
noLetter = 0

String empty = " "

println "Please write a sentence below"


sentence = System.console().readLine()

for (i = 0; i <= sentence.length(); i++){
	if (sentence.substring(i) != empty){
		letterLength = letterLength + 1
	
	}else{
		noLetter = sentence.substring(i)
		noLetter = noLetter + 1
		String str = sentence.substring(letterLength, noLetter)
		println str	
	}
	
	//int x = i + 1
	//String str = sentence.substring(i, x)
	//println str	

}
