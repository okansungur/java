#### Input-Output & JNI

```

import java.io.*;

class dosyabol{
	FileInputStream fis;
	FileOutputStream fos;
	
	public dosyabol(){		
		try {
			fis = new FileInputStream("okan.txt");
			int boyut = fis.available();
			System.out.println (boyut+"");
			int parca_boyutu = boyut / 3;  
			for (int i = 0; i<boyut; i++) {				
				if( i%parca_boyutu == 0){
					fos = new FileOutputStream(i+".txt");
					
				}
					int okunan = fis.read();
				fos.write(  okunan  );
			
		    }
		    
		   fos.close(); fis.close();
	    }
	    catch (Exception ex) {
	    }	
	   
	    		
	}
	public static void main(String args[]){
		new dosyabol();
	}
}

```



```

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
             dosya.add("Çık");
             ta1=new TextArea();
             add(ta1);
             }
      public void actionPerformed(ActionEvent ae){
             if(ae.getActionCommand()=="Çık")System.exit(0);
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
			 //acarken yeni bir metod ekleyip açmamız gerek yoksa sonuna ekliyor
      public static void main(String args[]){
             Raf r1=new Raf();
             r1.setSize(400,400);
             r1.setVisible(true);
             }

      }


*******************************************************************
if(file.length()>0){
			
		raf.seek(file.length()); //imleci gotur sonuna satırın
			//raf.setLength(0); //sayfa basindan baslar yazmaya
			raf.write(b);		
		System.out.println ("ici");
				
			
					
			}else{
	System.out.println ("girmedi");
		raf.write(b);
		}




```


```
Header için
class okan{
  public native String merhaba();
  static {
    System.loadLibrary("okan"); //librarimiz
  }
}


public class okan{
  public native String merhaba(String adınıyaz);
  static {
    System.loadLibrary("okan"); //librarimiz  }}
javah okan
Dotnet  
C++ win32 projects (windowdan—application dll dosyası olustur)
Proje adı=okan
Olusturulan header dosyasını aynı folderdan add sources ile ilave et(okan.h);
Okan.cppye ilave et
#include "okan.h" 
JNIEXPORT jstring JNICALL Java_okan_merhaba
  (JNIEnv *env, jobject obj) {
    return  env->NewStringUTF("Merhabalar C'den");
}
debug et olusan dlli al ve okan.classda olacak
tools options c++ directories include files sdk14 include win32 yol goster
vee
class alo{
  public static void main(String[] args) {
okan ok=new okan();
System.out.println (ok.merhaba());
    }}
class alo{
  public static void main(String[] args) {
okan ok=new okan();
System.out.println (ok.merhaba("fatma"));
    }}
Okan.cpp
#include "okan.h" 
JNIEXPORT jstring  JNICALL Java_okan_merhaba
  (JNIEnv *env, jobject obj,jstring  hh) {

    const char *str = env->GetStringUTFChars(hh,0);
    printf("%s\n", str);
	char buf[100];
	scanf("%s",buf);
	printf("%s\n\n",buf);
    return  env->NewStringUTF("wedwqewqedw");

}
```
