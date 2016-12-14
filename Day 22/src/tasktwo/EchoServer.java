package tasktwo;

/**
 * Created by jakeholdom on 14/12/2016.
 */
import java.util.Date;
import java.text.SimpleDateFormat;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EchoServer extends UnicastRemoteObject implements EchoService {
    public EchoServer() throws RemoteException {
// nothing to initialise for this server, but it is important
// to declare that the constructor throws RemoteException
    }
    @Override
    public String echo(String s) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
        s = sdf.format(new Date());
// This println() is not necessary, but helps verifying whether
// the server has received the call or not on the remote machine
        System.out.println("Replied to some client saying ’" + s + "’");
        return s;
    }
}