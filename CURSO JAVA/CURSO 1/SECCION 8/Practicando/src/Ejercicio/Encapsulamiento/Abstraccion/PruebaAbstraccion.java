package Ejercicio.Encapsulamiento.Abstraccion;

// la abstraccion se refiere a que existen metodos privados que se ejecutan por detras de un metodo publico
//en la clase en este caso en el objeto String
public class PruebaAbstraccion {
public static void main(String[] args) 
{

	String string = new String("raidentrance");
	
	string.toUpperCase();
	
	System.out.println(string.repeat(3));
	
	
	
	
}
}
