import java.util.Scanner;

public class $01Arith {
    public static void main(String[] args) {
        // 변수 선언/초기화
        int result = 0;
        int num0 = 0, num1 = 0;

        // java에서 입력을 위한 객체 선언
        Scanner sc = new Scanner(System.in);

        System.out.println("사칙칙 연산을 시작합니다.");
        System.out.print("1번째 숫자 입력 >> ");
        num0 = sc.nextInt();
        System.out.print("2번째 숫자 입력 >> ");
        num1 = sc.nextInt();

        result = num0 + num1;
        System.out.println("+ 연산은 " + result + "입니다.");
        result = num0 - num1;
        System.out.println("- 연산은 " + result + "입니다.");
        result = num0 * num1;
        System.out.println("* 연산은 " + result + "입니다.");
        result = num0 / num1;       // 몫
        System.out.println("/ 연산은 " + result + "입니다.");
        result = num0 % num1;       // 나머지
        System.out.println("% 연산은 " + result + "입니다.");
        
        // 입력 종료
        sc.close();
    }
}
