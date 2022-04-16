import java.util.Objects;

public class Parallelepiped extends Figure3D {

    private final int height;
    private final int width;
    private final int length;

    public Parallelepiped(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    double calculateVolume() {
        return height * width * length;
    }

    @Override
    double calculatePerimeter() {
        return 4 * (height + width + length); //сумма всех ребер
    }

    @Override
    double calculateArea() {
        return 2 * (height * width + height * length + width * length);
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public void printInfo() {
        System.out.println(toString()); //просто для примера, что можно и так :)
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parallelepiped)) return false;
        Parallelepiped that = (Parallelepiped) o;
        return height == that.height &&
                width == that.width &&
                length == that.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, length);
    }
}
