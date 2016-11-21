import java.util.ArrayList;


public class Task1{

    public static void main (String[] args){

        Task1 tsk = new Task1();

        System.out.println("input = 0");
        tsk.launch(0);
        System.out.println("input = 2");
        tsk.launch(2);
        System.out.println("input = 4");
        tsk.launch(4);
        System.out.println("input = 6");
        tsk.launch(6);


    }

    public void launch(int userInput) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        try {
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }

    }

}
