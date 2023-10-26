package Ejercicio.Polimorfismo.Figura;

public class PruebaFigura {

	void imprimirArea(Figura figura) 
	{
		System.out.println("El color de la figura es: "+ figura.getColor() + " y tiene un area de "+figura.calcularArea());
	}
	public static void main(String[] args)
	{
		   PruebaFigura p= new PruebaFigura();
		   
		   p.imprimirArea(new Circulo("Rojo", 10.0));
		   p.imprimirArea(new Cuadro("Verde", 125.0));
		   p.imprimirArea(new Rectangulo("Azul", 20,10));

	}

}
