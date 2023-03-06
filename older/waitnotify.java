public class xx implements Runnable
{	Thread t1, t2, t3;
	xx()
	{	t1=new Thread(this, "bir");
		t2=new Thread(this, "iki");	
		t3=new Thread(this, "3");		
		t1.start();
		t2.start();
		t3.start();
		
	}	
	public synchronized void run()
	{	try
		{	for (int i=0;i<5;i++)
			{	if (i==2 && (Thread.currentThread()==t1))
					wait();	
		
		
				if (i==3 && (Thread.currentThread()==t2)){
					wait();	
			
				}
				if (i==1 && (Thread.currentThread()==t3)){
				t2.setPriority(10);
				notifyAll();
					}
				
				
				
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(250);		
			}
		}
		catch(Exception ex)
		{ }
	}
	public static void main(String args[])
	{	new xx();
	}
}