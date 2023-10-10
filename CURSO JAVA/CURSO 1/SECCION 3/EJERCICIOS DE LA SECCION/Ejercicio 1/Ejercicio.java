public class Ejercicio 
{
    public static void main(String args[])
    {
        /// CALCULANDO EL AREA DE UN CUADRADO
        int lado1= 12,lado2=12,AreaCuadrado;

        AreaCuadrado = lado1*lado2;

        System.out.println("El area de tu cuadrado es: " + AreaCuadrado);

        // CALCULANDO EL AREA DE UN RECTANGULO

        int ancho = 12 , largo = 50,AreaRectangulo;

        AreaRectangulo = ancho * largo;

        System.out.println("El area de tu rectangulo es: " + AreaRectangulo);

        //CALCULANDO EL AREA DE UN CIRCULO

        double radio = 10 ,radioCuadrado=radio*radio,pi=3.1416,AreaCirculo;
                  
        AreaCirculo = pi*radioCuadrado;   

        System.out.println("El area de tu circulo es: " + AreaCirculo);

        //CALCULANDO EL AREA DE UN TRIANGULO

        int base=10,altura=10, AreaTriangulo;

        AreaTriangulo= base*altura/2;

        System.out.println("El area de tu rectangulo es: "+ AreaTriangulo);

    }
}
