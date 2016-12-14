package taskone;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;


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
            String registryAddress = "127.0.0.1";
            Remote service = Naming.lookup("//" + registryAddress + ":1099/echo");
            EchoService echoService = (EchoService) service;
            String receivedEcho = echoService.echo("Hello!");
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

