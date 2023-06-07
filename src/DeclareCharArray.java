public class DeclareCharArray {
    public static void main(String[] args) {
        String s1 = "First String";
        char[] charArray = s1.toCharArray();
        for (char c : charArray) {
            System.out.print(" " + c);
        }
        System.out.println("\n");

        char[] charArray2 = new char[s1.length()];
        for(int i = 0; i < s1.length(); i++) {
            charArray2[i] = s1.charAt(i);
            System.out.print(charArray2[i]);
        }
    }
}
