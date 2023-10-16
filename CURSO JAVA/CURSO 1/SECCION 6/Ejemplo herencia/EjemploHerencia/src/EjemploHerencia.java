class Animal
{
    String nombre;
    public void respirar()
    {
        System.out.println("Soy un animal y respiro");
    } 

}


 class perro extends Animal
    {
        
    }

    class gato extends Animal
    {

    }


   public class EjemploHerencia
    {
        public static void main(String[] args) 
        {
            Animal a=new Animal();

            perro p=new perro();
            p.respirar();
            p.nombre = "Triston";
            gato g = new gato();
            g.respirar();

            System.out.println(a instanceof Animal);
        }
    }