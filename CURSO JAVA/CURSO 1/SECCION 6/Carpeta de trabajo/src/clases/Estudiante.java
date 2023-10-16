package clases;

public class Estudiante extends Persona {
	int numeroDeCuenta;
   
	public Estudiante(int numerocuenta,String nombre, String fechaNacimiento) 
	{
		super(nombre, fechaNacimiento);
		this.numeroDeCuenta = numerocuenta;
	}
	
	@Override
	void dormir() {
		super.dormir();
		System.out.println("Soy " + nombre + " y estudio un dia antes");

	}
	
	void aprobar() {
		System.out.println("Soy " + nombre + " y aprobe mi examen");
	}

	void reprobar() {
		System.out.println("Soy " + nombre + " y reprobe mi examen");
	}

}
