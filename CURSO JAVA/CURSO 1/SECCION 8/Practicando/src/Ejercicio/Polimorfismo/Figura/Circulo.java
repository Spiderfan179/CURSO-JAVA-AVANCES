package Ejercicio.Polimorfismo.Figura;

public class Circulo extends Figura
{
	private double radio;

	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2);
	}
	
    
}
