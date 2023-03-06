public class ThrDeneme extends Thread{
	int a,b,c;
	Thread t1;
	Thread t2;
	Thread t3;

	public ThrDeneme(){
		t1=new Thread(this);
		t2=new Thread(this);
		t3=new Thread(this);
		t1.setPriority(10);
		t2.setPriority(10);
		t3.setPriority(10);

		a=b=c=0;
		t1.start();
		t2.start();
		t3.start();
	}


	public void display(){
		System.out.println ("a=" + a + "-b=" + b +"-c="+ c);
	}




	public void run(){
		while (a!=100000 && b!=100000 && c!=100000){
			try{
			//Thread.currentThread().sleep(100);
			if(Thread.currentThread()==t1){a++;}
			if(Thread.currentThread()==t2){b++;}
			if(Thread.currentThread()==t3){c++;}

			}catch(Exception e){}
			display();

		}
	}



	public static void main(String args[]){
		ThrDeneme t=new ThrDeneme();

	}







}
