import java.util.Scanner;

public class RealizaceHryKonzola {


    private final HraPosunPoSachovnici hra;
    public RealizaceHryKonzola() {
        this.hra = new HraPosunPoSachovnici(8, 8);
    }
    Scanner scanner = new Scanner(System.in);

    public Direction getMove() {
        char input;
        while(true) {
            System.out.println("Zadej direction: ");
            input = scanChar();
            switch(input) {
                case 'L':
                case 'l':
                    return Direction.LEFT;
                case 'R':
                case 'r':
                    return Direction.RIGHT;
                case 'U':
                case 'u':
                    return Direction.UP;
                case 'D':
                case 'd':
                    return Direction.DOWN;
                case 'K':
                case 'k':
                    return Direction.NONE;
                default:
                    System.out.println("Musíš jeden ze znaků: L, R, U, D, K");
            }
        }
    }

    private char scanChar() {
        String input = scanner.next();
        return input.length() == 1 ? input.charAt(0) : 'N';
    }

    public void execute() {
        Direction move;
        while(true) {
            move = getMove();
            if(move == Direction.NONE) break;
            hra.move(move);
        }
        System.out.println(hra.getHistoryAsString());
        System.exit(0);
    }
}
