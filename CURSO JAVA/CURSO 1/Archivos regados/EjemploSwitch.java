public class EjemploSwitch 
{
     public static void main(String[] args) 
     {
            int opcion=0;
            
            switch(opcion)
            {
                case 0:
                case 1:
                case 2:
                 System.out.println("Opcion 0, 1 y 2");
                break;
                case 3:
                 System.out.println("Opcion 3");
                break;

                default:
                System.out.println("Opcion 4");
                break;
            }
     }    
}
