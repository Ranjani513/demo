/*7.Write java thread program with below specifications

   -- Should have 2 threads

   --first one thread execute then 

   --second thread should execute

   --out-put should predictable*/
public class A7 extends Thread {
public void run()
{
	for(int i=0;i<5;i++)
	{
		System.out.println(Thread.currentThread().getName()+"\t"+i);
		try {
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
  A7 a=new A7();
 
  a.start();
  try {
	  a.join();
  }
  catch(Exception e)
  {
	  System.out.println(e);
  }
  A7 b=new A7();

  b.start();
	}

}
