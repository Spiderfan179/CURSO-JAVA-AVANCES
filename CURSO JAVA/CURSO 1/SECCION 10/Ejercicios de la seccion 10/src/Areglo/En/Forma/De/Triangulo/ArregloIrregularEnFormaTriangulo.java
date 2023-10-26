package Areglo.En.Forma.De.Triangulo;

public class ArregloIrregularEnFormaTriangulo {

	public static void main(String[] args) 
	{
		String arreglo[][] = {{" "," ","*","*"},{ " ","*","*","*","*"},{"*","*","*","*","*","*"}};
		
		for (String[] A1 : arreglo) 
		{
			for (String A2 : A1) 
			{
				System.out.print(A2 +" ");
			}
			System.out.println();
		}

	}

}
