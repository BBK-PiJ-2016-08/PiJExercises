import java.io.*;

public class TaskOne {


    public static void main(String[] args){

        TaskOne tsk = new TaskOne();

        tsk.getFilesFromDirectory();

    }

    public void getFilesFromDirectory(){

        File files = new File(".");

        String[] fileLists = files.list();
        for(int i = 0; i < fileLists.length; i++){
            System.out.println(fileLists[i]);
        }

    }


}
