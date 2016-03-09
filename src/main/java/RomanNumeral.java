public class RomanNumeral {
    
    private String romanNumeral;
    private static int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static String[] letters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public RomanNumeral(int input) {
        romanNumeral = "";
        for (int i = 0; i < numbers.length; i++) {
            while (input >= numbers[i]) {
                romanNumeral += letters[i];
                input -= numbers[i];
            }
        }
    }

    public String getRomanNumeral() { return romanNumeral; }
}
