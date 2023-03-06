import java.awt.*;
import java.awt.event.*;
class top extends Frame implements Runnable {
	int vx,vy;
	Dimension dim;//***************
	Graphics go;//*****************
		Image resim=null;//***************
		int random,random1;
		Thread t;
		boolean a,b;
	public top(){
	t=new Thread(this,"sads");
	t.start();
		this.setSize(880,700);
		this.setVisible(true);
		}
	public void kontrol(){
		random=(int)Math.round(Math.random()*10);		
		//random1=(int)Math.round(Math.random()*10);		
		if(a==false){vx+=random;}
		if(a==true){vx-=random;}
		if(b==false){vy+=random;}
		if(b==true){vy-=random;}
		}
	public void run(){
		while (true){
			try {
		System.out.println (random);	
			if(vx>800){a=true;}
			if(vx<0){a=false;}
			if(vy>600){b=true;}
			if(vy<0){b=false;}
			kontrol();
			Thread.sleep(10);
			repaint();
		    }
		    catch (Exception ex) {
		    }}		
		}
		public void paint(Graphics g){
		  Dimension d = getSize();
	      resim = createImage(d.width, d.height);
    	  go = resim.getGraphics();
    			go.setColor(Color.red);
				go.fillRect(0, 0, d.width, d.height);
			    go.setColor(Color.blue);
    			go.fillOval(vx,vy,100,100);
   		  g.drawImage(resim,0,0,this);	 	
		}
		public void update(Graphics g){
			paint(g);
		}

	public static void main(String args[]){
		top ornek=new top();
		}}