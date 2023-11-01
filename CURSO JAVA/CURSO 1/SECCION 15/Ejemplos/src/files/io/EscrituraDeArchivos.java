package files.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscrituraDeArchivos {

	public static void main(String[] args) throws FileNotFoundException
	{
		File f = new File("C:\\Users\\Spide\\Desktop\\Cosas Del Bootcamp de CONSITI\\CURSO JAVA\\CURSO 1\\SECCION 15\\Archivos de files\\texto.txt");
	try(PrintWriter pw = new PrintWriter(f))
	{
		pw.println("Hola");
		pw.println("Siganme en ");
		pw.println("en @spiderfan");
	}

	}

}
