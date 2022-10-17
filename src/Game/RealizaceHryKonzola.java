package Game;

import Utils.Direction;
import Utils.InputReader;

public class RealizaceHryKonzola {

    private final HraPosunPoSachovnici game;


    public RealizaceHryKonzola() {
        this((byte)8,(byte)8);
    }

    public RealizaceHryKonzola(byte nx, byte ny) {
        this.game = new HraPosunPoSachovnici(nx, ny);
    }

    public void execute() {
        Character input;
        while (true) {
            System.out.print("Zadej vstup (L, R, U, D, K): ");
            input = InputReader.readChar();

            if (input != null && getMove(input) != Direction.NULL) game.move(getMove(input));
            else if (input != null && (input == 'k' || input == 'K')) break;
            else System.out.println("Musis zadat jeden ze znaku: L, R, U, D, K");
        }
        System.out.println(game.getHistoryAsString());
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
}