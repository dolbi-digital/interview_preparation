import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseIntArray {
    public static void main(String[] args) {
        Integer[] array = {13,2,3,4,5,619,55};
        System.out.println(Arrays.toString(array));

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array));
        Collections.reverse(list1);
        System.out.println(list1);


        int[] array2 = new int[array.length];
        for (int i = array.length-1; i > 0;) {
            for (int j = 0; j < array.length; j++) {
                array2[j] = array[i];
                i--;
            }
        }
        System.out.println(Arrays.toString(array2));


        int n = array.length;
        int temp;
        for (int i = 0; i < n/2; i++) {
            temp = array[n-1-i];
            array[n-1-i] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}

