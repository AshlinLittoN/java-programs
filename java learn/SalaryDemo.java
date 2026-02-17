import java.util.Scanner;

public class SalaryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your salary:");
        int salary=sc.nextInt();

        if(age<=25 || salary>=20000){
            System.out.println("Loan available!!");

            System.out.println("Loan Amount required:");
            int loanAmt = sc.nextInt();

            if(loanAmt<=50000){
                System.out.println("You are eligible for loan!!");
            }
            else
                System.out.println("Maximum loan amount is 50000!!");
        }
        else
            System.out.print("You are not eligible for loan");

    }
}
