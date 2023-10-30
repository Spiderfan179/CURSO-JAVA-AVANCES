package Ejemplos.De.La.Seccion;



class TituloIncorrectoException extends Exception
{

	private static final long serialVersionUID = 1L;
	
	public TituloIncorrectoException(String error) 
	{
		super(error);
	}

}

public class EjemploExeptionPropia
{

	static void crearCurso(String titulo)  throws Exception
	{
		if(!titulo.toUpperCase().equals(titulo)) 
		{
			throw new TituloIncorrectoException("El titulo debe estar en mayusculas");
		}
		System.out.println("Titulo Correcto");
	}
	
	public static void main(String[] args) throws Exception
	{
	   crearCurso("JAVA DESDE CERO");
	}

}
