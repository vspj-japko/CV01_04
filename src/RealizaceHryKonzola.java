import java.util.Scanner;

public class RealizaceHryKonzola {
    public DIRECTION nacti_direction() {
        System.out.println("Zadej direction: ");
        Scanner scanner = new Scanner(System.in);
        switch(scanner.next().charAt(0)) {
            case 'L':
            case 'l':
                return DIRECTION.LEFT;
            case 'R':
            case 'r':
                return DIRECTION.RIGHT;
            case 'U':
            case 'u':
                return DIRECTION.UP;
            case 'D':
            case 'd':
                return DIRECTION.DOWN;
            case 'K':
            case 'k':
                System.exit(0);
        };
        return null;
    }

    public void execute() {

    }
}
