package Vehiculo;

public class ToyotaYaris extends Vehiculo implements Manejable
{
     private String modeloVehiculo;
     private int velocidad;

	public ToyotaYaris(String ruedas, String paraBrisa, int nPuertas, int nAsientos, String motor,String cajaVelocidades, String tipo, String modeloVehiculo,int velocidad) {
		super(ruedas, paraBrisa, nPuertas, nAsientos, motor, cajaVelocidades, tipo);
		this.modeloVehiculo = modeloVehiculo;
		this.velocidad = velocidad;
	}

	@Override
	public void subirAvehiculo() 
	{
		System.out.println("*Te subes a tu " + this.modeloVehiculo + "*");
		
	}

	@Override
	public void encenderVehiculo() 
	{
		System.out.println("*Arrancas tu "+this.modeloVehiculo+"*");
		
	}

	@Override
	public void cambiarVelocidad() 
	{
		System.out.println("*Engranaste velocidad "+this.velocidad+"*");
		
	}
     
}
