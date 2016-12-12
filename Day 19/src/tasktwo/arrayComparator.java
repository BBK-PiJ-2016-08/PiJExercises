package tasktwo;

import java.lang.Comparator;

public class ArrayComparator implements Comparator<String>{


    @Override
    public int Compare(String s1, String s2){

        return s1.length() - s2.length();
    }

}
