import java.io.*;
import java.util.Arrays;


public class MakeDir{
    public static void main(String[] args) {

        //String name = Arrays.toString(args);
        //System.out.println(name);
        MakeDir myDir = new MakeDir();
        for(String str : args){
            myDir.createDir(str);
            System.out.println(str);

        }
    }

    public void createDir(String file){
        File newFile = new File(file);
        newFile.mkdir();
    }


}
