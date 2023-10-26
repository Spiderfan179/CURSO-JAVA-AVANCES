package Ejercicio.Polimorfismo.Figura;

public abstract class Figura {
private String color;

public Figura(String color) 
{
	this.color = color;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

//Metodo sin implementacion metodo abstracto
public abstract double calcularArea();




}
