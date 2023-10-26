package Proyecto;

import Protected.EjemploProtected;

public class PruebaEjemploProtected extends EjemploProtected
{
	void bar() 
	{
		foo();
	}
	
public static void main(String[] args) {
	PruebaEjemploProtected e = new PruebaEjemploProtected();
	
	e.bar();
}
}
