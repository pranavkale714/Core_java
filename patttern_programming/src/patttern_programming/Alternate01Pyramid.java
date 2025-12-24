import java.util.*;

public class Alternate01Pyramid {

    public static void main(String[] args) {
        int start;

        // Outer loop for the number of rows
        for (int i = 0; i < 5; i++) {
            // If the row index is even, print 0 first, else 1
            if (i % 2 == 0)
                start = 0;
            else
                start = 1;

            // Inner loop to print alternating 0's and 1's
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start; // alternate
            }

            // New line after each row
            System.out.println();
        }
    }
}
