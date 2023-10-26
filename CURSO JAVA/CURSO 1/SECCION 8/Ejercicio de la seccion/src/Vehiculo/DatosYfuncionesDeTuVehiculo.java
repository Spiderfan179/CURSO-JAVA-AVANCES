package Vehiculo;

public class DatosYfuncionesDeTuVehiculo {

	void datosVehiculo(Vehiculo v) 
	{
		System.out.println("* Datos de tu vehiculo *");
		System.out.println("Tipo de Ruedas: " + v.getRuedas());
		System.out.println("Para Brisas: " + v.getParaBrisa());
		System.out.println("Numero de puertas: "+ v.getnPuertas());
		System.out.println("Numero de asientos: "+ v.getnAsientos());
		System.out.println("Motor: " + v.getMotor());
		System.out.println("Caja de cambios: " + v.getCajaVelocidades());
		System.out.println("Tipo de vehiculo: "+ v.getTipo());
		
		System.out.println("*            FIN Datos de tu vehiculo                 *");
		
		
		v.subirAvehiculo();
		v.encenderVehiculo();
		v.cambiarVelocidad();
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		DatosYfuncionesDeTuVehiculo s = new DatosYfuncionesDeTuVehiculo();
		
		s.datosVehiculo(new ToyotaYaris("Ruedas de alto desempeño", "Vidrio Templado", 4, 5, "Gasolina 1.5L", "Manual", "Sedan","Toyota Yaris", 1));

	}

}
