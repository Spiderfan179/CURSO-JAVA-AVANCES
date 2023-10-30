package Ejemplos.De.La.Seccion;

public class EjemploThrow {
	/*
	 * Manejar excepciones sera una de dos cosas
	 * 1-Atrapar la excepcion try catch
	 * 2-Propagar a quien invoco el metodo
	 */
    static double dividir(int a , int b) throws Exception
    {
    	if (b!=0) 
    	{
    		return a/b;
		}else 
		{
		  throw new Exception("No se puede dividir entre cero");	
		}
    	
    }
	public static void main(String[] args) 
	{
		double resultado;
		try {
			resultado = dividir(10,0);
			System.out.println("Resultado "+resultado);
		} catch (Exception e) {
		
			System.err.printf("Error %S",e.getMessage());
		}
		

	}

}
