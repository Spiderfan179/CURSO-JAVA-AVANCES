package Ejercicios;


class EJemploAnonima
{
	void foo() 
	{
		System.out.println("Foo");
	}
}

public class EjemploClasesAnonimas {

	public static void main(String[] args) 
	{
	  EJemploAnonima obj = new EJemploAnonima() 
	  {
		  @Override
		  void foo() 
		  {
			  System.out.println("Bar");
		  }
	  };
	  
	  obj.foo();

	}

}
