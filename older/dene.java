import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
class dene extends JFrame implements ActionListener{
	Connection c;
	ResultSet r;
	Statement s;
	JButton b;
	int sutun;
	DefaultTableModel modelim;
	String tabloisim="";
	JTable t;
	JComboBox tablolar;
	JScrollPane pp;
	public dene(){
		this.getContentPane().setLayout(new FlowLayout());
		b=new JButton("baglan");
		t=new JTable();
	b.addActionListener(this);	
	this.getContentPane().add(b);
	pp=new JScrollPane(t);
	
	this.getContentPane().add(pp);
	tablolar=new JComboBox();
	try {//--tablo isimlerini getiren metodumuz
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con1=DriverManager.getConnection("jdbc:odbc:okan","okans","okans");
		DatabaseMetaData dbmd = con1.getMetaData();
	ResultSet tabloset = dbmd.getTables(null, null, null ,null);
	tablolar.addItem("");
			while(tabloset.next()){	 
				String tablename = tabloset.getString("TABLE_NAME");
        		String tabletype = tabloset.getString("TABLE_TYPE");
        		
        		if(tabletype.equals("TABLE")){
        		tablolar.addItem(tablename);
        		}}
			
			tabloset.close();	con1.close(); 
			 }
    catch (Exception ex) {ex.printStackTrace();
    }
    
		tablolar.addItemListener(new ItemListener(){
	public void itemStateChanged(ItemEvent ie){
		
		tabloisim=tablolar.getSelectedItem().toString();//asagiya tablo ismi gonderdi
		  if(sutun!=0){  //eleman varsa temizlesin yoksa temizlemesin
		  
		modelim.setColumnIdentifiers(new Vector());//column namelerinide temizledik
				
			modelim.getDataVector().removeAllElements(); //tablo sutunlari temizlensin
			t.updateUI();
			
			
			
		 }}});
			
		this.getContentPane().add(tablolar);

		}

	
	public void actionPerformed(ActionEvent ae){


		try {
		
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			c=DriverManager.getConnection("jdbc:odbc:okan","okans","okans");
			s=c.createStatement();
			r = s.executeQuery("select * from "+tabloisim);					
			ResultSetMetaData rsmd = r.getMetaData();
         	 sutun = rsmd.getColumnCount();	
			String sutunismi[]=new String[sutun];
		for (int i1 = 0; i1<sutun; i1++) {
		 sutunismi[i1]=rsmd.getColumnName(i1+1);
		//System.out.println (sutunismi[i1]);
		}

		 modelim = (DefaultTableModel)t.getModel();
		modelim.setColumnIdentifiers(sutunismi);

//System.out.println (sutun);
		Object[] objects = new Object[sutun];//sutun sayisi (diziboyutu)
			while(r.next()){
 				for(int i=0;i<sutun;i++){
				 objects[i]=(Object)r.getString(i+1);//satirlari aldik
					}
	 		modelim.addRow(objects);
			}
				t.setModel(modelim);
		 		s.close();
		 		c.close();
		}
catch (Exception ex) {ex.printStackTrace(); }
}
public static void main(String args[]){
	dene a=new dene();
	a.setSize(500,500);
	a.setVisible(true);
	}}
	
	
	
	
	
	
	
	
	
	
	
	
