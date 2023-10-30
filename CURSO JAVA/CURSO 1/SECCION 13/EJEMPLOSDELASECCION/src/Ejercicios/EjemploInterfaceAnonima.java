package Ejercicios;

interface Jugable
{
	void jugar();
}

public class EjemploInterfaceAnonima 
{

	public static void main(String[] args) 
	{
		Jugable jugable = new Jugable() 
		{
			@Override
			public void jugar() 
			{
				System.out.println("Jugar");
			}
		};
		
		jugable.jugar();

	}

}
