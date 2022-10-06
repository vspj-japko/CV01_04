import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;

public class HraPosunPoSachovnici {

    private final int nx;
    private final int ny;

    private final ArrayList<Point> history = new ArrayList<>();

    private int x;
    private int y;

    public HraPosunPoSachovnici(int nx, int ny) {
        this.nx = nx;
        this.ny = ny;
        this.x = 0;
        this.y = 0;
        this.history.add(new Point(this.x, this.y));
    }

    public boolean can_left() {
        return this.x > 0;
    }

    public boolean can_right() {
        return this.x < nx;
    }

    public boolean can_up() {
        return this.y < ny;
    }

    public boolean can_down() {
        return this.y > 0;
    }

    public boolean can_move(DIRECTION direction) {
        return switch (direction) {
            case DOWN -> can_down();
            case UP -> can_up();
            case LEFT -> can_left();
            case RIGHT -> can_right();
        };
    }

    public void move(DIRECTION direction) {
        if(can_move(direction)) {
            switch(direction) {
                case DOWN -> this.x -= 1;
                case UP -> this.x += 1;
                case LEFT -> this.y -= 1;
                case RIGHT -> this.y += 1;
            }
            history.add(new Point(this.x, this.y));
        }
    }

    public HraPosunPoSachovnici clone() {
        return this;
    }
}
