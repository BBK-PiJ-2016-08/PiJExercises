public class Task1b{

  public static void main(String[] args){

      Task1b tsk = new Task1b();

      System.out.println(tsk.mcCarthy91(95));


  }

  public int mcCarthy91(int n) {

      if (n > 100) {
          System.out.println("if n = " + n);
          return n - 10;
      } else {
          System.out.println("else n = " + n);
          return mcCarthy91(mcCarthy91(n+11));
      }

  }

}
