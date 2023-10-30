package Ejemplos;


class SyncCounter
{
	static int counter = 10;
	
	public synchronized static void decrement() 
	{
		counter--;
		System.out.println(counter);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Decrementor extends Thread
{

	@Override
	public void run() 
	{
		System.out.println("Decrementando el Sync Counter");
	
	    SyncCounter.decrement();
	}
	
}

public class EjemploSincronizacion
{

	public static void main(String[] args)
	{
	
		
		for (int i = 0; i < 10; i++) 
		{
		     new Decrementor()	.start();
		}

	}

}
