public class Factorial {

    private static int resultIte;

    public static void main(String[] args){

        Factorial fact = new Factorial();
        fact.begin();

    }

    private void begin(){

        int answerRec = factorialRecursive(6);
        int answerIte = factorialIterative(6);

        System.out.println(answerRec);
        System.out.println(answerIte);

    }

    private int factorialRecursive(int n){

        if (n == 1){
            return 1;
        } else {

            int result = n * factorialRecursive(n-1);
            return result;

        }
    }

    private int factorialIterative(int n){

      int answer = 1;
      for (int i = 1; i <= n; i++){

          answer *= i;
      }
      return answer;
    }




}
