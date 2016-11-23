import java.io.*;

public class TaskThree{
    public static void main(String[] args) throws IOException{
        TaskThree myDir = new TaskThree();
        for(String str : args){
            File file = new File(str);
            if(myDir.ifFileExists(file)){
                myDir.showContentsofFile(file);
            }
            else {
                System.out.println("File doesn't exist");
            }

        }

    }

    public boolean ifFileExists(File file) throws IOException{
        return file.exists();
    }
    public void showContentsofFile(File file) throws IOException{

        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while((line = in.readLine()) != null){
            //line = in.readLine();
            System.out.println(line);
        }
    }

}
