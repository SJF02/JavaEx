import java.util.Arrays;

public class $09Array {

    public static void main(String[] args) {
        int[] scores = {100, 99, 28, 54, 56};
        // 깊은 복사(힙에 공간을 따로 할당)
        int[] scores1 = Arrays.copyOf(scores, scores.length);
        int[] scores2 = Arrays.copyOf(scores, scores.length);

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