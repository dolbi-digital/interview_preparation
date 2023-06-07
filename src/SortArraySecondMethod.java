import java.util.Arrays;

public class SortArraySecondMethod {
    public static void main(String[] args) {
        int [] mas = {11, 111, 3, 14, 16, 7, 88, 0, -999};

        for(int i=0; i < mas.length; i++) {
            for(int j=mas.length - 1; j > i; j--) {
                if (mas[j-1] > mas[j]) {
                    int buf = mas[j];
                    mas[j] = mas[j-1];
                    mas[j-1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
