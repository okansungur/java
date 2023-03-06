import java.rmi.*;
public class myclient {
	static String hostName ="192.168.1.99:1099";
	public static void main(String args[]){
		try {
			myrem server = (myrem)Naming.lookup("//"+hostName+"/MyRem");
			int n = server.gsayi();
		
	    	System.out.println ("-----------------");
	    	//System.out.println ("Name=" + server.isimal());
	    
		//	System.out.println (server.kos());
		server.veritaban();
	    }
	    catch (Exception ex) {
	    	
	    	System.out.println ("Hata Olustu:" + ex.toString());
	    }}}

