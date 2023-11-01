package Ejercicios;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {

	public static void main(String[] args) throws UnknownHostException, IOException
	{
	try(Socket s = new Socket("localhost",8090);
			DataOutputStream dos = new DataOutputStream(s.getOutputStream()))
	{
		dos.writeUTF("Hola soy un cliente del socket \n");
		dos.writeUTF("salir");
	}

	}

}
