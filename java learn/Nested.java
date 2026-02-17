// import java.util.Scanner;
// public class Nested{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Give sixe of an array:");
//         int size = sc.nextInt();

//         for(int i=0;i<=size-1;i++){
//             for(int j=1;j<=2;j++){
//                 System.out.println("Ashlin");
//             }
        
//         }

//     }
// }


//teacher told to print john 5 times
// import java.util.Scanner;

// public class Nested{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter word john 5 times:");
//         for(int i=0;i<=1;i++){
//             for(int j=1;j<=5;j++){
//                 System.out.println("John");
//             }
//         }
//     }
// }


import java.util.Scanner;

public class Nested{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the pattern:");
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }    
    }
}