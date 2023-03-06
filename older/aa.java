import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

class aa extends Frame{
	Thread tt;
	Graphics g;
			public aa(){
			g=this.getGraphics();
	
			setLayout(new FlowLayout());
		 	Thread yeni;

		for (int i = 0; i<19; i++) {
		int	ali	=(int)Math.round(Math.random()*2900)+500;	    
     	new t1(this,ali).start();
      	}
      		for (int i = 0; i<19; i++) {
int	ali1	=(int)Math.round(Math.random()*2000)+500;	    	    
     new t1(this,ali1).start();
      }
      
		
	//	g.setColor(Color.green);
		
		}
		
	
	public static void main(String args[]){
			aa oo=new aa();
			oo.setSize(400,400);
			oo.setVisible(true);
		
		}}
		
	class t1 extends Thread{
		aa alo;
		int er=0;
		int gel;
		int wum;
		public t1(aa orn,int c){
		alo=orn;	
		gel=c;
			wum=(int)Math.round(Math.random()*300);
				System.out.println (wum);
			}
		
		public  void run(){
			while (true){
		try {		
	//alo.getGraphics().clearRect(0,0,500,500);	






alo.getGraphics().fillOval(wum,er,10,10);	

System.out.println (er);
//wait();
	
	//Thread.yield();
	
		sleep(gel);		
			er+=30;

alo.getGraphics().clearRect(wum,er-30,10,10);
mouselistener koy circle buyusun
	
		}
		catch (Exception ex) {   
		    }
		    
if(er>500){
	er=0;
	}		

		
		}//while	
			}
		
		}	