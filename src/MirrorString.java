public class MirrorString {
    public static void main(String[] args) {
        System.out.println(mirrorEnds("abcdXXX"));
    }

//    private static String mirrorEnds(String string) {
//        StringBuilder builder = new StringBuilder();
//        char[] array = string.toCharArray();
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == array[array.length - 1 - i]) {
//                builder.append(array[i]);
//            }
//            else {
//                return builder.toString();
//            }
//        }
//        return builder.toString();
//    }
//}

//    private static String mirrorEnds(String string) {
//
//        int len = string.length();
//        String fin = "";
//        String tmp1 = "";
//        String tmp2 = "";
//
//        for (int i = 0; i < len; i++) {
//            tmp1 += string.substring(i, i + 1);
//            tmp2 = "";
//            for (int j = tmp1.length() - 1; j >= 0; j--) {
//                tmp2 += tmp1.substring(j, j + 1);
//                if (tmp2.equals(string.substring(len - i - 1, len)))
//                    fin = tmp1;
//            }
//        }
//        return fin;
//    }
//}


    private static String mirrorEnds(String string) {
        StringBuilder result = new StringBuilder();
        int len = string.length();

        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == string.charAt(len - 1 - i))
                result.append(string.charAt(i));
            else
                return result.toString();
        }
        return result.toString();
    }
}