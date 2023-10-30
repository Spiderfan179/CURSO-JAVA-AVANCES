package Ejercicios;

public class EjemploClasesANivelDeMetodo
{
static void foo() 
{
	class ClaseInternaDeMetodo
	{
		void bar() 
		{
			System.out.println("Bar");
		}
	}
	ClaseInternaDeMetodo obj = new ClaseInternaDeMetodo();
	obj.bar();	
}

static void test() 
{
   ClaseInternaDeMetodo obj = new ClaseInternaDeMetodo();	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
