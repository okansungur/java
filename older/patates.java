class patates implements Runnable{
	int i=0;
	public void run(){
		try{
		while(i<20){
			Thread.sleep(200);
		System.out.println(Thread.currentThread().getName());
		i++;
		
		Thread.yield();
		}
		}
		
		catch(Exception e){}
	}
}
	
public class Patates1 {
	public static void main(String args[]){
		patates p1=new patates();
		Thread t1=new Thread(p1,"patates1");
		Thread t2=new Thread(p1,"patates2");
		//t2.setPriority(t1.getPriority()+1);
		t1.start();t2.start();
		}
	}
ben hasret. sizden per�embe g�n� denizlide java dersi alm��t�m. hocayla g�r��t�m kabul etti ama jbuilder i�ine yap�lan programlar� g�mmek gerekti�ini s�yledi. ayr�ca ben bir�eyler yapmaya �al��t�m ama tam anlam�yla bir hesap makinesi olmad�. sizden alabilir miyim? ayr�ca bana ba�ka form olu�turup oraya bir link atma ya da menulerden o forma uyla�may� anlatabilir misiniz?
 
