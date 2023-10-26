package Vehiculo;

public class Vehiculo implements Manejable
{
	private String ruedas;
	private String paraBrisa;
    private int nPuertas;
    private int nAsientos;
    private String motor;
   private String cajaVelocidades;
   private String tipo;
public Vehiculo(String ruedas, String paraBrisa, int nPuertas, int nAsientos, String motor, String cajaVelocidades,String tipo) 
{
	
	this.ruedas = ruedas;
	this.paraBrisa = paraBrisa;
	this.nPuertas = nPuertas;
	this.nAsientos = nAsientos;
	this.motor = motor;
	this.cajaVelocidades = cajaVelocidades;
	this.tipo = tipo;
}
public String getRuedas() {
	return ruedas;
}
public void setRuedas(String ruedas) {
	this.ruedas = ruedas;
}
public String getParaBrisa() {
	return paraBrisa;
}
public void setParaBrisa(String paraBrisa) {
	this.paraBrisa = paraBrisa;
}
public int getnPuertas() {
	return nPuertas;
}
public void setnPuertas(int nPuertas) {
	this.nPuertas = nPuertas;
}
public int getnAsientos() {
	return nAsientos;
}
public void setnAsientos(int nAsientos) {
	this.nAsientos = nAsientos;
}
public String getMotor() {
	return motor;
}
public void setMotor(String motor) {
	this.motor = motor;
}
public String getCajaVelocidades() {
	return cajaVelocidades;
}
public void setCajaVelocidades(String cajaVelocidades) {
	this.cajaVelocidades = cajaVelocidades;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}

@Override
public void subirAvehiculo() {
	// TODO Auto-generated method stub
	
}
@Override
public void encenderVehiculo() {
	// TODO Auto-generated method stub
	
}
@Override
public void cambiarVelocidad() {
	// TODO Auto-generated method stub
	
}
   

   
}
