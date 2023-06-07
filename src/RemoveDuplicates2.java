import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

class RemoveDuplicates2 {

    static void removeDuplicates(int[] arr) {
        System.out.println(Arrays.toString(Arrays.stream(arr).distinct().toArray()));
    }

    static void removeDuplicates2(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr) {
            set.add(i);
        }

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        int[] result = new int[set.size()];
        int k = 0;
        for (int i: set) {
            result[k++] = i;
        }
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args)
    {
        int[] arr = {9, 9, 1, 2, 2, 3, 4, 4, 4, 5, 5, 5};
        int[] arr2 = {2, 4, 1, 2, 1, 2, 4, 5};
        removeDuplicates(arr);
        removeDuplicates2(arr2);
    }
}

