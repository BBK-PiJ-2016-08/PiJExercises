public class Task1a{

  public static void main(String[] args){

      Task1a tsk = new Task1a();

      System.out.println(tsk.doggyMethod(3));


  }


  public String doggyMethod(int n) {

      if (n <= 0) {
          return "";
      }
      String result = doggyMethod(n-3) + n + doggyMethod(n-2);

      return result;
  }

}
