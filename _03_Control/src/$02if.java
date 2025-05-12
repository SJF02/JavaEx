import java.util.Scanner;

public class $02if {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 입력 >> ");
        int score = sc.nextInt();

        if(score >= 90)
            System.err.println("A학점");
        else if(score >= 80)
            System.out.println("B학점");
        else if(score >= 70)
            System.out.println("C학점");
        else if(score >= 60)
            System.out.println("D학점");
        else
            System.out.println("F학점");            

        sc.close();
    }
}
