public class Ejercicio2 
{
    public static void main(String[] args) 
    {
        //Programa que imprime las tablas de multiplicar del 1 al
        //20 con espacio entre ellas usando el modulo

         for(int j=0 ; j<=20 ; j++)
        {    

            

            System.out.println("\n");
             System.out.println("Tabla del: "+ j + "\n");



             for(int i = 0;i<=10;i++)
             {
             if(i%2 ==0)
             {
              continue;
             }
                System.out.println(j + " X " + i + " = " + (j*i));
             }
        }
    }
}

