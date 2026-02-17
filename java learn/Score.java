//using else if
import java.util.Scanner;

public class Score {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int score=sc.nextInt();
        if(score<50){
            System.out.print("you need to improve");
        }
        else if(score>=50 && score<70){
            System.out.print("Good job");
        }
        else{
            System.out.print("Excellent job");
        }
    }
}
