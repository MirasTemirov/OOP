package LAB11;

import java.util.*;

public class LinkedListIteratorE {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTime = System.nanoTime();
        System.out.println("Time to use iterator: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time to use get(index): " + (endTime - startTime) + " ns");
    }
}

