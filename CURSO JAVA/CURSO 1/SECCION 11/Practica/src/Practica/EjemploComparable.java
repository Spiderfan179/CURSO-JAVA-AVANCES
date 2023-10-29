package Practica;

import java.util.TreeSet;

class Perros implements Comparable<Perros>
{
	private String nombre;
	
	public Perros(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public void SetNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public String GetNombre() 
	{
		return nombre;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + "]";
	}

	@Override
	public int compareTo(Perros o) {
		
		return nombre.compareTo(o.GetNombre());
	}
	
	
}

public class EjemploComparable {

	public static void main(String[] args) 
	{
		TreeSet<Perros> set=new TreeSet<>();
		set.add(new Perros("Canelita"));
		set.add(new Perros("Canelita"));
		set.add(new Perros("Rocky"));

		
		System.out.println(set);
		


	}

}
