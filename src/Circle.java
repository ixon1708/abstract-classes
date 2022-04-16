import java.util.Objects;

public class Circle extends Figure {

    private final int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    public void printInfo() {
        System.out.println("Circle: Радиус = " + r);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return r == circle.r;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }
}
