package clases;

public class Animal 
{
	String nombre;
	int edad;
	String fechaNacimiento;
	String tipoAnimal;
	
	public Animal(String nombre, int edad,String fechana,String tipoa) {
		this.nombre = nombre;
		this.edad = edad;
		this.fechaNacimiento=fechana;
		this.tipoAnimal=tipoa;
	}
	
	
	void comer() 
	{
		System.out.println(nombre+" esta Comiendo");
	}
	
	void correr() 
	{
		System.out.println(nombre+" esta corriendo");
	}
	
	
	void DatosAnimal() 
	{
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Nacio el "+ this.fechaNacimiento);
		System.out.println("Es un "+ this.tipoAnimal);
	}
	

}
