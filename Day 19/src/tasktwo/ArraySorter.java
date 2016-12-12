package tasktwo;

import java.util.Arrays;

public class ArraySorter{

    public static void main(String[] args){

        ArraySorter as = new ArraySorter();
        String[] stringArray = {"hi","test","efefefef", "efefefef"};

        Arrays.sort(stringArray, (s1, s2) -> s1.length() - s2.length());

        System.out.println(Arrays.asList(stringArray));
        Arrays.sort(stringArray, (s1, s2) -> s2.length() - s1.length());

        System.out.println(Arrays.asList(stringArray));
        //tasktwo.ArrayPredicate shortistArray = (stringArray) -> {

        //result = m.filterArray(stringArray, (String string) -> string.length() < ;


    }



}
