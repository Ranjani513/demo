
public class A5 extends Thread {
		
		
	  synchronized void display(int n)
	{
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
	  public static void main(String[] args) {
			// TODO Auto-generated method stub
	    A5 a=new A5();
	    Thread1 t1=new Thread1(a);
	    t1.start();
	    Thread2 t2=new Thread2(a);
	    t2.start();
	    
		}
	}
	
	class Thread1 extends Thread
	{
		A5 a;
		Thread1(A5 a)
		{
			this.a=a;
		}
		public void run()
		{
			a.display(2);
		}
	}
	class Thread2 extends Thread
	{
		A5 a;
		Thread2(A5 a)
		{
			this.a=a;
		}
		public void run()
		{
			a.display(5);
		}
	}
	
