import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Raf extends Frame implements ActionListener{
      FileDialog fd,fd2;
      MenuBar mb;
      File file1;
      TextArea ta1;
      RandomAccessFile raf1,raf2;
      public Raf(){
             super("asd");
             this.addWindowListener(new WindowAdapter(){
                    public void windowClosing(WindowEvent we){
                           System.exit(0);
                           }
                    });
             fd=new FileDialog(this,"açma",FileDialog.LOAD);
             fd2=new FileDialog(this,"kaydetme",FileDialog.SAVE);
             mb=new MenuBar();
             this.setMenuBar(mb);
             Menu dosya=new Menu("DOSYA");
             mb.add(dosya);
             dosya.addActionListener(this);
             dosya.add("Aç");
             dosya.add("Kapa");
             dosya.add("Kaydet");
             dosya.add("Çýk");
             ta1=new TextArea();
             add(ta1);
             }
      public void actionPerformed(ActionEvent ae){
             if(ae.getActionCommand()=="Çýk")System.exit(0);
             if(ae.getActionCommand()=="Aç"){
                    fd.setVisible(true);
                    file1=new File(fd.getDirectory()+fd.getFile());
                    try{
                    raf1=new RandomAccessFile(file1,"r");
                    ta1.setText("");

                    while(raf1.getFilePointer()<raf1.length()){
                        ta1.append(raf1.readLine());
                        ta1.append("\n");

                        }
                    raf1.close();
                    }catch(Exception e){System.out.print(e.toString());}
                    }
             if(ae.getActionCommand()=="Kaydet"){
             
		
		
                    fd2.setVisible(true);
                    file1=new File(fd2.getDirectory()+fd2.getFile());
                    
                    try{
                    	raf2=new RandomAccessFile(file1,"rw");
                    	raf2.setLength(0);

                        
                     while(raf2.getFilePointer()<raf2.length()){
                        }
                        byte b[]=ta1.getText().getBytes();
                        raf2.write(b);
                    }catch(Exception e){System.out.print("HATTTA");}
                    }
             }
			 //acarken yeni bir metod ekleyip açmamýz gerek yoksa sonuna ekliyor
      public static void main(String args[]){
             Raf r1=new Raf();
             r1.setSize(400,400);
             r1.setVisible(true);
             }

      }


//weellll  imleci gonder
if(file.length()>0){
			
		raf.seek(file.length()); //imleci gotur sonuna satýrýn
			//raf.setLength(0); //sayfa basindan baslar yazmaya
			raf.write(b);		
		System.out.println ("ici");
				
			
					
			}else{
	System.out.println ("girmedi");
		raf.write(b);
		}
