import java.util.Arrays;

public class SortArrayZeroToEnd {
    public static void main(String[] args) {
        int[] array = {0, 0, 8, 8 ,3, 0, 0, 4, 0, 6, 0, 9, 1};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(pivotPoint(array)));
        int[] array2 = {0, 0, 8, 8 ,3, 0, 0, 4, 0, 6, 0, 9, 1};
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(anotherArray(array2)));
        int[] array3 = {0, 0, 8, 8 ,3, 0, 0, 4, 0, 6, 0, 9, 1};
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(reorder(array3)));
    }

    public static int[] pivotPoint(int[] array) {
        int j = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] != 0) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                j++;
            }
        }
        return array;
    }

    public static int[] anotherArray(int[] array) {
        int[] another = new int[array.length];
        int j = 0;
        for (int i : array) {
            if (i != 0) {
                another[j] = i;
                j++;
            }
        }
        return another;
    }

    public static int[] reorder(int[] array)
    {
        int j = 0;
        for (int i: array)
        {
            if (i != 0) {
                array[j++] = i;
            }
        }

        for (int i = j; i < array.length; i++) {
            array[i] = 0;
        }
        return array;
    }
}



