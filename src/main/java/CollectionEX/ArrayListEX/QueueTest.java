package CollectionEX.ArrayListEX;

import java.util.ArrayList;

class MyQueue<T>{
    private ArrayList<T> arrayListQueue = new ArrayList<>();

    public void enQueue(T data){
        arrayListQueue.add(data);
        System.out.println("push : "+data);
    }

    public T deQueue(){
        int len = arrayListQueue.size();
        if (arrayListQueue.size() == 0) {
            System.out.println("Empty");
            return null;
        }
        return arrayListQueue.remove(0);
    }
}


public class QueueTest {
    public static void main(String[] args){
        MyQueue Queue = new MyQueue();

        Queue.enQueue("a");
        Queue.enQueue("b");
        Queue.enQueue("c");

        System.out.println("deQueue : "+Queue.deQueue());
        System.out.println("deQueue : "+Queue.deQueue());
        System.out.println("deQueue : "+Queue.deQueue());
    }
}
