// 10. 정수 배열 5개를 할당하고
//    Arrays.sort를 사용하지 말고
//    배열을 오름차순으로 정렬하도록 저장하세요.
//    그리고 출력하세요.

import java.util.Arrays;

public class $10Resolve {
    public static void main(String[] args) {
        int[] arr = {10, 99, 1, 78, 5};

        // 선택정렬 알고리즘

        // 정렬한 공간 위치 기준값
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            int sel = i;

            // 기준값 이후 값들을 비교해서 
            // 더 작으면 교체
            for(int j=i+1;j<arr.length;j++){
                if(min > arr[j]){
                    min = arr[j];
                    sel = j;
                }
            }

            // 현재 기준 위치의 값과 최소값의 위치 값을 교체
            int temp = arr[i];
            arr[i] = min;
            arr[sel] = temp;

        }

        System.out.println(Arrays.toString(arr));   
    }
}
