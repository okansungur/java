import java.awt.*;
import java.awt.event.*;
class threds extends Frame implements Runnable,ActionListener{
	int i=0;
	int x;
	int y=100;
	int ana;	
	Button b,b1;	
	Thread t1,t2;

	public threds(){
		this.setLayout(new FlowLayout());
		b=new Button("b_için");
		b1=new Button("a_için");
		b.addActionListener(this);
		b1.addActionListener(this);
		add(b);add(b1);
		
		t1=new Thread(this,"aaa");
		t2=new Thread(this,"bbb");
		
	//	t1.start();
		
		
		
		
		}
public  void run(){
	System.out.println ("run");
	
	try {
		while (x<1000){
			System.out.println (Thread.currentThread().getName());
				Graphics g=this.getGraphics();
				g.setColor(Color.red);
		g.fillOval(x,y,80,80);
			
			x=x+10;
			if(x>700){x=0;}
		Thread.sleep(50);
		repaint();
			}
		
    }
    catch (Exception ex) {
    	ex.printStackTrace();
    }
	
	} 
		


public void actionPerformed(ActionEvent ae){

	if(ae.getSource()==b){
	
t2.start();

}


	if(ae.getSource()==b1){



t2.stop();
			
	 
	  

}
	
	
	
	}
	
	
	
	
public void paint(Graphics go){
	go.setColor(Color.green);
	go.fillOval(ana,100,80,80);
	try {
	
	System.out.println (Thread.currentThread().getName());
		Thread.sleep(100);
		if(ana>700){ana=0;}
		ana=ana+10;
		repaint();
    }
    catch (Exception ex) {
    }
	
	
	}	

public static void main(String args[]){
	threds dene=new threds();
	dene.setSize(400,400);
	dene.setVisible(true);
	
	
	}
}

