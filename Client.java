import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println("Usage: java Client <string>");
                return;
            }
            String name = args[0];
            String ip = "rmi://localhost:8000/strings";
            StringInterface stringInterface = (StringInterface) Naming.lookup(ip);
            System.out.println(stringInterface.toLower(name));
            System.out.println(stringInterface.toUpper(name));
        } catch (Exception e) {
            System.out.println("Unable to connect to the server");
        }
    }
}