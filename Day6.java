// Implement a Basic Calculator using oops concepts

import java.util.Scanner;
class Calculator {
    int num1;
    int num2;

    Calculator(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    public int Add() {
        return num1 + num2;
    }

    public int Sub() {
        return num1 - num2;
    }

    public int Mul() {
        return num1 * num2;
    }

    public int Div() {
        return num1 / num2;
    }

    public int Modulus() {
        return num1 % num2;
    }
}
public class Day6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value a: ");
        int a = sc.nextInt();

        System.out.print("Enter the Symbol(+,-,*,/): ");
        String Symbol = sc.next();

        System.out.print("Enter the Value b: ");
        int b = sc.nextInt();

        Calculator Calculator1 = new Calculator(a, b);

        if (Symbol.equals("+")) {
            System.out.println("Addition: " + Calculator1.Add());
        } else if (Symbol.equals("-")) {
            System.out.println("Subtraction: " + Calculator1.Sub());

        } else if (Symbol.equals("*")) {
            System.out.println("Multiply : " + Calculator1.Mul());

        } else if (Symbol.equals("/")) {
            System.out.println("Divide: " + Calculator1.Div());
        } else if (Symbol.equals("%")) {
            System.out.println("Modulus: " + Calculator1.Div());
        }

    }
}
