package Lista.De.Mascotas;

import java.util.ArrayList;
import java.util.List;

class Mascota
{
	private String nombre;
	private String Apellido;
	
	
	public Mascota(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		Apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return Apellido;
	}


	public void setApellido(String apellido) {
		Apellido = apellido;
	}


	public String tipo() 
	{
		return "";
	}
}

class Perro extends Mascota
{
	String tipo;
	
	
	public Perro(String nombre, String apellido, String tipo) {
		super(nombre, apellido);
		this.tipo = tipo;
	}


	@Override
	public String tipo() 
	{
		return  tipo;
	}
}



public class Main {

	public static void main(String[] args) 
	{
	List<Mascota>P= new ArrayList<>();
	
	P.add(new Perro("Fido", "Perez", "Perro"));
	
	for (Mascota mascota : P) 
	{
		System.out.println(mascota.getNombre());
		System.out.println(mascota.getApellido());
		System.out.println(mascota.tipo());
	}
	

	}

}
