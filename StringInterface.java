import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringInterface extends Remote {
    public String toUpper(String x) throws RemoteException;

    public String toLower(String x) throws RemoteException;
}