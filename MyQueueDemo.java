/********************************
* 
* MyQueueDemo
*
* Demonstriert die Funktionsweise
* der MyQueue-Klasse
********************************/

import java.util.Random;

public class MyQueueDemo {

    public static void main (String[] args) {
        // Integerqueue:
        MyQueue<Integer> intQueue = new MyQueue<>();

        // Basic tests
        System.out.println("Integer queue:");
        System.out.println(intQueue.size());
        System.out.println("Empty?");
        System.out.println(intQueue.isEmpty());
        System.out.println("Still trying to dequeue");
        System.out.println(intQueue.dequeue());
        System.out.println(intQueue.size());
        System.out.println("Empty?");
        System.out.println(intQueue.isEmpty());

        intQueue.enqueue(1);

        System.out.println("Integer queue:");
        System.out.println(intQueue.size());
        System.out.println("Empty?");
        System.out.println(intQueue.isEmpty());
        System.out.println(intQueue.dequeue());
        System.out.println(intQueue.size());
        System.out.println("Empty?");
        System.out.println(intQueue.isEmpty());

        intQueue.enqueue(2);

        System.out.println("Integer queue:");
        System.out.println(intQueue.size());
        System.out.println("Empty?");
        System.out.println(intQueue.isEmpty());
        System.out.println(intQueue.dequeue());
        System.out.println(intQueue.size());
        System.out.println("Empty?");
        System.out.println(intQueue.isEmpty());

        // Befuellen:
        for (int i=0; i<1000; i++) {
            intQueue.enqueue(i);
        }
        System.out.println(intQueue.size());
        System.out.println("Empty?");
        System.out.println(intQueue.isEmpty());

        // 1000 zufaellige Operationen:
        Random R = new Random();
        for (int i=0; i<1000; i++) {
            int r = R.nextInt(3);
            switch (r) {
                case 0: intQueue.enqueue(i);
                        System.out.println("Enqueued "+i+", size is now "+intQueue.size());
                        break;
                case 1: System.out.println("Dequeued "+intQueue.dequeue()+", size is now "+intQueue.size());
                        break;
                case 2: System.out.println("Peeked "+intQueue.peek()+", size is still "+intQueue.size());
                        break;
            }
        }

        // Stringqueue:
        MyQueue<String> stringQueue = new MyQueue<>();
        // Befuellen:
        for (int i=0; i<1000; i++) {
            stringQueue.enqueue("Kunde Nummer "+i);
        }
        System.out.println("String queue:");
        System.out.println(stringQueue.size());
        System.out.println("Empty?");
        System.out.println(stringQueue.isEmpty());

        // 1000 zufaellige Operationen:
        for (int i=0; i<1000; i++) {
            int r = R.nextInt(3);
            switch (r) {
                case 0: stringQueue.enqueue("Steuereintreiber Nummer " + i);
                        System.out.println("Enqueued Steuereintreiber Nummer "+i+", size is now "+stringQueue.size());
                        break;
                case 1: System.out.println("Dequeued "+stringQueue.dequeue()+", size is now "+stringQueue.size());
                        break;
                case 2: System.out.println("Peeked "+stringQueue.peek()+", size is still "+stringQueue.size());
                        break;
            }
        }

        // Integerqueuequeue:
        MyQueue<MyQueue<Integer>> queueQueue = new MyQueue<>();
        MyQueue<Integer> fillqueue = new MyQueue<>();;
        // Befuellen:
        for (int i=0; i<1000; i++) {
            fillqueue = new MyQueue<>();
            fillqueue.enqueue(i);
            queueQueue.enqueue(fillqueue);
        }
        System.out.println("Integer queue queue:");
        System.out.println(queueQueue.size());
        System.out.println("Empty?");
        System.out.println(queueQueue.isEmpty());

        // 1000 zufaellige Operationen:
        for (int i=0; i<1000; i++) {
            int r = R.nextInt(3);
            fillqueue.enqueue(i);
            switch (r) {
                case 0: queueQueue.enqueue(fillqueue);
                        System.out.println("Enqueued Queue "+fillqueue+", size is now "+queueQueue.size());
                        break;
                case 1: fillqueue = queueQueue.dequeue();
                        System.out.println("Dequeued "+fillqueue+", size is now "+queueQueue.size());
                        break;
                case 2: System.out.println("Peeked "+queueQueue.peek()+", size is still "+queueQueue.size());
                        break;
            }
        }
    }

}
