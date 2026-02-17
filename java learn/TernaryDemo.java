//ternary example

import java.util.Scanner;

public class TernaryDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1:");
        int num1=sc.nextInt();
        System.out.print("Enter number2:");
        int num2=sc.nextInt();

        int greater=(num1>num2) ? num1:num2;
        System.out.println("Greater number="+greater);
    }
}
