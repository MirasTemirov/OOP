package LAB11;

public class MaxElementE {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"school", "ball", "mouse", "house"};

        System.out.println("Max in Integer array: " + max(intArray));
        System.out.println("Max in String array: " + max(strArray));
    }

    public static <E extends Comparable<E>> E max(E[] list) {
        if (list == null || list.length == 0) {
            return null; // No elements to compare
        }

        E max = list[0];
        for (E element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}

