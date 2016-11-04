public class Palindrome{


    public static void main(String[] args){

        Palindrome pal = new Palindrome();

        boolean first = pal.checkPalindrome("racecar");
        boolean second = pal.checkPalindrome("hello");

        System.out.println("first pal is " + first + " second is " + second);


    }

    private boolean checkPalindrome(String s){

        if(s.length() == 0 || s.length() == 1){
          return true;

        }
        if(s.charAt(0) == s.charAt(s.length()-1)){
          
          return checkPalindrome(s.substring(1, s.length()-1));

        }

        return false;

    }


}
