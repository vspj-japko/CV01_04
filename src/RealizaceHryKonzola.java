import java.util.Scanner;

public class RealizaceHryKonzola {


    private final HraPosunPoSachovnici hra;
    public RealizaceHryKonzola(int nx, int ny) {
        this.hra = new HraPosunPoSachovnici(nx, ny);
    }
    Scanner scanner = new Scanner(System.in);

    public Direction getMove() {
        Character input;
        while(true) {
            System.out.println("Zadej direction: ");
            input = scanChar();

            if(input == null) System.out.println("Musíš jeden ze znaků: L, R, U, D, K");
            else {
                switch(input) {
                    case 'L', 'l' -> { return Direction.LEFT; }
                    case 'R', 'r' -> { return Direction.RIGHT; }
                    case 'U', 'u' -> { return Direction.UP; }
                    case 'D', 'd' -> { return Direction.DOWN; }
                    case 'K', 'k' -> {
                        System.out.println(hra.getHistoryAsString());
                        System.exit(0);
                    }
                    default -> System.out.println("Musíš zadat jeden ze znaků: L, R, U, D, K");
                }
                }
            }
        }

    private Character scanChar() {
        String input = scanner.next();
        return input.length() == 1 ? input.charAt(0) : null;
    }

    @SuppressWarnings("InfiniteLoopStatement")
    public void execute() {
        while(true) {
            hra.move(getMove());
        }
    }
}
