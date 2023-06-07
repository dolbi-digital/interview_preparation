import java.util.Arrays;

public class SortArrayBad {
    //Task1
// What will be the value of the “values” variable after execution of the following code snippet?
//
    public static void main(String[] args) {
        int[] values = {23, 12, 13, 17, 23, 19};

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > values[i + 1]) {
                int t = values[i];
                values[i] = values[i + 1];
                values[i + 1] = t;
            }
        }

        System.out.println(Arrays.toString(values));

        for(int i = 0; i < values.length; i++) {
            System.out.print(values[i] + "  ");
        }
    }

// 1. {12, 13, 17, 19, 23, 23}
// 2. {23, 23, 19, 17, 13, 12}
// 3. {12, 13, 17, 23, 19, 23}
// 4. {12, 13, 23, 17, 19, 23}
}
