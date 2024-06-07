public class Point {
    private float x;
    private float y;

    // Constructors
    public Point() {
        this(0.0f, 0.0f);
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    // Setters
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Method to move the point
    public void move(float xOffset, float yOffset) {
        x += xOffset;
        y += yOffset;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}