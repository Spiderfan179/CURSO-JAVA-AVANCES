package Ejemplos.De.La.Seccion;

public class EjemploTryCatch {

	public static void main(String[] args) 
	{
		try 
		{
			int x = 10;
			int y= 10/x;
			System.out.println("Valor de division " + y);
			String nombre =null;
			System.out.println(nombre.toString());
			String arr[] = {"aaa","aaa"};
			System.out.println(arr[2]);
			
		}catch (ArithmeticException | NullPointerException e) 
		{
			System.err.printf("Aritmetich y Null pointer Exeption %S \n", e.getMessage());
			System.out.println(e.getMessage());
		}catch (Exception e) 
		{
			System.err.printf("Exeption %S \n",e.getMessage());
		}finally 
		{
			System.out.println("Siempre se ejecuta");
		}

	}

}
