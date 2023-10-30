package Ejemplos;

class Counter implements Runnable
{
		private int valor;
		
	public Counter(int valor) {
			super();
			this.valor = valor;
		}




	@Override
	public void run() 
	{
		System.out.printf("State %S \n",Thread.currentThread().getState());
		for (int i = this.valor; i >=0; i--) 
		{
		      System.out.printf("Valor %d %S \n",i,Thread.currentThread().getName());
		      try
		      {
				Thread.sleep(1000);
			  }
		      catch (InterruptedException e)
		      {
			
				e.printStackTrace();
			}
		}
		
	}
	
}


public class EjemploRunable {

	public static void main(String[] args) throws InterruptedException 
	{
		Thread hilo = new Thread(new Counter(10),"Hilo1");
		System.out.printf("State %S \n",hilo.getState());
		hilo.start();
			
		System.out.printf("State %S \n",hilo.getState());
		
		Thread hilo2 = new Thread(new Counter(20),"Hilo2");

		hilo2.start();

		System.out.println("fin del programa");
		

	}

}
