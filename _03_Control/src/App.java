import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 입력 >> ");
        int score = sc.nextInt();

        if(score >= 90)
            System.err.println("A학점");

        // if(score >= 90){
        //     System.err.println("A학점");
        // }            

        sc.close();
    }
}
