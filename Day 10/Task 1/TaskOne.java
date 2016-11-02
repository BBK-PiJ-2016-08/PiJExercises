public class TaskOne {

  public static void main(String[] args){

      TaskOne tsk = new TaskOne();

      tsk.launcher();

  }


  public void launcher(){

    printNumbers(6);

  }



  private void printNumbers(int n) {
  	if (n <= 0) {
  	  return;
  	}
  	System.out.println(n);
  	printNumbers(n-2);
  	printNumbers(n-3);
  	System.out.println(n);
  }


}
