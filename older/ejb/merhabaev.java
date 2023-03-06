import javax.ejb.*;
import java.rmi.RemoteException;
import java.rmi.Remote;
public interface merhabaev extends EJBHome{
merhaba create() throws RemoteException,CreateException;
}
