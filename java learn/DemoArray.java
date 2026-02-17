import java.util.Scanner;

public class DemoArray {
    public static void main(String[] args){
        
        // int[] addition = new int[5];

        // Scanner sc=new Scanner(System.in);
        
        // addition[0] =sc.nextInt();
        // addition[1] =sc.nextInt();
        // addition[2] =sc.nextInt();
        // addition[3] =sc.nextInt();
        // addition[4] =sc.nextInt();
        // int total=addition[0]+addition[1]+addition[2]+addition[3]+addition[4];
        // System.out.println("Total="+total);



        Scanner sc=new Scanner(System.in);

        int[] Numbers=new int[10];

        System.out.println("Give 10 numbers:");
        for(int i=0;i<=9;i=i+1){
            Numbers[i]=sc.nextInt();
        }
        for(int i=0;i<=9;i=i+1){
            System.out.println("The numbers are:"+Numbers[i]);
        }
    }
}
