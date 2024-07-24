// Take an array as input from user. Search for a given number X and print the index at which it occurs. 
import java.util.*;

public class Day1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();

        System.out.print("Enter the Arrays: ");
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the X: ");

        int x = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.print("Index: " + i);
            }
           

        }
        System.out.println();

    }
}