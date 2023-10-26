package Ejercicio.Polimorfismo.Figura;

public class Cuadro extends Figura
{
private double lado;

public Cuadro(String color, double lado) {
	super(color);
	this.lado = lado;
}

@Override
public double calcularArea() {
	// TODO Auto-generated method stub
	return lado*lado;
}




}
