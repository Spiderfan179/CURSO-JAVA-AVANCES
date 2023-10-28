package Practica;

import java.util.PriorityQueue;

public class PriorityQueeEjemplo {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> queue = new PriorityQueue<>();
       queue.offer(1000);
       queue.offer(200);
       queue.offer(5);
       queue.offer(100);
       System.out.println(queue);
       System.out.println(queue.peek());
       System.out.println(queue);
	}

}
