package clases;

public class Perro extends Animal 
{
	String pedigree;

	public Perro(String nombre, int edad, String fechana, String pedigree,String tipoAnmal) 
	{
		super(nombre, edad, fechana,tipoAnmal);
		this.pedigree = pedigree;
	}
	
	void MiPedegree() 
	{ 
		System.out.println("El pedigree de mi perro es " + pedigree);
	}
	

	@Override
	void DatosAnimal() 
	{
		System.out.println("Metodo Original en clase perro");
		super.DatosAnimal();
		
		System.out.println("Metodo sobre escrito comiensa aqui");
		
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Nacio el "+ this.fechaNacimiento);
		System.out.println("Es un "+ this.tipoAnimal);
		System.out.println("Su"+this.tipoAnimal + " tiene un pedigree " + this.pedigree);
	}
	

}
