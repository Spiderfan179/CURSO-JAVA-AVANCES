package Producers.Consumers;

import java.util.Random;

public class Devs4jConsumer extends Thread
{
   private Devs4Resource resource;

public Devs4jConsumer(Devs4Resource resource,String name) 
{
	super(name);
	this.resource = resource;
}

@Override
public void run()
{
while (true) 
{
	int value;
	try {
		value = resource.consumer();
		System.out.printf("%S consumed %d \n",getName(),value);
	} catch (InterruptedException e) 
	{
		e.printStackTrace();
	}
	
	try 
	{
		Thread.sleep(new Random().nextInt(200));
	} catch (InterruptedException e) 
	{
		e.printStackTrace();
	}
	
}

}
   

   
}
