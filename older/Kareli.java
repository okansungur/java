import java.awt.*;
import java.awt.event.*;

public class Kareli extends Frame implements ActionListener{
       Button b1;
       Thread t1;
       int w,h;
       int fw,fh;
       int x,y;

       public Kareli(){
              super("denemem");
              this.setLayout(new FlowLayout());
              b1=new Button("baþlat");
              b1.addActionListener(this);
              add(b1);
              t1=new Thread();
              }
       public void actionPerformed(ActionEvent ae){

              if(ae.getSource()==b1){
                Graphics g=this.getGraphics();
                g.clearRect(0,0,fw,fh);
                fw=this.getWidth();
                fh=this.getHeight();
                x=fw/2;y=fh/2;
                w=0;h=0;
                try{
                    for(w=0;w<fw;w+=4){
                    g.setColor(Color.red);
                    g.drawRect(x,y,w,h);
                    h+=4;
                    x-=2;
                    y-=2;
                    t1.sleep(50);
                    }
                }
                catch(Exception e){}
                }
              }
       public static void main(String args[]){
       Kareli k1=new Kareli();
       k1.setSize(400,400);
       k1.setVisible(true);
       }

       }