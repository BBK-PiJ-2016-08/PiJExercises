package taskthree;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 * Created by jakeholdom on 14/12/2016.
 */
public class CalcClient{

    public static void main(String[] args) {

        CalcClient client = new CalcClient();
        client.clientLaunch();


    }

    public void clientLaunch() {

        try {
            String registryAddress = "127.0.0.1";
            Remote service = Naming.lookup("//" + registryAddress + ":1099/echo");
            CalcService calcservice = (CalcService) service;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type your first number to be calculated");
            int first = scanner.nextInt();
            System.out.println("Type + for addition, - for subtraction, / for divide, * for multiplication");
            String s = scanner.next();
            System.out.println("Type your second number to be calculated");
            int second = scanner.nextInt();
            Integer result = calcservice.Calculate(first, s, second);
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
