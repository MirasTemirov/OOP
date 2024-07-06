package LAB12;

import java.util.LinkedList;

public class QueueInheritance<E> extends LinkedList<E> {
    public void enqueue(E element) {
        addLast(element);
    }

    public E dequeue() {
        return removeFirst();
    }

    public static void main(String[] args) {
        QueueInheritance<Integer> numberQueue = new QueueInheritance<>();
        numberQueue.enqueue(10);
        numberQueue.enqueue(20);
        numberQueue.enqueue(30);
        numberQueue.enqueue(40);
        numberQueue.enqueue(50);

        System.out.println("Элемент удалён из очереди: " + numberQueue.dequeue());
        System.out.println("Очередь после удаления элемента: " + numberQueue);
    }
}

