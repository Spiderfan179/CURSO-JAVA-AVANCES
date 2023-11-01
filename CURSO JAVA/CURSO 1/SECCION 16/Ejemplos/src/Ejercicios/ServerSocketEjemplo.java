package Ejercicios;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketEjemplo {

	public static void main(String[] args) throws IOException 
	{
	try(ServerSocket socket = new ServerSocket(8090))
	{
		System.out.println("Escuchando peticiones . .");
		Socket client = socket.accept();
		System.out.printf("Cliente %s conectado \n",client.getInetAddress().getHostName());
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String mensaje;
	do {	
		 mensaje = dis.readUTF();
		 System.out.printf("%s dice %S",client.getInetAddress().getHostName(),mensaje);
	    }while(!"salir".equals(mensaje));
	System.out.println("Conexion cerrada");
	}
		

	}

}
