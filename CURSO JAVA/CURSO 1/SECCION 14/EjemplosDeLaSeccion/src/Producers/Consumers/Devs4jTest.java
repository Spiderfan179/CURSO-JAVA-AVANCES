package Producers.Consumers;

public class Devs4jTest {

	public static void main(String[] args) throws InterruptedException 
	{
		Devs4Resource resource = new Devs4Resource();
		Devs4jConsumer consumer1 = new Devs4jConsumer(resource,"consumer 1");
		Devs4jConsumer consumer2 = new Devs4jConsumer(resource,"consumer 2");
		
		Devs4jProducer producer1 = new Devs4jProducer(resource,"Producer 1");
		Devs4jProducer producer2 = new Devs4jProducer(resource,"Producer 2");
	
	producer1.start();
	producer2.start();
	consumer1.start();
	consumer2.start();
	
	}

}
