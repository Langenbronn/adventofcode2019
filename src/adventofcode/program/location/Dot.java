package adventofcode.program.location;

public class Dot {
    private int x;
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distance() {
        int dDot = 0;
        if (x > 0) {
            dDot = x;
        } else {
            dDot = -x;
        }
        if (y > 0) {
            dDot = dDot + y;
        } else {
            dDot = dDot - y;
        }
        return dDot;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return  "(x:" + x +", y:" + y +')';
    }
}
