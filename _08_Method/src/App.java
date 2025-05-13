import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 메서드를 만들기 전의 코드

        /*사칙연산 입력-연산-출력 */
        Scanner sc = new Scanner(System.in);

        System.out.print("1번째 정수 입력 >> ");
        int num0 = sc.nextInt();
        System.out.print("2번째 정수 입력 >> ");
        int num1 = sc.nextInt();
        System.out.print("연산자 입력(+ - * / %) >> ");
        String op = sc.next();
        int result = 0;

        switch(op){
            case "+":
                result = num0 + num1;
                break;
            case "-":
                result = num0 - num1;
                break;
            case "*":
                result = num0 * num1;
                break;
            case "/":
                result = num0 / num1;
                break;
            case "%":
                result = num0 % num1;
                break;
            default:
                System.out.println("연산이 불가능합니다.");
                break;
        }

        System.out.println("결과값은 " + result + "입니다.");

        sc.close();
    }
}
