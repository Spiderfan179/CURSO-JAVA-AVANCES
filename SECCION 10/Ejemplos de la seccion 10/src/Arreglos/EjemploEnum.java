package Arreglos;

enum Palomitas
{
	CHILE("Chile",10.0f),MANTEQUILLA("Mantequilla",40f),QUESO("Queso",300.2f);
	
	private float precio;
	private String nombreDeVenta;
	
	private Palomitas(String nombreDeVenta,float precio) 
	{
		this.nombreDeVenta = nombreDeVenta;
		this.precio = precio;
	}

	public float getPrecio() 
	{
		return precio;
	}
	
	public String getNombreDeVenta() {
		return nombreDeVenta;
	}


	
	
}

public class EjemploEnum {

	public static void main(String[] args) 
	{
		Palomitas queso = Palomitas.QUESO;
		
		System.out.println(queso.name());
		
		System.out.println(queso.getNombreDeVenta());
		
		System.out.println(queso.getPrecio());

	}

}
