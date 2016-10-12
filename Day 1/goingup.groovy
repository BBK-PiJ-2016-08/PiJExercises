String str
int i, i2
i2 = 0
Boolean finished = false
Boolean up = true

while (!finished){
println "Please enter some numbers and finish with -1"
str = System.console().readLine()
i = Integer.parseInt(str)

if (i <= -1){
	finished = true
}
else if (i > i2){
	i2 = i

}
else if (i < i2){
	up = false
}
}
println "the highest number was " + i2

if (up == true){
	println "the numbers also went up consistently"
}
else{
	println "the numbers did not go up consistently"
}
 



