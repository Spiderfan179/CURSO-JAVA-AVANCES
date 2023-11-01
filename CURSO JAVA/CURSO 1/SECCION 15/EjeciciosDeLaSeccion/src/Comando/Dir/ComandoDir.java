package Comando.Dir;

import java.io.File;
import java.text.SimpleDateFormat;

public class ComandoDir 
{

	public static void Dir(String Camino) 
	{
		SimpleDateFormat ds = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	     	File dir = new File(Camino);
	     	
	     	File[]contend = dir.listFiles();
	     	
	     	System.err.println("Directorio de " + Camino);
	     	String Archivo;
	     	int contador=0;
	     	long bytes=0 ;
	     	for (File file : contend) 
	     	{
	     		Archivo = file.getAbsoluteFile().toString();
	     		int TamañoCamino = Camino.length();
	     	    
	     		
			       	System.out.print(ds.format(file.lastModified())+" " );
			       	System.out.print(" <DIR> ");
			       	System.out.println("."+Archivo.subSequence(TamañoCamino+1,Archivo.length()));
			       	
			       	if (file.isFile()) 
			       	{
						contador++;
						bytes = file.getTotalSpace();
					}
			}
	     	System.out.println(contador + " archivos " );
	     	
	     
	}
	
}
