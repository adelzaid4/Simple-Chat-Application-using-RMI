
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;

public class Server {

    public static void main(String[] args) {
        
        new Server();
    }

    public Server() {
        try {
            
            ChatServerImplementation obj = new ChatServerImplementation();
            Registry reg = LocateRegistry.createRegistry(5050);
            reg.rebind("ChatService", obj);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
