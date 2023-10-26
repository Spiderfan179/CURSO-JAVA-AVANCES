package Ejercicio.Interface;

public class PruebaDibujable {

	void Dibujar(Dibujable d) 
	{
		d.Dibujar();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PruebaDibujable p = new PruebaDibujable();
      
      p.Dibujar(new Imagen());
	}

}
