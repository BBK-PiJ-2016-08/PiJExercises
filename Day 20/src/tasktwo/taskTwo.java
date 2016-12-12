package tasktwo;

import java.util.Arrays;
import java.util.List;
/**
 * Created by jakeholdom on 07/12/2016.
 */
public class taskTwo {


    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        double result = numbers
                .stream().parallel()
                .map(a -> a * 2.0)
                .reduce(1.0, (a,b) -> a * b);

        System.out.println(result);


    }

}
