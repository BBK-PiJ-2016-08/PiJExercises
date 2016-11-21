import java.util.ArrayList;
import java.util.List;
public class Task2 {

    public static void main (String[] args){

        Task2 tsk = new Task2();

        tsk.launch();
    }

    public void launch() {

        List<Integer> list = new ArrayList<Integer>();

        try {
            Integer one = null;
            one = 1 + one;
            list.add(1);
            list.add(null);
            list.add(2);
            list.add(3);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
