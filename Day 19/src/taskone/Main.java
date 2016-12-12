package taskone;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(1, "green"));
        apples.add(new Apple(2, "red"));
        apples.add(new Apple(43, "green"));
        apples.add(new Apple(160, "brown"));

        List<Apple> result = m.filterApples(apples, new AppleHeavyWeightPredicate());
        System.out.println(Arrays.asList(result));
        result = m.filterApples(apples, new AppleGreenColourPredicate());
        System.out.println(Arrays.asList(result));
        result = m.filterApples(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColour());
            }

        });

        result = m.filterApples(apples, (Apple apple) -> "green".equals(apple.getColour()));
        System.out.println("Green apples in list" + Arrays.asList(result));


        /*List<taskone.Apple> result = m.filterGreenApples(apples);
        System.out.println(Arrays.asList(result));
        result = m.filterByColour(apples, "red");

        System.out.println(Arrays.asList(result));
        result = m.filterByWeightGreaterThan(apples, 40);

        System.out.println(Arrays.asList(result));
        */
    }

    public List<Apple> filterApples(List<Apple> apples, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

/*
    public List<taskone.Apple> filterGreenApples(List<taskone.Apple> apples) {
        List<taskone.Apple> filteredList = new ArrayList<>();
        for (taskone.Apple apple: apples) {
            if (apple.getColour().equals("green")) {
                filteredList.add(apple);
            }
        }
        return filteredList;
    }

    public List<taskone.Apple> filterByColour(List<taskone.Apple> apples, String colour){
        List<taskone.Apple> filteredList = new ArrayList<>();
        for (taskone.Apple apple: apples) {
            if (apple.getColour().equals(colour)) {
                filteredList.add(apple);
            }


        }
        return filteredList;

    }

    public List<taskone.Apple> filterByWeightGreaterThan(List<taskone.Apple> apples, Integer weight) {
        List<taskone.Apple> filteredList = new ArrayList<>();
        for (taskone.Apple apple: apples) {
            if (apple.getWeight() > weight) {
                filteredList.add(apple);
            }
        }
        return filteredList;
    }
    public List<taskone.Apple> filterByWeightLessThan(List<taskone.Apple> apples, Integer weight) {
        List<taskone.Apple> filteredList = new ArrayList<>();
        for (taskone.Apple apple: apples) {
            if (apple.getWeight() < weight) {
                filteredList.add(apple);
            }
        }
        return filteredList;
    }
    public List<taskone.Apple> filterApplesOnEveryAttribute(List<taskone.Apple> apples, Integer weight, String colour, Boolean flag) {
        List<taskone.Apple> filteredList = new ArrayList<>();
        for (taskone.Apple apple: apples) {
            if (apple.getWeight() > weight) {
                filteredList.add(apple);
            }
        }
        return filteredList;
    }
*/
}
