package Practica;

import java.util.HashSet;

public class EjemploHasSet {

	public static void main(String[] args)
	{
		HashSet<String> nombres=new HashSet<>();
		
		nombres.add("aaa");
		nombres.add("eee");
		nombres.add("zzz");
		nombres.add(null);
		nombres.add("aaa");
		
		System.out.println(nombres);

	}

}
