
import java.rmi.Remote;


public interface ChatServerInterface extends Remote {

    public  void tellOthers(String msg) throws java.rmi.RemoteException;

    public  void register(ChatClientInterface clientRef) throws java.rmi.RemoteException;

    public  void unRegister(ChatClientInterface clientRef) throws java.rmi.RemoteException;

}
