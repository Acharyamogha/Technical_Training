public class RomanToInteger {
    public int romanToInt(String s) {
        int sum = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = value(s.charAt(i));
            if (current < prev) {
                sum -= current;
            } else {
                sum += current;
            }
            prev = current;
        }
        return sum;
    }

    private int value(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        RomanToInteger converter = new RomanToInteger();
        System.out.println(converter.romanToInt("III")); 
        System.out.println(converter.romanToInt("LVIII")); 
        System.out.println(converter.romanToInt("MCMXCIV")); 
    }
}
