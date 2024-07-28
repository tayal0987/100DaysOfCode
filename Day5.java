// // Write the java program to sort an array using bubblesort 
// public class Day5 {
//     public static void BubbleSort(int array[]) {
//         for (int i = 0; i < array.length - 1; i++) {
//             for (int j = 0; j < array.length - i - 1; j++) {
//                 if (array[j] > array[j + 1]) {

//                     // Swap the Elements 
//                     int temp = array[j];
//                     array[j] = array[j + 1];
//                     array[j + 1] = temp;
//                 }
//             }
//         }
//     }
//     public static void main(String args[]) {
//         int array[] = { 5, 9, 8, 4, 2, 3, 1, 7, 5 };

//         System.out.print("Bubble Sort: ");
//         BubbleSort(array);

//         for (int i = 0; i < array.length; i++) {
//             System.out.print(array[i] + " ");
//         }
//     }
// }

// Selection sort
// public class Day5 {
//     public static void SelectionSort(int array[]) {
//         for (int i = 0; i < array.length - 1; i++) {
//             int Smallest = i;

//             for (int j = i + 1; j < array.length; j++) {
//                 if (array[Smallest] > array[j]) {
//                     Smallest = j;
//                 }
//             }
//             // Swap the Elements
//             int temp = array[Smallest];
//             array[Smallest] = array[i];
//             array[i] = temp;
//         }
//     }
//     public static void main(String args[]) {
//         int array[] = { 5, 9, 8, 4, 2, 3, 1, 7, 5 };

//         System.out.print("Selection Sort: ");
//         SelectionSort(array);

//         for (int i = 0; i < array.length; i++) {
//             System.out.print(array[i] + " ");
//         }
//     }
// }

// Insertion sort
public class Day5 {
    public static void InsertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int j = i;

            while (j > 0 && array[j] < array[j - 1]) {
                // swap the elements
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
        }
    }
    public static void main(String args[]) {
        int array[] = { 5, 9, 8, 4, 2, 3, 1, 7, 5 };

        System.out.print("Insertion Sort: ");
        InsertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
