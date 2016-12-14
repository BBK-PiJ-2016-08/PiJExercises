package taskfour;



import java.net.MalformedURLException;
import java.nio.file.Paths;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.nio.file.Path;



/**
 * Created by jakeholdom on 14/12/2016.
 */
public class RemoteClient{

    public static void main(String[] args) {

        RemoteClient client = new RemoteClient();
        client.clientLaunch();


    }

    public void clientLaunch() {

        try {
            String registryAddress = "127.0.0.1";
            Remote service = Naming.lookup("//" + registryAddress + ":1099/echo");
            RemoteService remoteService = (RemoteService) service;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type the path of the file and file name");
            String strPath = scanner.next();
            String result = remoteService.getPath(strPath);
            System.out.println("Result = " + result);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
    }


}
