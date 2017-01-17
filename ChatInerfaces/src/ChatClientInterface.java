import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatClientInterface extends Remote{
    void receive(String msg) throws RemoteException;
    String getClientName() throws RemoteException;
}
