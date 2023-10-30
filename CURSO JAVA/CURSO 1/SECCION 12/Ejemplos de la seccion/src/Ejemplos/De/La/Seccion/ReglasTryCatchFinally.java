package Ejemplos.De.La.Seccion;

public class ReglasTryCatchFinally {

	static void test() 
	{
		try {
			System.out.println("Bloque try");
			System.exit(0);
			return;
		} finally {
			System.out.println("Bloque finally");
		}
	}
	
	public static void main(String[] args) 
	{ 
		/*bloque con try y 
		 * catch
		 */
		test();
		
		try 
		{
			
		} catch (NullPointerException n ) 
		{
			
		}catch (RuntimeException r) 
		{
			
		}catch (Exception e) 
		{
			
		}catch (Throwable t) 
		{
			
		}
		
		/* bloque con try y 
		 * finally
		 */
		try 
		{
			
		}
		finally
		{
			
		}
		
		/*bloque con try catch y 
		 * finally
		 */
		try {
			
		} catch (Exception e) 
		{
			
		}finally 
		{
			
		}

	}

}
