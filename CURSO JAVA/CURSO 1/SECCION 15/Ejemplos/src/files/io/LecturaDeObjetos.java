package files.io;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import File.Objects.Programador;

public class LecturaDeObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		File file = new File("C:\\Users\\Spide\\Desktop\\Cosas Del Bootcamp de CONSITI\\CURSO JAVA\\CURSO 1\\SECCION 15\\Archivos de files\\programadores.txt");
		try(FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis))
		{
			while(true) 
			{
				try {
					Programador programador = (Programador) ois.readObject();
					System.out.println(programador.getNombre());
					System.out.println(programador.getLenguajeFavorito());
				} catch (EOFException e) 
				{
					System.out.println("Null");
					break;
				}
				
			}
		}

	}

}
