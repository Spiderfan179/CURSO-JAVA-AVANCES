package Static;


class SerVivo
{
	public SerVivo() 
	{
		System.out.println("Constructor vivo");
	}
}

class Humano extends SerVivo
{
	static int numeroDeHumanos=0;
	String nombre;
	
	public Humano() 
	{
		super();
		System.out.println("Constructor");
	}

	public Humano(String nombre)
	{
		System.out.println("Constructor Sobrecargado");
		this.nombre = nombre;
	}
	//Bloque anonimo
	{
		System.out.println("Bloque Anonimo");
		numeroDeHumanos++;
	}
	
	//Bloque Anonimo
	{
		System.out.println("Bloque2");
	}
  	
}

public class EjemploStaticEnVariables {

	int x=0;
	
	public static void main(String[] args) 
	{
	
   System.out.println(Humano.numeroDeHumanos);
   new Humano();
   new Humano("Alex");
   new Humano();
   new Humano();
   System.out.println(Humano.numeroDeHumanos);
	}

}
