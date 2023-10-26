package Modificadores;

class Prueba
{
 private String nombre;
 
 private  Prueba() 
 {
	 
 }
 
 private void foo() 
 {
	 
 }
 
}

public class EjemploPrivate
{

    public static void main(String[] args) 
    {
    	//el constructor es privado no puede construir la clase
		Prueba p=new Prueba();
		
		//No se puede acceder a este metodo porque es privado
		p.foo();
	}	
	
}
