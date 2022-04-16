import java.util.Objects;

public class Rectangle extends Figure {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculatePerimeter() {
        return (width + height) * 2;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Rectangle: Ширина = " + width + ", высота = " + height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width &&
                height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}
