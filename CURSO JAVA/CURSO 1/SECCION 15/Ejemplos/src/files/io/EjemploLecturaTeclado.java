package files.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploLecturaTeclado 
{
	public static String readMessage(String promt) throws IOException 
	{
		System.out.println(promt);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}

	public static int readInteger(String promt) throws NumberFormatException, IOException 
	{
	  return	Integer.parseInt(readMessage(promt));
	}
	public static void main(String[] args) throws IOException
	{
	   String nombre = readMessage("Como te llamas?");
		System.out.println("Te llamas : " + nombre);
		
		int edad = readInteger("cuantos años tienes? ");
		System.out.println("Tienes "+edad);
	}

}
