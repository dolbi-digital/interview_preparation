package usa_prep;

public class CountCharSums {
    public static void main(String[] args) {
        System.out.println(crypt("qqqwwweeqqqqqqqqqqqhh"));
        System.out.println(crypt2("qqqwwweeqqqqqqqqqqqhhXXXXX"));
    }

    private static String crypt(String str) {
        StringBuilder builder = new StringBuilder();
        char[] array = str.toCharArray();
        char prevChar = array[0];
        int count = 1;
        for(int i=1; i<array.length; i++) {
            if(prevChar == array[i]) {
                count++;
            }
            else {
                builder.append(count).append(prevChar);
                prevChar = array[i];
                count = 1;
            }
        }
        builder.append(count).append(prevChar);
        return builder.toString();
    }

    public static String crypt2(String str) {
        StringBuilder builder = new StringBuilder();
        int count = 1;
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i-1) == str.charAt(i)) {
                count++;
            }
            else {
                builder.append(count).append(str.charAt(i-1));
                count = 1;
            }
        }
        builder.append(count).append(str.charAt(str.length()-1));
        return builder.toString();
    }
}
