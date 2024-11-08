import java.util.Arrays;
import java.util.HashMap;

public class CountNumbersWithoutHashMap {
    public static void main(String[] args) {
        int[] array = {6, 5, 88, 1, 2, 6, 6, 6, 5, 6, 6, 3, 3, 3, 5, 2, 5};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer i : array) {
            if(!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i)+1);
            }
        }
        System.out.println(map);

        for(int i=0; i<array.length; i++) {
            for(int j = array.length-1; j>i; j--){
                if(array[j] > array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        boolean flag = false;
        while (!flag) {
            flag = true;
            for(int i=0; i<array.length-1; i++) {
                if(array[i] > array[i+1]) {
                    flag = false;
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));

        int currentElement = array[0];
        int count = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == currentElement) {
                count++;
            }
            else {
                System.out.println("Element: " + currentElement + ", Count: " + count);
                count = 1;
                currentElement = array[i];
            }
        }
        System.out.println("Element: " + currentElement + ", Count: " + count);
    }
}
