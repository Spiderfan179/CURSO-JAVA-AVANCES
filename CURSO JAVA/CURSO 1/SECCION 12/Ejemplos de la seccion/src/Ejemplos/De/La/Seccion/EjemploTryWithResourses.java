package Ejemplos.De.La.Seccion;

class RecursosDev4j implements AutoCloseable
{
   void foo() 
   {
	   
   }
	@Override
	public void close()  {
		System.out.println("Liberando recursos");
		
	}
	

}

public class EjemploTryWithResourses 
{

	public static void main(String[] args) 
	{
		try(RecursosDev4j recurso = new RecursosDev4j()) 
		{
			recurso.foo();
		} 
	}

}
