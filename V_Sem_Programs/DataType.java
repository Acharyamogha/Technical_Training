import java.util.Scanner;

public class DataType{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int i = scanner.nextInt();

        System.out.print("Enter a double: ");
        double d = scanner.nextDouble();

        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);

	System.out.print("Enter a byte: ");
        byte b = scanner.nextByte();

        System.out.print("Enter a short: ");
        short s = scanner.nextShort();

        System.out.print("Enter a long: ");
        long l = scanner.nextLong();

        System.out.print("Enter a float: ");
        float f=scanner.nextFloat();

        System.out.println(" ");

        System.out.println("Integer value: " + i + ", Size: " + Integer.SIZE/8 + " bytes\n");

        System.out.println("Double value: " + d + ", Size: " + Double.SIZE/8 + " bytes\n");

        System.out.println("Character value: " + c + ", Size: " + Character.SIZE/8 + " bytes\n");

        System.out.println("Byte value: " + b + ", Size: " + Byte.SIZE/8 + " byte\n");

        System.out.println("Short value: " + s + ", Size: " + Short.SIZE/8 + " bytes\n");

        System.out.println("Long value: " + l + ", Size: " + Long.SIZE/8 + " bytes\n");

        System.out.println("Float value: " + f + ", Size: " + Float.SIZE/8 + " bytes\n");
    }
}
