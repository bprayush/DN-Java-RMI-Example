import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            String ip = "rmi://localhost:8000/strings";
            StringInterface stub = new StringRemoteClass();
            LocateRegistry.createRegistry(8000);
            Naming.rebind(ip, stub);
            System.out.println("Starting server at: " + ip);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}