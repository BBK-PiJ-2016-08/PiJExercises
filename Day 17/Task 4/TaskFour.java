
import java.util.Scanner;

public class TaskFour implements Runnable {
    private int ID = -1;
    private int runTime = 0;

    public TaskFour(int id, int runTime) {
        this.ID = id;
        this.runTime = runTime;
    }

    public void run(){
        try {
            Thread.sleep(this.runTime);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Finished tasks " + this.ID + ": " + this.runTime);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for (int i = 0;i < 10 ;i++) {
            int runTime = scan.nextInt();
            Runnable r = new TaskFour(i, runTime);
            Thread t = new Thread(r);
            t.start();
        }
    }


} // END of class
