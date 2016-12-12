package taskone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
/**
 * Created by jakeholdom on 07/12/2016.
 */
public class FilterDish{

    public static void main(String[] args){

        FilterDish fd = new FilterDish();
        List<Dish> dishes = Dish.menu;

        System.out.println("dishes in list" + Arrays.asList(dishes));

        Stream<Dish> myDishesStream = dishes.stream()
                .filter((d) -> d.getType() == Dish.Type.MEAT)
                .limit(2)
                .map((d) -> new Dish(d.getName(),d.isVegetarian(),d.getCalories(), d.getType()));

        myDishesStream.forEach((a) -> {
            System.out.println(a.getName());
        });

        int count = dishes.stream()
                .map(d -> 1)
                .reduce(0, (a,b) -> a + b);
        System.out.println("Dish count = " + count);




    }



}
