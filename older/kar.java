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
		g.drawString("YENÝYILIMIZ MUTLU OLSUN",10,200);
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
		wum=(int)Math.round(Math.random()*400);//x koordinatý
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