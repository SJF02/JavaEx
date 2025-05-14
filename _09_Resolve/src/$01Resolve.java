// 1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
//    작은 값을 반환하는 메서드를 작성하고 사용하세요
public class $01Resolve {

    public static int max(int num0, int num1){
        int sel = (num0 > num1) ? num0 : num1;
        return sel;
    }
    public static int min(int num0, int num1){
        int sel = (num0 < num1) ? num0 : num1;
        return sel;
    }
    public static void main(String[] args) {
        int a = 100, b = 50;
        int result = 0;

        result = max(a, b);
        System.out.println("100과 50중에 큰 수는 " + result);
        result = min(a, b);
        System.out.println("100과 50중에 작은 수는 " + result);
    }
}
