package array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayIterationDemo {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        // 1. Classic for loop
        System.out.println("1. Using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 2. Enhanced for loop
        System.out.println("\n2. Using enhanced for loop:");
        for (int value : arr) {
            System.out.println(value);
        }

        // 3. While loop
        System.out.println("\n3. Using while loop:");
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }

        // 4. Do-while loop
        System.out.println("\n4. Using do-while loop:");
        i = 0;
        do {
            System.out.println(arr[i]);
            i++;
        } while (i < arr.length);

        // 5. Using Streams
        System.out.println("\n5. Using Streams:");
        Arrays.stream(arr).forEach(System.out::println);

        // 6. Using IntStream
        System.out.println("\n6. Using IntStream:");
        IntStream.of(arr).forEach(System.out::println);
    }
}
