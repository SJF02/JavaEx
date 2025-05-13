import java.util.Scanner;

public class $01Method {

    // public static [결과값 자료형] [함수명] ([매개입력변수0, 매개입력변수1, ...])
    public static int calcArith(String op, int num0, int num1){
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
        // 메서드를 호출한 곳으로 result값을 가지고 돌아가라.
        // (이 메서드의 업무처리가 끝나고 결과보고)
        return result;
    }
    public static void main(String[] args) throws Exception {
        // 사칙연산 메서드 분리

        /*사칙연산 입력-연산-출력 */
        Scanner sc = new Scanner(System.in);

        System.out.print("1번째 정수 입력 >> ");
        int num0 = sc.nextInt();
        System.out.print("2번째 정수 입력 >> ");
        int num1 = sc.nextInt();
        System.out.print("연산자 입력(+ - * / %) >> ");
        String op = sc.next();
        int result = 0;

        /*
         calcArith에 전달할 값은 괄호에 매개변수로 전달한다.
         calcArith가 return한 값이 result에 전달된다.
         => calcArith한테 업무지시 후 보고 받는다.
        */
        result = calcArith(op, num0, num1);

        System.out.println("결과값은 " + result + "입니다.");

        sc.close();
    }
}
