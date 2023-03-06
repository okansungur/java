# Thread, paint, regex 

```
public void paint(Graphics g){
	try {
	i=i+1;
if(i==10){i=0;}
	t1.sleep(100);
	repaint();
	}
	catch (Exception ex) {}
tf.setText(String.valueOf(i));
}

//OR

public void paint(Graphics g)
{b1.setText(Integer.toString(s1));
g.drawString(String.valueOf(s1),100,200);
	try{
s1=s1-1;

if (s1<1){
	s1=10;
	}
	t.sleep(1000);
repaint();
}
catch(Exception e){}


***************************************************
setSize(500,500);//constructorun içi
setVisible(true);
	try {
	while (true){//Sonsuz döngü
	i=i-1;//System ile mantığıbul heryere yaz
	l.setText(String.valueOf(i));
	t1.sleep(1000);
	}}
    catch (Exception ex) {}
	}

```



```
import java.awt.*;
import java.awt.event.*;
class cizim extends Frame implements MouseMotionListener{
	int vx,vy;
public cizim(){
	super("resim yap");
this.addMouseMotionListener(this);

	
	
	}

public void mouseMoved(MouseEvent me){
		vx=me.getX();
		vy=me.getY();
		}
	public void mouseDragged(MouseEvent me){
		Graphics g=this.getGraphics();
		g.setColor(Color.red);
		g.drawLine(vx,vy,me.getX(),me.getY());
	vx=me.getX();
		vy=me.getY();
	
		}


public static void main(String args[]){
	cizim ciz=new cizim();
	ciz.setSize(400,400);
	ciz.setVisible(true);
	
	}
}






```


```

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
  class kar extends Frame{
  	Graphics go;
	public kar(){
		setTitle("Kar-Tanesi");
		this.setBackground(Color.black);
		
     	for (int i = 0; i<20;i++) {
			int	tredramdom2	=(int)Math.round(Math.random()*2000)+300;	    	    
     		new t1(this,tredramdom2).start();  	}
     		
     	for (int i = 0; i<19; i++) {
			int	ali1	=(int)Math.round(Math.random()*2000)+100;	    	    
     		new t1(this,ali1).start();
      		}	
      	}	      	
	public void paint(Graphics g){
	g.setColor(Color.red);
	Font f=new Font("Arial",Font.ITALIC,28);
	g.setFont(f);
		g.drawString("YENİYILIMIZ MUTLU OLSUN",10,200);
		for (int i = 0; i<19; i++) {
	
		int	tredramdom1	=(int)Math.round(Math.random()*2900)+500;	    
     	new t1(this,tredramdom1).start();
      	}}
	public static void main(String args[]){
			kar oo=new kar();
			oo.setSize(390,400);
			oo.setVisible(true);
	}}
	class t1 extends Thread{
		kar ornek;
		int er=0;
		Graphics d;
		int gel;
		int wum;
		public t1(kar orn,int c){
		ornek=orn;	
		gel=c;
		wum=(int)Math.round(Math.random()*400);//x koordinatı
		System.out.println (wum);
			}
		//public void al(){}
	public  void run(){
			while (true){
				try {		
				ornek.setForeground(Color.white);
					ornek.getGraphics().fillOval(wum,er,4,4);	
					
					System.out.println (er);
					sleep(gel);		
					er+=20;
					ornek.getGraphics().clearRect(wum,er-20,4,4);
				
				
				}
				catch (Exception ex) {   
				}
				if(er>500){
					er=0;
				}		
				}//while	
				}
				}	

```

```

import java.awt.*;
import java.awt.event.*;

class Halka extends Frame{
	
	Graphics g;
	
	public Halka(){
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){
				g = getGraphics(); g.setColor(Color.white);
				new halkayarat(g , me.getX() , me.getY() ).start();
			} 
		});
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		setBackground(Color.BLUE);
		setTitle("Yagmur Damlasi");
		setSize(600,600);
		setVisible(true);
	}
	
	public static void main(String []args){
		new Halka();
	}
}

class halkayarat extends Thread{
	Graphics ghl;
	int xcoord , ycoord;
	int x_merkez, y_merkez;
	int buyume = 0;
	int x[] = new int[60];
	int y[] = new int[60];
	/////////////////////
	boolean cizme = true;
	boolean gri = false;
	boolean silme = false;
	/////////////////////
	public halkayarat(Graphics disari , int x , int y){
		ghl = disari;
		x_merkez = x;
		y_merkez = y;
	}
	public void run(){
		buyume = 0;
		for (int i = 0; i<60; i++) {
			x[i] = x_merkez - (i*10/2);
			y[i] = y_merkez - (i*10/2);
	    }
		while(true){	
		  if(buyume >= 60) cizme = false;
		  if(buyume >= 40 && buyume < 100) silme = true;
		  else silme = false;
		  if(buyume >= 20 && buyume<80) gri = true;
		  else gri = false;
		  if(cizme == true){ghl.setColor(Color.white); ghl.drawOval(x[buyume],y[buyume],buyume*10,buyume*10);}
		  if(silme == true){ghl.setColor(Color.BLUE);  ghl.drawOval(x[buyume-40],y[buyume-40],(buyume-40)*10,(buyume-40)*10);}
		  if(gri == true){  ghl.setColor(Color.gray);  ghl.drawOval(x[buyume-20],y[buyume-20],(buyume-20)*10,(buyume-20)*10); }
		  if(buyume >= 100) break;
		  try {sleep(100);} catch (Exception ex) { }
		  //System.out.println ("Cizme: " + cizme + " Silme:" + silme + " Gri:" + gri);
		  buyume++;	
		}
	}
}



```



```
import java.awt.*;
import java.util.regex.*;
public class aaa{
public static void main(String args[]){

Pattern pat;
Matcher mat;
boolean find;
String aa="merhaba  java swing";
pat=Pattern.compile("ur");//aranacak karakter veya sözcük // ana metin bu diil 
//pat=Pattern.compile("[a-z]");
//pat=Pattern.compile("e.+?d");// e ile baslayip d ile biten en kisa söz
//pat=Pattern.compile("kan.*?");// kan ile baslayacak neyle bittigi onemli diil
//aa=mat.replaceAll("okan");//kanla baslayanlari okanla degistirir
mat=pat.matcher("okansungur bir iki uç");
//find=mat.matches();
//System.out.println (mat.group());
while (mat.find()){
System.out.println (mat.start());
//-*-*-*-*-*-*-*--
Pattern pat=Pattern.compile("[,.!]");
//virgül nokta ve ünlemle ayrilan tokenlari bulur

String bul[]=pat.split("okan burada!ara.");
for(int i=0;i<bul.lengthI;i++){
out.print(bul[i])
	
}}}


	Pattern pat=Pattern.compile("a"); ///aranacak olan için sadece burası
		Matcher mat=pat.matcher("okan sungur burada");//ana metin burada
		//System.out.println ("orjinal"+bak);
	if (mat.find()){
		
		
		System.out.println (mat.replaceAll("hede"));
		}

```



```
class A implements Runnable {
	
	public void run() {
		
		while (true) {
			System.out.println("A kanalI...");
			
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {}
			
			}}
	}

class B extends Thread {
	
	public void run() {
		while (true) {
			System.out.println("B kanalI...");
			
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {}		
		}}	
}
class Demo {
	
	public static void main(String args[]) {
		
		System.out.println("Main Methodu BasladI..");
		
		Thread t1 = new Thread ( new A() );
		Thread t2 = new B();
		
		t1.start();
		t2.start();
		
		System.out.println("Main Methodu Bitti..");
		
	}	
	
}



```
