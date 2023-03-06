package ch6_oop;

public class Exercise6_20 {
    static int[] shuffle(int[] arr) {
        int size = arr.length;
        if (arr==null || size==0) {
            return arr;
        }
        int i=0;
        while (i<size) {
            int new_idx1 = (int)(Math.random()*size);
            int new_idx2 = (int)(Math.random()*size);
            int tmp = arr[new_idx1];
            arr[new_idx1] = arr[new_idx2];
            arr[new_idx2] = tmp;
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
