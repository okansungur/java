import java.io.File;
import org.w3c.dom.*; 
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException; 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
public class kurarayuz extends JFrame implements ItemListener{
	Container cont;
	JComboBox parra;
	boolean bosalt=false;
	JTextField paradegeri;
	Vector v=new Vector();
	Vector v2=new Vector();
	public kurarayuz(){
	cont=this.getContentPane();	
	cont.setLayout(new FlowLayout());	
	git();
	parra=new JComboBox(v);
	parra.addItemListener(this);
	paradegeri=new JTextField("",9);
	
	cont.add(paradegeri);
	cont.add(parra);

	}
		
	public void git(){
	Element ilkeleman;
 Element ilkad;
try {
DocumentBuilderFactory fabrika = DocumentBuilderFactory.newInstance();
DocumentBuilder dokuman = fabrika.newDocumentBuilder();
//Document doc = docBuilder.parse ("http://192.168.0.19//book.xml");
Document doc = dokuman.parse (new File("kur.xml"));
//Document doc = dokuman.parse ("http://www.tcmb.gov.tr/kurlar/today.xml");
//http://www.tcmb.gov.tr/kurlar/today.xml
//doc.getDocumentElement ().normalize ();
NodeList kisisayi = doc.getElementsByTagName("Currency");

for (int i1 = 0; i1<kisisayi.getLength(); i1++) {
	NodeList ss=kisisayi.item(i1).getChildNodes();
{
//System.out.println (ss.item(1).getFirstChild());
v.add(ss.item(1).getFirstChild());


}
//System.out.println (ss1.item(i).getFirstChild());
}

}catch (Exception ex) {
ex.printStackTrace();
}	
}
	
	
	
public void itemStateChanged(ItemEvent ie){
	paradegeri.setText("");
	String deger=parra.getSelectedItem().toString();
	try {
DocumentBuilderFactory fabrika = DocumentBuilderFactory.newInstance();
DocumentBuilder dokuman = fabrika.newDocumentBuilder();
Document doc = dokuman.parse (new File("kur.xml"));
NodeList kisisayi = doc.getElementsByTagName("Currency");

for (int i1 = 0; i1<kisisayi.getLength(); i1++) {
	NodeList ss=kisisayi.item(i1).getChildNodes();
{
	
if(ss.item(4)!=null&&ss.item(1).getFirstChild().toString().equals(deger)&&ss.item(4).getFirstChild()!=null){
	paradegeri.setText(ss.item(4).getFirstChild().toString());
	
	}



}

}

}catch (Exception ex) {
	
ex.printStackTrace();



}
	
	
	
if(paradegeri.getText().equals("")){
	paradegeri.setText("deger-yok");
	}	
	
	
	}	
	
	
public static void main (String argv []){
kurarayuz dene=new kurarayuz();
dene.setSize(400,400);
dene.setVisible(true);

 
}
}
