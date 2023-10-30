package Cuenta.Regresiva.Thread;

import java.util.Random;

class CuentaRegresiva extends Thread
{
	private int cuentaRegresiva;
	
	public CuentaRegresiva(int cuenta,String name) 
	{
		super(name);
         this.cuentaRegresiva = cuenta;
	}
	
	

	@Override
	public void run() 
	{
       for (int i = cuentaRegresiva; i >= 0; i--) 
       {
    	  if (i==0) 
    	  {
			System.err.println(getName() + " Ha Finalizado");
		}else
		{
			System.out.printf("Hilo: %S   CuentaRegresiva %d \n",getName(),i);
		}
		
	      try {
	      	
	  		Thread.sleep(new Random().nextInt(1000));
	  	} catch (InterruptedException e) 
	         {

	  		e.printStackTrace();
	  	}
		
	   }

 
       
	}
	
	
}



public class CuentaRegresivaDesdeHilo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String terminePrimero = "a";
		
		
		CuentaRegresiva cuenta1 = new CuentaRegresiva(10, "Cuenta 1");
		CuentaRegresiva cuenta2 = new CuentaRegresiva(20, "Cuenta 2");
		
	
		cuenta1.start();
		cuenta2.start();


	
		
	}

}
