package taskthree;

/**
 * Created by jakeholdom on 14/12/2016.
 */

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcServer extends UnicastRemoteObject implements CalcService {
    public CalcServer() throws RemoteException {
// nothing to initialise for this server, but it is important
// to declare that the constructor throws RemoteException
    }

    @Override
    public Integer Calculate(int first, String s, int second) {

        Integer result = 0;
// This println() is not necessary, but helps verifying whether
// the server has received the call or not on the remote machine
        try {
            if (s.equals("+")) {
                result = first + second;
            }else if (s.equals("-")) {
                result = first - second;
            }else if (s.equals("/")){
                result = first / second;
            }else if (s.equals("*")){
                result = first * second;
            }

        } catch (NullPointerException ex){
            ex.printStackTrace();
        }
        System.out.println("Replied to some client saying ’" + result + "’");
        return result;
    }
}