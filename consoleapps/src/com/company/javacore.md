#

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
