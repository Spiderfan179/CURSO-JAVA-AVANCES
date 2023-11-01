package files.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EjemploEditorTexto 
{
	public static final String BASE_PATH = "C:\\Users\\Spide\\Desktop\\Cosas Del Bootcamp de CONSITI\\CURSO JAVA\\CURSO 1\\SECCION 15\\Archivos de files";
	public static String readMessage() throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}

	public static void main(String[] args) throws IOException 
	{
	   System.out.println("Indica el name del archivo");
	   String fileName = readMessage();
	   File f = new File(BASE_PATH.concat(File.separator).concat(fileName));
	   System.out.println("Empieza a escribir y escribe salir para terminar");
	  String cadena = null;
	  try(PrintWriter pw = new PrintWriter(f)) 
{
	   do 
	   {
		    cadena = readMessage();
		    if(!"salir".equals(cadena)) 
		    {
		    pw.println(cadena);
		    }
	  } while (!"salir".equals(cadena));
	  }
}

}
