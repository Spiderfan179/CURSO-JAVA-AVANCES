public class Ejercicio4 
{
    public static void main(String[] args) 
    {
        /// asteriscos1
          System.out.println("Cuadrado" +"\n");
        String asteriscos1="";

        for(int j=0; j<=4 ; j++)
        {
        for(int i =0;i<=10;i++)
        {
            asteriscos1 +="*";
            
        }
         System.out.println(asteriscos1);
         asteriscos1="";
       }

   //asteriscos 2

           String asteriscos2="";
  System.out.println("Arbolito" +"\n");
        for(int j=0; j< 2 ; j++)
        {
        for(int i =0;i<=1;i++)
        {
            asteriscos2 +="*";
             System.out.println(asteriscos2);
        }
        
         
       }

       // Asteriscos 3

                String asteriscos3="";
                 String espacios = "    ";
                 String Inversor ="";
                int decremento = 4;  
         
                System.out.println("Arbolito inverso" +"\n");
                
        for(int j=0; j< 2 ; j++)
        {
          
        for(int i =0;i<=1;i++)
        {
          decremento--;
          Inversor = espacios.substring(0,decremento);
            asteriscos3 +="*";
            
             System.out.println(Inversor + asteriscos3);

        }
        
         
       }

      
    }
}
