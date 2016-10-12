01 class UnitMatrix {
02 int size;
03
04 void setSize(int newSize) {
05 this.size = newSize;
06 }
07
08 void print() {
09 for (int i = 0; i < size; i++) {
10 for (int j = 0; j < size; j++) {
11 if (i == j) {
12 println("1 ");
13 } else {
14 println("0 ");
15 }
16 }
17 println ""
18 }
19 }
20 }

SCOPE -

Variable i: scope is inside the two for loops
Variable j: scope is inside the second loop only
Variable newSize: scope is inside the setSize method only
Variable size: scope is visible throughout the whole class
