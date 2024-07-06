package LAB11;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxArrayListE{
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("school", "ball", "mouse", "house"));

        System.out.println("Max in Integer list: " + max(intList));
        System.out.println("Max in String list: " + max(strList));
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list == null || list.isEmpty()) {
            return null; // No elements to compare
        }

        E max = list.get(0);
        for (E element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
