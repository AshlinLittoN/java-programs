import java.util.Scanner;

public class Variable2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        int result= d/e;
        System.out.println("Multiplication= "+d);
        System.out.println("Addition= "+d);
        System.out.println("REsult= "+result);
        
    }

    
}
