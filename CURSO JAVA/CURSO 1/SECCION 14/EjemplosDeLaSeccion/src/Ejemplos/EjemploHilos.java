package Ejemplos;


class Devs4jThread extends Thread
{

	public Devs4jThread(String name) 
	{
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() 
	{
	for (int i = 0; i < 100; i++) 
	{
		System.out.printf("Hilo %S indice %d \n",getName(),i);
      try 
      {
		Thread.sleep(100);
	} catch (InterruptedException e)
      {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
	}
      
	}
	
	
	
}

public class EjemploHilos {

	public static void main(String[] args) 
	{
		  Devs4jThread hilo1 = new Devs4jThread("Hilo 1");

		  Devs4jThread hilo2 = new Devs4jThread("Hilo 2");
   
		  hilo1.run();
		  hilo2.start();
	}

}
