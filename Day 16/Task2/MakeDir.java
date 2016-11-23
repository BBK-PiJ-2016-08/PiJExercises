import java.io.*;
import java.util.Arrays;


public class MakeDir{
    public static void main(String[] args) {
        
            String name = Arrays.toString(args)
            MakeDir myDir = new MakeDir();
            myDir.createDir(name);
    }

    public void createDir(String file){
        File newFile = new File(file);
        newFile.mkdir();
    }


}
