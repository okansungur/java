import javax.ejb.*;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import java.util.Properties;
public class merhabaclient{
	public static void main(String args[]){
		System.setProperty("java.naming.factory.initial",
			"org.jnp.interfaces.NamingContextFactory");
System.setProperty("java.naming.provider.url","localhost:1099");
		try{
			InitialContext jndiContext=new InitialContext();
			System.out.println("Context yazilsin");
			merhabaev ref=(merhabaev)jndiContext.lookup("merhaba");
			System.out.println("referans tamam");
	merhabaev home=(merhabaev)PortableRemoteObject.narrow(ref,merhabaev.class);
			merhaba alo=home.create();
			System.out.println(alo.selam());
			alo.remove();
			}catch(Exception e){System.out.println("hatttaa!!");
			e.printStackTrace();}
			}
	}
