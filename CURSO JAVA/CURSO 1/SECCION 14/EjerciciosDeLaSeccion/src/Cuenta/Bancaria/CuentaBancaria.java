package Cuenta.Bancaria;


public class CuentaBancaria 
{
	private String NombreCuenta;
	private  Double saldoCuenta;
	
	public CuentaBancaria(Double saldo,String nombre)
	{
		this.saldoCuenta = saldo;
		this.NombreCuenta = nombre;
	}
	
	public String getNombreCuenta() 
	{
		return this.NombreCuenta;
	}
	
	public String getSaldoCuenta() 
	{
		return this.saldoCuenta.toString();
	}
	
	public synchronized String Retiro(Double monto) 
	{
		if(saldoCuenta >= monto) 
		{
			saldoCuenta -= monto;
			 return saldoCuenta.toString();
			
		}else 
		{
		   return "Error no hay suficiente saldo";
		}
		
	}
	
	
}
