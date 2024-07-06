package LAB11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesE {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        System.out.println("Original list: " + intList);
        System.out.println("List without duplicates: " + removeDuplicates(intList));
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        HashSet<E> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}

