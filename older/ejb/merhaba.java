import javax.ejb.*;
import java.rmi.RemoteException;
import java.rmi.Remote;
//arayuzum
public interface merhaba extends EJBObject{
	public String selam() throws java.rmi.RemoteException;
}
