// 7. 정수 배열 5개를 할당하고
//    Arrays.sort를 활용해서 최소값과 최대값을 얻으세요

import java.util.Arrays;

public class $07Resolve {
    public static void main(String[] args) {
        int[] arr = {10, 99, 1, 78, 5};

        Arrays.sort(arr);

        System.out.println("최소값 : " + arr[0]);
        System.out.println("최대값 : " + arr[arr.length-1]);
    }
}
