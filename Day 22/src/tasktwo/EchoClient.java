package tasktwo;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;

/**
 * Created by jakeholdom on 14/12/2016.
 */
public class EchoClient {


    public static void main(String[] args) {

        EchoClient client = new EchoClient();
        client.clientLaunch();


    }

    public void clientLaunch() {

        try {
            System.out.println("Type anything and press Enter to get time/date");
            String registryAddress = "127.0.0.1";
            Remote service = Naming.lookup("//" + registryAddress + ":1099/echo");
            EchoService echoService = (EchoService) service;
            Scanner scanner = new Scanner(System.in);
            String receivedEcho = echoService.echo(scanner.next());
            System.out.println(receivedEcho);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
    }


}

