// Write a java program to reverse the string with the help of stringbuilder 
import java.util.*;

public class Day4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String Str = sc.next();
        StringBuilder sb = new StringBuilder(Str);
        int Start = 0;
        int End = Str.length() - 1;

        while (Start < End) {

            char Startchar = sb.charAt(Start);

            sb.setCharAt(Start, sb.charAt(End));
            sb.setCharAt(End, Startchar);

            Start++;
            End--;

        }
        System.out.println("Reverse String: " + sb);
    }
}