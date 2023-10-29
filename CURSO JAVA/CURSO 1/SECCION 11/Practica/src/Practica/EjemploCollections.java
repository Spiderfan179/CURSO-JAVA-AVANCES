package Practica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploCollections {

	public static void main(String[] args) 
	{
		List<String>lista = new ArrayList<>();
		
		lista.add("hola");
		lista.add("Alex");
		lista.add("Rocio");
		Collections.sort(lista);
	 int index=	Collections.binarySearch(lista,"Rocio");
		System.out.println(lista.get(index));

	}

}
