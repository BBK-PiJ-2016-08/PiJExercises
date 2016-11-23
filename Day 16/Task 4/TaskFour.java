import java.io.*;

public class TaskFour{

    public static void main(String[] args) throws IOException{

        TaskFour myCopier = new TaskFour();
        for(String str : args){
            String[] files = args;
            //System.out.println(files[0]);
            //System.out.println(files[1]);
            File file = new File(files[0]);
            File file2 = new File(files[1]);
            if(myCopier.ifFileExists(file) && !myCopier.ifFileExists(file2)){
                myCopier.copy(file, file2);
                //myDir.showContentsofFile(files[0]);
            }

        }

    }

    public boolean ifFileExists(File file) throws IOException{
        return file.exists();
    }

    public void copy(File toCopy, File toBeCopied) throws IOException {
        //File file = new File("file.csv");
        PrintWriter out = null;
        try (BufferedReader in = new BufferedReader(new FileReader(toCopy))) {
            out = new PrintWriter(toBeCopied);
            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.println();
                //toBeCopied = toCopy;
                // ... do things with the data here
            }



        } catch (FileNotFoundException ex) {
            System.out.println("File " + toCopy + " does not exist.");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            out.close();
        }

    }
}
