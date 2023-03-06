import javax.ejb.*;
public class merhababean implements SessionBean{
	public void ejbCreate(){
	System.out.println ("bean create");
	}
	public void ejbRemove(){
	System.out.println ("Removebean");
	}
public void ejbActivate(){
	System.out.println ("Activate--bean");
	}
	public void ejbPassivate(){
	System.out.println ("Passivate--bean");
	}
	public void setSessionContext(SessionContext ctx){
	System.out.println ("Sesion Context set");
	}
	public String selam(){
	System.out.println ("hello");
	return "bu yazi okunacak";
	}
	}
