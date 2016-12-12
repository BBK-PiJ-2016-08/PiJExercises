public class HashUtilities {

  public static int shortHash(int hash){


    int number2 = hash % 1000;

		return Math.abs(number2);

  }

}
