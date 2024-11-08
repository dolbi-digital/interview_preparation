package usa_prep;

public class SuperReducedString {
    public static void main(String[] args) {
        String input1 = "aaabccddd";
        String input2 = "aaaabb";
        String input3 = "baabcccxxxqq";

        System.out.println(superReducedString(input1));  // Output: "abd"  remove 2 same characters consequently
        System.out.println(superReducedString(input2));  // Output: "Empty String"
        System.out.println(ReducedString(input3));  // Output: "Empty String"
    }

    public static String superReducedString(String s) {
        char[] chars = s.toCharArray();
        int newLength = 0; // Pointer to track the length of the reduced string

        for (int i = 0; i < chars.length; i++) {
            if (newLength > 0 && chars[newLength - 1] == chars[i]) {
                // If the last character in the reduced string matches the current character, remove it
                newLength--;
            } else {
                // Otherwise, add the current character to the reduced string
                chars[newLength] = chars[i];
                newLength++;
            }
        }

        if (newLength == 0) {
            return "Empty String";
        } else {
            return new String(chars, 0, newLength);
        }
    }

    public static String ReducedString(String s) {
        // Write your code here
        StringBuilder reducedString = new StringBuilder();

        for (char c : s.toCharArray()) {
            int length = reducedString.length();
            if (length > 0 && reducedString.charAt(length - 1) == c) {
                reducedString.deleteCharAt(length - 1);  // Remove the last character
            } else {
                reducedString.append(c);  // Add the current character
            }
        }

        if (reducedString.length() == 0) {
            return "Empty String";
        } else {
            return reducedString.toString();
        }
    }

}