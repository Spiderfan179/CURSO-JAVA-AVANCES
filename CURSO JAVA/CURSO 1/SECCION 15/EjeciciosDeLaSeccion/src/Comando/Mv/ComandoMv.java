package Comando.Mv;

import java.io.File;

public class ComandoMv
{

	public static void mv(String a , String d)
	{
		File archivo = new File(a);
		
		File destino = new File(d);
		
		File mover = new File(d,archivo.getName());
		
		if (destino.isDirectory())
		{
			
		
		if (archivo.exists()) 
		{
			if (archivo.renameTo(mover)) 
			{
				System.out.println("Archivo "+ archivo.getName()+" movido a "+d);
			}
			else 
			{
			   System.err.println("Archivo no movido");	
			}
			
		}
		}else 
		{
		 System.err.println("La ruta de destino no es un directorio");	
		}
		
	}
	
	
}
