package com.$05stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Sample {
    // 짝수만 뽑아서 중복을 제거한 후 역순으로 정렬하는 프로그램
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};

        ArrayList<Integer> dataList = new ArrayList<>();
        for(int i=0;i<data.length;i++){
            if(data[i] % 2 == 0)
                dataList.add(data[i]);
        }

        HashSet<Integer> dataSet = new HashSet<>(dataList);

        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);

        distinctList.sort(Comparator.reverseOrder());

        int[] result = new int[distinctList.size()];
        for(int i=0;i<distinctList.size();i++)
            result[i] = distinctList.get(i);

        System.out.println(Arrays.toString(result));
    }
}
