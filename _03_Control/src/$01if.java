import java.util.Scanner;

public class $01if {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 입력 >> ");
        int score = sc.nextInt();

        if(score >= 90)
            System.err.println("A학점");
        else
            System.out.println("A학점이 아닙니다");

        sc.close();
    }
}
