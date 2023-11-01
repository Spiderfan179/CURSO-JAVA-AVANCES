package Comando.cp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ComandoCp 
{
   public static void Cp(String copyPath,String destinationPath) throws IOException 
   {
	   File fuente = new File(copyPath);
	   
	   File destino = new File(destinationPath);
	   
	   File copyArchivo = new File(destinationPath + File.separator +"Copia" +fuente.getName());
	   
	   if(!destino.canRead()) 
	   {
		   destino.setWritable(true);
	   }
	   
	  if (destino.isDirectory()) 
	  {
		  if (fuente.isFile() && fuente.exists()) 
		  {
			  
			  
			  
				FileInputStream fis = new FileInputStream(fuente);
				FileOutputStream fos = new FileOutputStream(copyArchivo);
				
				byte[] buffer = new byte[1024];
				int bytesleidos;
				
				while((bytesleidos = fis.read(buffer)) !=-1) 
				{
					fos.write(buffer,0,bytesleidos);
				}
				fis.close();
				fos.close();
		  System.out.println("Se ha copiado el archivo en " + destinationPath);
		}else 
		{
		     System.err.println("El archivo no existe");	
		}
	
			
	   }else 
	   {
		System.err.println("La ruta de destino no existe ");
	}
	   
	   
   }
}
