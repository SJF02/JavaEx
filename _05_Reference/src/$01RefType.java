import java.util.Arrays;

public class $01RefType {
    public static void main(String[] args) {
        // 배열(클래스), String클래스, 일반클래스 : Reference타입
        int[] arr = {10, 20, 30};       // 약식 선언(더 많이 사용)
        String name = "Albert";         // 약식 선언(더 많이 사용용)
        int[] arr1 = new int[3];        // 정식 선언
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        String name1 = new String("Paul");  // 정식 선언

        System.out.println(Arrays.toString(arr));
        System.out.println(name);
        System.out.println(Arrays.toString(arr1));
        System.out.println(name1);
        System.out.println();

        System.out.println(arr.hashCode());
        System.out.println(name.hashCode());
        System.out.println(arr1.hashCode());
        System.out.println(name1.hashCode());
    }
}
