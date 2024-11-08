package usa_prep;

public class isDigit {

    public static void main(String[] args) {
        String string = "1234test55test";
        char[] chars = string.toCharArray();
        int countDigits = 0;
        int countChars = 0;
        for(char c: chars) {
            if(Character.isDigit(c)) {
                countDigits += 1;
            }
            else if(Character.isLetter(c)) {
                countChars += 1;
            }
        }
        System.out.println(countDigits);
        System.out.println(countChars);

        int countDigits2 = (int) string.chars().filter(Character::isDigit).count();
        System.out.println(countDigits2);


        final int[] counts = {0, 0};

        string.chars().forEach(c -> {
            if (Character.isDigit(c)) counts[0]++;
            else if (Character.isLetter(c)) counts[1]++;
        });

        System.out.println("Digits: " + counts[0] + ", Letters: " + counts[1]);
    }
}
