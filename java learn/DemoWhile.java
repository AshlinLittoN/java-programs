//while loop example

// public class DemoWhile {
//     public static void main(String[] args) {
//         for(int i=1;i<=10;i++)
//             System.out.println(i);
//     }
// }

//do-while loop example1
// public class DemoWhile{
//     public static void main(String[] args) {
        
//         int num=0;
//         do{
//             System.out.println("Ash");
//             num=num+1;
//         }while(num<=5);
                
//     }
// }

//do-while explae2
import java.util.Scanner;
public class DemoWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num=0;
        do{
            System.out.println("Enter a number");
            num=sc.nextInt();
        }while(num<10);


    }
}

