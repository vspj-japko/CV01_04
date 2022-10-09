import java.util.Scanner;

public class RealizaceHryKonzola {

    private final HraPosunPoSachovnici game;


    public RealizaceHryKonzola() {
        this(8,8);
    }

    public RealizaceHryKonzola(int nx, int ny) {
        this.game = new HraPosunPoSachovnici(nx, ny);
    }

    public void execute() {
        Character input;
        Direction direction;
        while (true) {
            input = readChar();

            if(input == null) {
                System.out.println("Musíš zadat jeden ze znaků: L, R, U, D, K");
                continue;
            }

            direction = getMove(input);

            if(direction != Direction.NULL) game.move(direction);

            else {
                System.out.println(game.getHistoryAsString());
                return;
            }
        }
    }

    private Direction getMove(Character input) {
        switch (input) {
            case 'L', 'l' -> {
                return Direction.LEFT;
            }
            case 'R', 'r' -> {
                return Direction.RIGHT;
            }
            case 'U', 'u' -> {
                return Direction.UP;
            }
            case 'D', 'd' -> {
                return Direction.DOWN;
            }
            default -> { return Direction.NULL; }
        }
    }

    public static Character readChar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Zadej direction: ");
        return scan.hasNext("^[lLrRuUdDkK]") ? scan.next().charAt(0) : null;
    }
}