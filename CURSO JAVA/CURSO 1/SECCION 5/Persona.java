class Persona
{
    //Atributos
    String nombre;
    int edad;
    char genero;

    // CONSTRUCTOR

    Persona()
    {
        System.out.println("Esto es un constructor");
    }

    Persona(String n,int ed,char g)
    {
          this.nombre = n;
          this.edad = ed;
          this.genero=g;
    }

    ///Metodos
    void jugarJuegos(Persona p)
    {
           System.out.println(this.nombre +" esta jugando con " + p.nombre);
    }


    void imprimirInformacion()
    {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Genero: " + this.genero);
    }

    public static void main(String[] args) 
    {
        Persona p = new Persona("Alex",32,'M');

        p.imprimirInformacion();

        Persona p1 = new Persona();

        p1.nombre = "Jin";
        p1.edad = 14;
        p1.genero = 'M';
        p1.imprimirInformacion();

        p.jugarJuegos(p1);
    }
}