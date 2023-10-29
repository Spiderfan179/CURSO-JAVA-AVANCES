package Arreglos;

public class InicializacionDeArreglos {
	
	static void imprimirArreglo(String arreglo[]) 
	{
		for(String valor:arreglo) 
		{
			System.out.println(valor);
		}
	}
	
	public static void main(String[] args) 
	{
		
		String nombres[] = new String[2];
       //Explicita
		nombres[0]="Daniel";
		nombres[1]="Pare";
		
		imprimirArreglo(nombres);
		//Implicita
		String nombres2[]= {"Daniel","Pareds"};
		
		//Anonima
		String nombre3[] = new String[] {"Daniel","Pades"};
	}

}
