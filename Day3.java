// Write a java program to find kth maximum and kth miniimum element of an array.
import java.util.*;
public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();
        System.out.print("Enter the Arrays: ");
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        // Sort the array 
        Arrays.sort(array);

        int Start = 0;
        
        // Remove duplicate from the array 
        for (int End = 1; End < size; End++) {
            if (array[Start] != array[End]) {
                Start++;
                array[Start] = array[End];
            }
        }
        int x = Start + 1;
        if (k > 0 && k <= x) {
            System.out.println("kth Minimum element is: " + array[k - 1]);
            System.out.println("kth Maximum element is: " + array[x - k]);
        } else {
            System.out.println("Invalid value of k. Please enter a value between 1 and " + x);
        }
    }
}