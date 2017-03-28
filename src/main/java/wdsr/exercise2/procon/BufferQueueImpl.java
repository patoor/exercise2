package wdsr.exercise2.procon;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 * Task: implement Buffer interface using one of *Queue classes from java.util.concurrent package.
 */
public class BufferQueueImpl implements Buffer {
	BlockingQueue<Order> queue = new LinkedBlockingQueue<>(100);
	public void submitOrder(Order order) throws InterruptedException {
		// TODO
		queue.put(order);
	}
	
	public Order consumeNextOrder() throws InterruptedException {
		// TODO
		return queue.take();
	}
}
