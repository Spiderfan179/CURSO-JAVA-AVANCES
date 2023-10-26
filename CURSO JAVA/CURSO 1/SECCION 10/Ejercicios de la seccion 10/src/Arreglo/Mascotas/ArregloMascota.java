package Arreglo.Mascotas;

class Mascota
{
	private String nombre;
	private int edad;
	private String fechaNaci;
	private String tipo;
	
	public Mascota(String nombre, int edad, String fechaNaci,String tipo) 
	{
		this.nombre = nombre;
		this.edad = edad;
		this.fechaNaci = fechaNaci;
		this.tipo = tipo;
	}

	
	
	
	public String getTipo() {
		return tipo;
	}




	public void setTipo(String tipo) {
		this.tipo = tipo;
	}




	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFechaNaci() {
		return fechaNaci;
	}

	public void setFechaNaci(String fechaNaci) {
		this.fechaNaci = fechaNaci;
	}
	
	
	
}


class Perro extends Mascota
{
      public Perro(String nombre, int edad, String fechaNaci,String tipo) 
      {
		super(nombre, edad, fechaNaci,tipo);
		
		// TODO Auto-generated constructor stub
	}	
      
}

class Gato extends Mascota
{
     public Gato(String nombre, int edad, String fechaNaci,String tipo) 
      {
		super(nombre, edad, fechaNaci,tipo);
		// TODO Auto-generated constructor stub
	}     
}

public class ArregloMascota 
{
    
	static void Imprimir(Mascota m) 
	{
		System.out.println("Nombre Mascota: "+ m.getNombre());
		System.out.println("Edad Mascota: "+ m.getEdad() + " año");
		System.out.println("FechaNacimiento Mascota: "+ m.getFechaNaci());
		System.out.println("Nombre Mascota: "+ m.getTipo());
	}
	
	public static void main(String[] args) 
	{
		
		Perro p[]= {new Perro("Fido",1, "12/12/2022", "Perro")};
		Gato g[]= {new Gato("coltrane", 2, "01/01/2021", "Gato")};
		
		for (Gato gato : g) 
		{
		     Imprimir(gato);
		}
		
		System.out.println();
		for (Perro perro : p) 
		{
		   Imprimir(perro);
		}

	}

}
