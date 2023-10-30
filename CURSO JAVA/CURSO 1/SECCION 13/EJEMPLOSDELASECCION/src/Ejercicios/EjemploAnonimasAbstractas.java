package Ejercicios;

abstract class FiguraAnonima
{
	abstract void foo();
		
	
}

public class EjemploAnonimasAbstractas {

	public static void main(String[] args) {
		
		FiguraAnonima fig = new FiguraAnonima() 
		{@Override
			void foo()
			{
				System.out.println("Foo");
				
			}
		};
    fig.foo();
	}

}
