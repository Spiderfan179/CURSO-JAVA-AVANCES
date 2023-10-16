package clases;

public class Caballo extends Animal 
{
	String montura;
	String estribo;
	
	public Caballo(String nombre, int edad, String fechana, String montura, String estribo,String tipoAnimal) {
		super(nombre, edad, fechana,tipoAnimal);
		this.montura = montura;
		this.estribo = estribo;
	}
	
	
	void ponerMontura() 
	{
		System.out.println("Le has puesto la montura "+ this.montura + " a tu caballo " + this.nombre);
	}
	
	void ponerEstribos() 
	{
		System.out.println("Le has puesto su estribo "+ this.estribo + " a tu caballo "+ this.nombre);
	}
	

	
	

}
