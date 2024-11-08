import java.util.Arrays;

public class SortArrayBubble {
    public static void main(String[] args) {
        int [] mas = {11, 111, 3, 14, 16, 7, 88, 0, -999};
        boolean flag = false;
        while (!flag) {
            flag = true;
            for(int i=0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i+1]) {
                    flag = false;
                    int buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
