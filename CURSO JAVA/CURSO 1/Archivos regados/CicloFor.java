public class CicloFor 
{
    public static void main(String[] args)
    {
        
        /*
          tabla = 2
          i =0
          i= 1
          i= n
         */
       outer: for(int j=0;j<=10;j++)
        {
            System.out.println("Tabla del " + j);
       inner: for(int i =0;i<=10;i++)
        {
           if(i%2==0)
           {
            break outer;
           }

            System.out.println(j +" X " + i +"= " +(j*i) );
        }
        }
    }
}
