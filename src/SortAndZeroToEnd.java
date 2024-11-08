import java.util.Arrays;

public class SortAndZeroToEnd {
    public static void main(String[] args) {
        int[] array = {8, 6, 1, 0, 0, 9, 0, 2, 4, 3};
        System.out.println(Arrays.toString(bubbleSort(array)));
        int[] array2 = {1, 0, 2, 5, 4, 3};
        System.out.println(Arrays.toString(secondSort(array2)));
        int[] array3 = {0, 0, 2, 0, 4, 1, 0, 3};
        System.out.println(Arrays.toString(zero(array3)));
        int[] array4 = {3, 0, 0, 0, 0, 1, 0, 9};
        System.out.println(Arrays.toString(zero2(array4)));
        int[] array5 = {0, 1, 0, 2, 0, 3};
        System.out.println(Arrays.toString(zero3(array5)));
    }

    public static int[] bubbleSort(int[] array) {
        boolean flag = false;
        while (!flag) {
            flag = true;
            for(int i=0; i<array.length-1; i++) {
                if(array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = false;
                }
            }
        }
        return array;
    }

    public static int[] secondSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1; j > i; j--) {
                if (array[j] < array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] zero(int[] array) {
        int j=0;
        for (int i = 0; i < array.length; i++) {
             if(array[i] != 0) {
                 int temp = array[i];
                 array[i] = array[j];
                 array[j] = temp;
                 j++;
             }
        }
        return array;
    }

    public static int[] zero2(int[] array) {
        int j = 0;
        int[] sorted = new int[array.length];
        for (int k : array) {
            if (k != 0) {
                sorted[j++] = k;
            }
        }
        return sorted;
    }

    public static int[] zero3(int[] array) {
        int j = 0;
        for (int i : array) {
            if (i != 0) {
                array[j++] = i;
            }
        }
        for(int i=j; i<array.length; i++) {
            array[i] = 0;
        }
        return array;
    }
}
