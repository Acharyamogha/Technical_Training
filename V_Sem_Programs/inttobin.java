import java.util.Scanner;

public class inttobin {
    public static void main(String[] args) {
        int num; 
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter an integer");
        num=sin.nextInt();
        String bin = convertToBinary(num);
        System.out.println("Binary value: " + bin);
    }

    private static String convertToBinary(int num) {
        if (num == 0) {
            return "0";
        }

        String bin = "";

        while (num > 0) {
            int rem = num % 2;
            bin = rem + bin; 
            num /= 2;
        }

        return bin;
    }
}
