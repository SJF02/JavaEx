import java.util.Arrays;

public class $08Array {
    public static void main(String[] args) {
        int[] scores = {100, 99, 28, 54, 56};
        // 얕은 복사(참조 해시코드를 복사해서 같은 힙 공간을 가리키게 됨)
        int[] scores1 = scores;
        int[] scores2 = scores;

        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(scores1));
        System.out.println(Arrays.toString(scores2));

        scores1[2] = 99999;
        scores2[3] = 11111;

        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(scores1));
        System.out.println(Arrays.toString(scores2));
    }
}
