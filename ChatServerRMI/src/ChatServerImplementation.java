
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class ChatServerImplementation extends UnicastRemoteObject implements ChatServerInterface {

    ArrayList<ChatClientInterface> clientsList = new ArrayList<>();

    public ChatServerImplementation() throws RemoteException {
    }

    public void register(ChatClientInterface clientRef) throws RemoteException{
        clientsList.add(clientRef);
        tellOthers(clientRef.getClientName()+": is Connected!");
    }

    public void unRegister(ChatClientInterface clientRef) {
        clientsList.remove(clientRef);
        System.out.println("Client Removed");
    }

    public void tellOthers(String msg) {
        for (ChatClientInterface client : clientsList) {
            try {
                client.receive(msg);
            } catch (RemoteException e) {
                System.out.println("Message doesn't sent to client");
                e.printStackTrace();
            }
        }
    }
}
