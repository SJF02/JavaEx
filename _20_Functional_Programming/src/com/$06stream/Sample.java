package com.$06stream;

import java.util.Arrays;
import java.util.Comparator;

public class Sample {
    // 짝수만 뽑아서 중복을 제거한 후 역순으로 정렬하는 프로그램
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data)
                        .boxed()
                        .filter((a) -> a%2==0)
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .mapToInt(Integer::intValue)
                        .toArray();
        System.out.println(Arrays.toString(result));
    }
}
