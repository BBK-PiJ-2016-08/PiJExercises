public class Fibonacci {


  public static void main(String[] args){
      Fibonacci fibo = new Fibonacci();

      fibo.begin();


  }

  public void begin(){

      System.out.println(fib(14));
      System.out.println(fibIterative(14));

  }
  public int fibIterative(int n){

        int result = 1;
        int fiboOne = 1;
        int fiboTwo = 1;


        for (int i = 2; i < n; i++){

            result = fiboOne + fiboTwo;
            fiboOne = fiboTwo;
            fiboTwo = result;
        }
        return result;



  }

  public int fib(int n) {
    if ((n == 1) || (n == 2)) {
      return 1;
    } else {
      int result = fib(n-1) + fib(n-2); // method calls itself
      return result;
    }
  }

}
