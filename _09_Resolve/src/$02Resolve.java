// 2. 두 개의 정수를 받아서, 두 수의 차의 절대값을 계산하여 출력하는 메서드를 만들고
//  사용해보세요. 메서드 호출 시 전달되는 값의 순서와 상관없이
// 절대값이 계산되어서 출력되어야 합니다
public class $02Resolve {
    public static void abs(int num0, int num1){
        int val = (num0 > num1) ? (num0-num1) : (num1-num0);
        System.out.println("두수의 차의 절대값은 " + val + "입니다.");
    }
    public static void main(String[] args) {
        int a = 100, b = 50;
        abs(a, b);
        abs(b, a);
    }
}
