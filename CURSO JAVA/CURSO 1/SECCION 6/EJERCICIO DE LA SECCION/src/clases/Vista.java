package clases;

public class Vista 
{
	public static void main(String[] args) 
	{
	    Caballo c = new Caballo("Viernes", 5,"01-01-2018", " a rayas", "de cuero","Caballo");
	    
	    Perro p = new Perro("Firulais", 2, "05/05/2019","Pura sangre", "Perro");
	    
	    
	    c.DatosAnimal();
	    c.ponerMontura();
	    c.ponerEstribos();
	    
	    p.DatosAnimal();
	    p.MiPedegree();
	}

}
