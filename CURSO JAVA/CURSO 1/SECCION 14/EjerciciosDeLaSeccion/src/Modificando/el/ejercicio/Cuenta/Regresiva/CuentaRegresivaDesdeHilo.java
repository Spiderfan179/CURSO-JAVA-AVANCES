package Modificando.el.ejercicio.Cuenta.Regresiva;

import java.util.Iterator;
import java.util.Random;

class CuentaRegresiva implements Runnable
{
	private int cuentaRegresiva;
	private int prioridad;
	public CuentaRegresiva(int cuenta,int priori) 
	{
         this.cuentaRegresiva = cuenta;
         this.prioridad = priori;
	}
	
	

	@Override
	public void run() 
	{
       for (int i = cuentaRegresiva; i >= 0; i--) 
       {
    	   if (i==0)
    	   {
    		   System.out.printf("Hilo: %S   CuentaRegresiva %d \n",Thread.currentThread().getName(),i);
    		   System.err.println( Thread.currentThread().getName() + " Ha Terminado y su tiempo de prioridad era de " + prioridad);
    		 
		}else
		{
			System.out.printf("Hilo: %S   CuentaRegresiva %d \n",Thread.currentThread().getName(),i);
		}
		
		 try {
		    	
				Thread.sleep(prioridad);
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
		Thread cuenta1 = new Thread(new CuentaRegresiva(10,1000),"Cuenta 1");
		Thread cuenta2 = new Thread(new CuentaRegresiva(10,100),"Cuenta 2");
		Thread cuenta3 = new Thread(new CuentaRegresiva(10,10),"Cuenta 3");
		Thread cuenta4 = new Thread(new CuentaRegresiva(10,1300),"Cuenta 4");
		Thread cuenta5 = new Thread(new CuentaRegresiva(10,1200),"Cuenta 5");
		
	
		cuenta1.start();

		cuenta2.start();
		
		cuenta3.start();
		
		cuenta4.start();
		
		cuenta5.start();
		
		
		
	}

}
