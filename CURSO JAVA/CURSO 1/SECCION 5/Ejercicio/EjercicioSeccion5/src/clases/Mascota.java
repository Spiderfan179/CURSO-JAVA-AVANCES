package clases;
public class Mascota 
{

  String Nombre;
  int edad;
  String tipoAnimal;
  String raza;

public Mascota()
{
    System.out.println("Hola");
}
  
 public  Mascota(String nombre,int edad,String tipoanimal,String raza)
  {
   
     this.Nombre = nombre;
     this.edad = edad;
     this.tipoAnimal = tipoanimal;
     this.raza =raza;
  }
  
public void MostrarMascota(Mascota m)
{
    System.out.println("su mascota: "+ m.Nombre +" que tiene "+ m.edad +" años "+ " y es un "+ m.tipoAnimal +" de raza "+m.raza +" se encuentra sana");
}

    
}
