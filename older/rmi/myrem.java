import java.rmi.*;
import java.sql.*;
//The Remote Interface
public interface myrem extends Remote {
	public int gsayi() throws RemoteException;
	public String gchar(int num) throws RemoteException;
	public String isimal() throws RemoteException;
	public String kos() throws RemoteException,SQLException;
	public  void veritaban() throws	RemoteException,SQLException;
}
