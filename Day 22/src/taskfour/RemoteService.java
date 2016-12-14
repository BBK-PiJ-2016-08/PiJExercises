package taskfour;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;
import java.nio.file.Path;

/**
 * Created by jakeholdom on 14/12/2016.
 */

public interface RemoteService extends Remote {
    /**
     * Returns the same string passed as parameter
     * @param s a string
     * @return the same string passed as parameter
     */
    public String getPath(String path) throws RemoteException;
}
