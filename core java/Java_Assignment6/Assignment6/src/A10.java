/*10. Write java thread program with below specifications with join method

   Should have 2 threads   

   one-static method

   one-synchronized method

   one-static synchronized method

   explain the output of the program and program execution*/
public class A10 {
  public static void Hello()
  {
	  System.out.println(Thread.currentThread().getName()+"\t"+"Hello I am in static block");
  }
  public static synchronized void ss()
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
  public synchronized void s()
  {
	  for(int i=5;i<10;i++)
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
    A10 a1=new A10();
    T1 t1=new T1(a1);
    T2 t2=new T2(a1);
    A10 b=new A10();
    T3 t3=new T3();
    t3.start();
    t1.start();
    t2.start();
    
	}

}
class T1 extends Thread
{
	A10 a;
	T1(A10 a)
	{
		this.a=a;
	}
	public void run()
	{
		//a.s();
		//a.Hello();
		A10.ss();
	}
}
class T2 extends Thread
{
	A10 a;
	T2(A10 a)
	{
		this.a=a;
	}
	public void run()
	{
		//a.s();
		//a.Hello();
	A10.ss();
	}
}
class T3 extends Thread
{
	
	public void run()
	{
		
		A10.ss();
	}
}