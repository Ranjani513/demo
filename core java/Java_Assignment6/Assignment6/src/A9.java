
public class A9 extends Thread {

	
		// TODO Auto-generated method stub
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
		  A9 a=new A9();
		  
		  a.start();
		  A9 b=new A9();
			 
		  b.start();
		  try {
			 a.join();
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		
			}

	}


