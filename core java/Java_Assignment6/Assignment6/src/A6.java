// 6.Write a thread class with synchronize block
public class A6 {
	
	 public void display(int n)
	{
		 synchronized(this) {
		for(int i=1;i<5;i++) {
		System.out.println(i*n);
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	}
	}
	
	  public static void main(String[] args) {
			// TODO Auto-generated method stub
	    A6 a=new A6();
	    Thread3 t1=new Thread3(a);
	    t1.start();
	    Thread4 t2=new Thread4(a);
	    t2.start();
	    
	  
	}
}
	
	class Thread3 extends Thread
	{
		A6 a;
		Thread3(A6 a)
		{
			this.a=a;
		}
		public void run()
		{
			a.display(2);
		}
	}
	class Thread4 extends Thread
	{
		A6 a;
		Thread4(A6 a)
		{
			this.a=a;
		}
		public void run()
		{
			a.display(5);
		}
	}
	


