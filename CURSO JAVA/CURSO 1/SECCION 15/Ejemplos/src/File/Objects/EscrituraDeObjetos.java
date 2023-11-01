package File.Objects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraDeObjetos 
{
	public static void main(String[] args)  throws IOException
	{
		Programador programadores[] = { new Programador("Daniel", "C#"),
				new Programador("Paco", "C#"),new Programador("Juan", "java")	};
		 File file = new File("C:\\Users\\Spide\\Desktop\\Cosas Del Bootcamp de CONSITI\\CURSO JAVA\\CURSO 1\\SECCION 15\\Archivos de files\\programadores.txt");

        if(!file.exists()) 
        {
        	file.createNewFile();
        }
		 
		try( FileOutputStream fos =new FileOutputStream( file); 
				ObjectOutputStream oos = new ObjectOutputStream(fos))
		{
			for (Programador programador : programadores) 
			{
				oos.writeObject(programador);
			}
		}
	}
	


}
