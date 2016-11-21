import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public Integer num;
    public boolean finished = false;
    public Integer[] list;

    public static void main(String[] args){

        Task3 tsk = new Task3();
        tsk.setArray();

    }

    public void setArray(){


        while(!this.finished){
            try {
                System.out.println("Please enter the size of your array");
                String str = System.console().readLine();
                this.num = Integer.parseInt(str);
                this.list = new Integer[this.num];
                this.finished = true;
            } catch (NullPointerException ex){
                ex.printStackTrace();
            } catch (Exception ex){
                ex.printStackTrace();
            }

        }

        for (int i = 0;i < this.list.length;i++) {

            try {
                System.out.println("Please enter number = " + (i + 1));
                String str = System.console().readLine();
                Integer numIn = Integer.parseInt(str);
                this.list[i] = numIn;
            } catch (NullPointerException ex) {
                ex.printStackTrace();
                i--;
            } catch (Exception ex){
                ex.printStackTrace();
                i--;
            }
        }
        System.out.println("Mean average is = " + printAverage(this.list));
    }

    public int printAverage(Integer[] list){
        try{
            Integer total = 0;

            for (int i = 0;i < list.length;i++) {
                total += list[i];
            }
            Integer result = 0;
            return result = total / list.length;
        }catch (ArithmeticException ex){
            System.out.println("Arithmetic Exception");
        }

        return -1;

    }


}
