class Bms extends Thread
{
	synchronized public void run()
	{
			try
			{
				int i=0;
				while(i<5)
					{
						sleep(10000);
						System.out.println("BMS college of engineering");
						i++;
					}
			}
			catch(Exception e) {}
	}		
}
class Cse extends Thread
{
	synchronized public void run()
	{
			try
			{
				int i=0;
				while(i<5)
					{
						sleep(2000);
						System.out.println("Cse");
						i++;
					}
			}
			catch(Exception e) {}
	}		
}
class ThreadDem
{
	public static void main(String args[])
	{
		Bms t=new Bms();
		Cse t1=new Cse();
		t.start();
		t1.start();
	}
}
