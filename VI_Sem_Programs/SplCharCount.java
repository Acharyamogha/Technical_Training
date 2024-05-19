import java.util.Scanner;

public class SplCharCount {
    public static int countSpecialCharacters(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                count++;
            }
        }
        return count;
    }
    public static String splchar(String[] strings) {
        String maxsplchar = "";
        int maxSpecialCount = 0;
        
        for (String str : strings) {
            int specialCount = countSpecialCharacters(str);
            if (specialCount > maxSpecialCount) {
                maxSpecialCount = specialCount;
                maxsplchar = str;
            }
        }
        return maxSpecialCharString;
    }
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        sin.nextLine(); 
        String[] strings = new String[n];
        System.out.println("Enter the strings:");

        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        String result = splchar(strings);
        System.out.println("The string with the maximum number of special characters is: \"" + result + "\"");
    }
}
