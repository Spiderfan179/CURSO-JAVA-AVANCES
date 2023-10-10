public class  Ejercicio3
{
    public static void main(String[] args) 
    {
         int factorial=7;
         int resultado=factorial;
         for(int i =factorial-1;i!=0;i--)
         {
            resultado = resultado * i ;
         }

         if(resultado == 0)
         {
             System.out.println("El factorial de " + factorial + " es: " + 1);
         }else
         {
         System.out.println("El factorial de " + factorial + " es: " + resultado);
         }
        }
}