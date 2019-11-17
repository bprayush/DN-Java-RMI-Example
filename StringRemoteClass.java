import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringRemoteClass extends UnicastRemoteObject implements StringInterface {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public StringRemoteClass() throws RemoteException {
        super();
    }

    @Override
    public String toUpper(String x) throws RemoteException {
        return x.toUpperCase();
    }

    @Override
    public String toLower(String x) throws RemoteException {
        return x.toLowerCase();
    }
}