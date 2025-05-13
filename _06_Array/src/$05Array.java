import java.util.Arrays;

public class $05Array {
    public static void main(String[] args) {
        //  배열의 초기화
        int[] kor = {98, 99, 88};       // c언어시절부터 내려온 관습
        System.out.println("배열의 크기: " + kor.length);

        int[] math = {100, 80, 78, 99, 34};
        System.out.println("배열의 크기: " + math.length);

        int[] eng = new int[]{100, 90, 89, 34};
        System.out.println("배열의 크기: " + eng.length);

        // 배열의 출력
        System.out.println(Arrays.toString(kor));
        System.out.println(Arrays.toString(math));
        System.out.println(Arrays.toString(eng));

        // for문으로 출력
        for(int i=0;i<kor.length;i++)
            System.out.print(kor[i] + " ");
        System.out.println();

        for(int i=0;i<math.length;i++)
            System.out.print(math[i] + " ");
        System.out.println();

        for(int i=0;i<eng.length;i++)
            System.out.print(eng[i] + " ");
        System.out.println();
    }
}  
