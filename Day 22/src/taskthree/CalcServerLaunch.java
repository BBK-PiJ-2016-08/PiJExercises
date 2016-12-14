package taskthree;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by jakeholdom on 14/12/2016.
 */
public class CalcServerLaunch {

    public static void main(String[] args) {

        CalcServerLaunch calcLaunch = new CalcServerLaunch();

        calcLaunch.launch();
    }

    private void launch() {
        try {
            // 1. Create the registry if there is not one
            LocateRegistry.createRegistry(1099);
            // 2. Create the server object

            CalcServer server = new CalcServer();
            // 3. Register (bind) the server object on the registy.
            // The registry may be on a different machine
            String registryAddress = "localhost";
            String registryUrl = "//" + registryAddress + "/";
            String serviceName = "echo";
            Naming.rebind(registryUrl + serviceName, server);


        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }


}

