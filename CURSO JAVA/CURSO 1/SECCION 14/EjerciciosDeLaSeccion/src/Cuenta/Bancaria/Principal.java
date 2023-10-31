package Cuenta.Bancaria;

import java.util.ArrayList;
import java.util.List;

  

public class Principal {

	public static void main(String[] args) throws InterruptedException 
	{
       CuentaBancaria danielParedes = new CuentaBancaria(300.0, "Daniel Paredes");
       CuentaBancaria rodrigoValle = new CuentaBancaria(100.0, "Rodrigo Valle");
		
		Transaccion tran1 = new Transaccion(danielParedes, 400.0, "Transaccion 1");
		Transaccion tran2 = new Transaccion(danielParedes, 20.0, "Transaccion 2");
		Transaccion tran3 = new Transaccion(danielParedes, 10.0, "Transaccion 3");
		Transaccion tran4 = new Transaccion(danielParedes, 5.0, "Transaccion 4");
		Transaccion tran5 = new Transaccion(danielParedes, 265.0, "Transaccion 5");
		Transaccion tran6 = new Transaccion(danielParedes, 5.0, "Transaccion 6");
		
		Transaccion tran7 = new Transaccion(rodrigoValle, 400.0, "Transaccion 1");
		Transaccion tran8 = new Transaccion(rodrigoValle, 10.0, "Transaccion 2");
		Transaccion tran9 = new Transaccion(rodrigoValle, 20.0, "Transaccion 3");
		Transaccion tran10 = new Transaccion(rodrigoValle, 70.0, "Transaccion 4");
		Transaccion tran11 = new Transaccion(rodrigoValle, 20.0, "Transaccion 5");

		tran1.start();
		Thread.sleep(2000);
		tran2.start();
		Thread.sleep(3000);
		tran3.start();
		Thread.sleep(1000);
		tran4.start();
		Thread.sleep(1000);
		tran5.start();
		Thread.sleep(1000);
		tran6.start();
		Thread.sleep(1000);
		System.out.println();
		System.out.println();
		tran7.start();
		Thread.sleep(1000);
		tran8.start();
		Thread.sleep(1000);
		tran9.start();
		Thread.sleep(1000);
		tran10.start();
		Thread.sleep(1000);
		tran11.start();


	}

}
