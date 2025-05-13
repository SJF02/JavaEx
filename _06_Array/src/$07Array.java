import java.util.Arrays;

public class $07Array {
    public static void main(String[] args) {
        int[] arr0 = {1, 2, 3};
        int[] arr1 = new int[arr0.length];
        int[] arr2 = new int[arr0.length];

        for(int i=0;i<arr0.length;i++)
            arr1[i] = arr0[i];

        System.out.println(Arrays.toString(arr1));

        System.arraycopy(arr0, 0, arr2, 0, arr0.length);
        System.out.println(Arrays.toString(arr2));
    }
}
