package Producers.Consumers;

import java.util.LinkedList;

public class Devs4Resource
{
LinkedList<Integer> resources = new LinkedList<>();

public synchronized int consumer() throws InterruptedException 
{
	while (resources.size()<=0)
	{
		wait();	
	}
	return resources.poll();
}

public synchronized void produce(int value) 
{
	resources.offer(value);
	notifyAll();
	}
}
