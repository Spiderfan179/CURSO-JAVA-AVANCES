package Cuenta.Bancaria;

import java.util.ArrayList;
import java.util.List;

public class Transaccion extends Thread 
{
	private String transaccionName;
    private  CuentaBancaria c;
    
   
    private Double retiro;
   
    public Transaccion(CuentaBancaria c , Double re,String tran) 
    {
         this.c = c;
         this.retiro = re;
         this.transaccionName = tran;
         
   
	}
    
    public String getTranName() 
    {
    	return this.transaccionName;
    }

private synchronized void cuentaFinal() 
{
	System.out.println("El saldo de la cuenta " +c.getNombreCuenta()+" es " + c.getSaldoCuenta());
	if (Double.parseDouble(c.getSaldoCuenta()) >= retiro) 
	{
		System.out.println("Se ha retirado "+ retiro +" dolares saldo restante: " +c.Retiro(retiro) +" se ha efectuado por "+ getTranName());
	}
	else 
	{
	   System.err.println(c.Retiro(retiro) +" intentaste retirar "+ retiro + " cuando el saldo total es de " + c.getSaldoCuenta() + " efectuado por " + getTranName());	
	}
		    
	}

    
	@Override
	public  void run() 
	{
		cuentaFinal();
	 	
	}
	
    
    
	
}
