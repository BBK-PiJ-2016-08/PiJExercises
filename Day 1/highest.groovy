String str
int i, i2
i2 = 0
Boolean finished = false

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
}
println "the highest number was " + i2
 

