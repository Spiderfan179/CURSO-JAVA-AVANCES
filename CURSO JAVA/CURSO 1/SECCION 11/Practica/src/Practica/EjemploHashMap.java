package Practica;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {

	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();
		
		map.put("Daniel", "Danielalvaresparedes@gmail.com");
		map.put("Java","es lo que toy aprendiendo");
		map.put(null,"Representa la Inexistencia de un objeto");
		
		System.out.println(map);
		
		for(String llave: map.keySet()) {
			System.out.println(llave + " = "+ map.get(llave));
		}

	}

}
