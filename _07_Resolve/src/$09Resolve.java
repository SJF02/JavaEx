// 9. 정수 배열 5개를 할당하고
//    System.out.println(Arrays.toString(numArr));
//    로 배열을 출력했을 때 거꾸로 출력되도록
//    배열의 값을 거꾸로 저장하세요.

import java.util.Arrays;

public class $09Resolve {
    public static void main(String[] args) {
        int[] numArr = {10, 99, 1, 78, 5};

        System.out.println(Arrays.toString(numArr));

        for(int i=0;i<numArr.length/2;i++){
            int temp = numArr[i];
            numArr[i] = numArr[numArr.length-1-i];
            numArr[numArr.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(numArr));
    }
}
