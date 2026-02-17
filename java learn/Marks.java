//else-if sample2

import java.util.Scanner;

public class Marks {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);

        int mark1 = scan.nextInt();
        int mark2 = scan.nextInt();
        int mark3 = scan.nextInt();
        int mark4 = scan.nextInt();
        int mark5 = scan.nextInt();

        int total=mark1+mark2+mark3+mark4+mark5;
        System.out.println("Total mark="+total);
        int avg=total/5;
        System.out.println("Average:"+avg);

        if(avg<35){
            System.out.print("Additional class is required");
        }
        else
            System.out.print("You are good to go");

    }
}


