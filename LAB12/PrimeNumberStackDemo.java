package LAB12;

import java.util.Stack;

public class PrimeNumberStackDemo {
    public static void main(String[] args) {
        Stack<Integer> primeNumbersStack = new Stack<>();
        int foundPrimes = 0;
        int candidate = 2;

        while (foundPrimes < 50) {
            if (isPrime(candidate)) {
                primeNumbersStack.push(candidate);
                foundPrimes++;
            }
            candidate++;
        }

        System.out.println("Первые 50 простых чисел в порядке убывания:");
        while (!primeNumbersStack.isEmpty()) {
            System.out.print(primeNumbersStack.pop() + " ");
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}

