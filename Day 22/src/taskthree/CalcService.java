package taskthree;

/**
 * Created by jakeholdom on 14/12/2016.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * An implementation of the echo service.
 */
public interface CalcService extends Remote {
    /**
     * Returns the same string passed as parameter
     * @param s a string
     * @return the same string passed as parameter
     */
    public Integer Calculate(int first, String s, int second) throws RemoteException;
}
