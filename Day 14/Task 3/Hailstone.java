import java.util.*;

public class Hailstone{

    public List<Integer> list = new ArrayList<Integer>();


    public static void main(String[] args){

        Hailstone hs = new Hailstone();
        hs.start();

    }

    public void start(){


        Hailstone hs = new Hailstone();
        Integer finalNumber = hs.calculateHailstone(463);

        for (Integer item : list ) {
            System.out.println("item = " + item);
        }
        System.out.println(finalNumber);


    }

    public Integer calculateHailstone(Integer n){

        if (n == 1) {
            return n;
        }else {
            if ((n%2)==0) {
                list.add(n /= 2);
                calculateHailstone(n /= 2);
            }
            else{
                list.add((3 * n) + 1);
                calculateHailstone((3 * n) + 1);
            }
        return n;
        }
    }







}
