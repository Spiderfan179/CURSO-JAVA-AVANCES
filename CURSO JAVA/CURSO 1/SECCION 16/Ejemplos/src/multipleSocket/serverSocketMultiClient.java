package multipleSocket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class WorkerSocket extends Thread
{
	private Socket client;

	public WorkerSocket(Socket client)
	{
		super();
		this.client = client;
	}

	@Override
	public void run() 
	{
    try (DataInputStream dis = new DataInputStream(client.getInputStream());)
    {
    	String mensaje;
    	do {
		     mensaje = dis.readUTF();
		     System.out.printf("%s dice: %S \n",client.getInetAddress().getHostName(),mensaje);
		} while ("salir".equals(mensaje));
    }catch (IOException e) 
    {
		System.err.println("Error al conectarse con el cliente"+e .getMessage());
	}
	}
	
	
}

public class serverSocketMultiClient {

	public static void main(String[] args) throws IOException
	{
		try(ServerSocket ss = new ServerSocket(8090);)
		{
		   while(true) 
		   {
			   System.out.println("escuchando clientes . .");
			 Socket cliente=  ss.accept();
			 System.out.printf("cliente conectado: %s ",cliente.getInetAddress().getHostName());
			 new WorkerSocket(cliente).start();
		   }
		}

	}

}
