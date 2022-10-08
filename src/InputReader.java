import java.util.Scanner;

public class InputReader {

    private final static Scanner scan = new Scanner(System.in);

    public static Short readShort() {
        System.out.println("Zadej Short: ");
        try {
            return Short.parseShort(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Musíš zadat Short");
            return null;
        }
    }

    public static Integer readInt() {
        System.out.println("Zadej Integer: ");
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Musíš zadat Integer");
            return null;
        }
    }

    public static Float readFloat() {
        System.out.println("Zadej Float: ");
        try {
            return Float.parseFloat(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Musíš zadat Float");
            return null;
        }
    }

    public static Double readDouble() {
        System.out.println("Zadej Double: ");
        try {
            return Double.parseDouble(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Musíš zadat Double");
            return null;
        }
    }

    public static String readString() {
        System.out.println("Zadej String: ");
        return scan.nextLine();
    }

    public static Character readChar() {
        System.out.println("Zadej Char: ");
        String temp = scan.nextLine();
        return temp.length() == 1 ? temp.charAt(0) : null;
    }
}