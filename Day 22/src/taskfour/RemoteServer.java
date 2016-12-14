package taskfour;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.*;
import java.io.File;
import java.nio.file.Paths;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.io.BufferedReader;
import java.nio.charset.Charset;

import java.util.Scanner;


/**
 * Created by jakeholdom on 14/12/2016.
 */

public class RemoteServer extends UnicastRemoteObject implements RemoteService {
    private BufferedReader reader;

    public RemoteServer() throws RemoteException {
// nothing to initialise for this server, but it is important
// to declare that the constructor throws RemoteException
    }

    public void setUpBufferedReader(String path) throws IOException {
        reader = Files.newBufferedReader(
                Paths.get(path), StandardCharsets.UTF_8);
    }

    public void closeBufferedReader() throws IOException {
        reader.close();
    }

    @Override
    public String getPath(String path) {
// This println() is not necessary, but helps verifying whether
// the server has received the call or not on the remote machine
        String result = "";
        try {

            result = readFile(path);

        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Replied to some client saying ’" + result + "’");
        return result;
    }

    static String readFile(String path) throws IOException {
        File file = new File(path);
        StringBuilder fileContents = new StringBuilder((int)file.length());
        Scanner scanner = new Scanner(file);
        String lineSeparator = System.getProperty("line.separator");

        try {
            while(scanner.hasNextLine()) {
                fileContents.append(scanner.nextLine() + lineSeparator);
            }
            return fileContents.toString();
        } finally {
            scanner.close();
        }
    }
}