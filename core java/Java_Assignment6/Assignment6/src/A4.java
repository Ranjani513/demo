// by writing java thread program generate dead lock situation with join()method
public class A4  {
	public static void main(String[] args) {
		
final String name="ranjani";
final String name1="manasa";
	Thread t1=new Thread(){
	public void run()
	{
		synchronized(name)
		{
			System.out.println("name is locked1:"+name);
			
		
	/*	try {
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		synchronized(name1)
		{
			System.out.println("name is locked1:"+name1);
			
		}
	}
	}
	};
	Thread t2=new Thread(){
		public void run()
		{
			synchronized(name1)
			{
				System.out.println("name is locked2:"+name1);
				
			
		/*	try {
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}*/
			synchronized(name)
			{
				System.out.println("name is locked2:"+name);
				
			}
		}
		}
	};
	t2.start();
	t1.start();
	try {
		t1.join();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	}

}