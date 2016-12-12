package versionone;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(1, "green"));
        apples.add(new Apple(2, "red"));
        apples.add(new Apple(43, "green"))
        apples.add(new Apple(52, "brown"));

        List<Apple> result = m.filterGreenApples(apples);
        System.out.println(Arrays.asList(result));
        result = m.filterGreenApples(apples, "green");

        System.out.println(Arrays.asList(result));
    }

    public List<Apple> filterGreenApples(List<Apple> apples) {
        List<Apple> filteredList = new ArrayList<>();
        for (Apple apple: apples) {
            if (apples.getColour().equals("green")) {
                filteredList.add(apple);
            }
        }
        return filteredList;
    }

    public List<Apple> filterByColour(List<Apple> apples, String colour){
        List<Apple> filteredList = new ArrayList<>();
        for (Apple apple: apples) {
            if (apples.getColour().equals(colour)) {
                filteredList.add(apple);
            }


        }
        return filteredList;

    }
}
