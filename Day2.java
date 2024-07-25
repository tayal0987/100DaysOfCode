//Write a Java program to find the maximum & minimum number in an array of integers. 
import java.util.*;
public class Day2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();

        System.out.print("Enter the Arrays: ");
        int array[]=new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();

        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < size; i++) {
            if(array[i] > max){
                max=array[i];

            }
            else if(array[i] < min){
            min = array[i];
            }
        }
        System.out.println("Maxima: "+max);
        System.out.println("Minima: "+min);

    }
}