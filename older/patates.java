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
ben hasret. sizden perþembe günü denizlide java dersi almýþtým. hocayla görüþtüm kabul etti ama jbuilder içine yapýlan programlarý gömmek gerektiðini söyledi. ayrýca ben birþeyler yapmaya çalýþtým ama tam anlamýyla bir hesap makinesi olmadý. sizden alabilir miyim? ayrýca bana baþka form oluþturup oraya bir link atma ya da menulerden o forma uylaþmayý anlatabilir misiniz?
 
