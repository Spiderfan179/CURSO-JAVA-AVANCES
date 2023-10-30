package Producers.Consumers;

import java.util.Random;

public class Devs4jProducer extends Thread
{
private Devs4Resource resource;

public Devs4jProducer(Devs4Resource resource,String name)
{
	super(name);
	this.resource = resource;
}

@Override
public void run() 
{
while (true)
{
	try {
		int value = new Random().nextInt(0,1000);
		System.out.printf("%S produce %d \n",getName(),value);
		resource.produce(new Random().nextInt(0,1000));
		Thread.sleep(new Random().nextInt(300));
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
}
}


}
