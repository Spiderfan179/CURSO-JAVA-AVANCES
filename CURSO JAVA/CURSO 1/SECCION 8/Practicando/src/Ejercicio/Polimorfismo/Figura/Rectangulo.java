package Ejercicio.Polimorfismo.Figura;



public class Rectangulo extends Figura
{
	private double base;
	private double altura;
	

	
	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.base*this.altura;
	}
	
	

}
