public class Person{


  public static void main(String[] args){

      Person p = new Person();

      p.getInitials("jake  holdom");

  }

  public String getInitials(String fullName) {
    String result = "";
    String[] words = fullName.split(" +");

    for (int i = 0; i < words.length; i++) {
      String nextInitial = "" + words[i].charAt(0);
      result = result + nextInitial.toUpperCase();
    }
    return result;
  }

}
