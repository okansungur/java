import java.rmi.*;
import java.rmi.server.*;
import java.sql.*;
import java.util.*;
public class myremimp extends UnicastRemoteObject
 implements myrem {
	static String hostName="localhost";
	static	Vector v=new Vector();
	public myremimp() throws RemoteException{
		super();
		System.out.println ("remotum");
		veritaban();
	}
	public int gsayi() throws RemoteException{
	return (1); }
	public String gchar(int n) throws RemoteException {
	return ("þþþþþþ");}
	public String kos(){return ("okus");		}
	public String isimal(){
		System.out.println ("merhaba okan");
	return ("merhaba okan");
	}
	public  void veritaban(){
		
		try {
			
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection	c=DriverManager.getConnection("jdbc:odbc:okan");
		Statement	s=c.createStatement();
		ResultSet	r=s.executeQuery("select * from alo");
		ResultSetMetaData rsmd=r.getMetaData(); 
		int say=rsmd.getColumnCount();
			for (int i = 1; i<=say; i++) {
				System.out.print (rsmd.getColumnName(i)+"\t \t");
				
			   }
			System.out.println ("\n");
			
			while (r.next()){
	  		for (int i = 1; i<=say; i++) {
	  			System.out.print (r.getString(i));
	  		System.out.print ("\t");	
	  		 }System.out.print ("\n");
	  				}		
			 	    }
	    catch (Exception ex) {
	    	System.out.println ("Hata Olustu:" + ex.toString());}	
		
		
		}
	
	
	
	
public static void main(String args[]){
	try {
		
	System.setSecurityManager(new RMISecurityManager());
	myremimp instance = new myremimp();
			Naming.rebind("//" + myremimp.hostName+"/MyRem",instance);
			System.out.println ("Yes I am registered!");
				
		
		
    }
    catch (Exception ex) {ex.printStackTrace();
    }
	
				
	}}

