
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ChatClientImplementation extends UnicastRemoteObject implements ChatClientInterface {

    private String name;
    private FrmClient fc;

    public ChatClientImplementation(String name,FrmClient c) throws RemoteException {
        this.name = name;
        fc = c;
    }

    public void receive(String msg) {
        fc.appendOnTA(msg);
    }

    public String getClientName() {
        return name;
    }
}
