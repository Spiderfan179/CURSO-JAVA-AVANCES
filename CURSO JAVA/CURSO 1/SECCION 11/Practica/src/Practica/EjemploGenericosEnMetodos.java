package Practica;

import java.util.Arrays;
import java.util.List;

public class EjemploGenericosEnMetodos {

	//WildCard = ? necesita heredar number si es un numero
	static double sumarValores(List<? extends Number>valores) 
	{
		double suma = 0.0;
		for (Number valor : valores)
		{
		    	suma += valor.doubleValue();
		}
		return suma;
	}
	
	public static void main(String[] args)
	{
		double sumarVal=sumarValores(Arrays.asList(10.45,11.45,new Integer(10),new Float(30)));
        System.out.println("Suma "+ sumarVal);
		
	}

}
