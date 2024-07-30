// Write a Java program to implement a linear search algorithm that searches for a specific element in an array.
// import java.util.*;
// public class Day7 {
//     public static int LinearSearch(int array[], int Target) {

//         for (int i = 0; i < array.length; i++) {

//             if (array[i] == Target) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the Size of Array: ");
//         int size = sc.nextInt();

//         System.out.print("Enter the Arrays: ");
//         int array[] = new int[size];

//         for (int i = 0; i < size; i++) {
//             array[i] = sc.nextInt();
//         }

//         System.out.print("Enter the Target: ");
//         int Target = sc.nextInt();

//         int Index = LinearSearch(array, Target);

//         if (Index != -1) {
//             System.out.println("Target found at index: " + Index);
//         } else {
//             System.out.println("Target Not found");
//         }
//     }
// }

// Write a Java program to implement a Binary search algorithm that searches for a specific element in an array.
import java.util.*;
public class Day7 {
    public static int BinarySearch(int array[], int Target) {
        int Start = 0;
        int End = array.length - 1;

        while (Start <= End) {
            int mid = Start + (End - Start) / 2;
            if (array[mid] == Target) {
                return mid;
            } else if (array[mid] < Target) {
                Start = mid + 1;
            } else {
                End = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();

        System.out.print("Enter the Arrays: ");
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        

        System.out.print("Enter the Target: ");
        int Target = sc.nextInt();

        int index = BinarySearch(array, Target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }
}
