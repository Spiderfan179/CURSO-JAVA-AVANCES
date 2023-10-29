package Arreglo.Bidimensional.Sumar;

import static java.lang.Math.*;

public class SumarArreglosBidimencionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double arreglo1[][] = {{1,2.2},{1.5,3.5},{4.4,2} };
       double arreglo2[][]= {{2,7.2},{6.5,4.5},{2.4,200} };
       double arregloResul[][] = new double[3][2];
       
       double resul;
       for (int i = 0; i < arreglo1.length; i++) 
       {
		    for (int j = 0; j < 2; j++) 
		    {
			      resul = arreglo1[i][j] + arreglo2[i][j];
			      arregloResul[i][j] = round(resul);
			}
	   }
       
       System.out.println();
       System.out.println("Arreglo Resultante");
       
       for (double[] ds : arregloResul) 
       {
    	      System.out.print("{");
		         for (double ds2 : ds) 
		         {
					System.out.print( ds2+" , " );
				} 
		         System.out.print("},");
	   }
       
       
       
	}

}
