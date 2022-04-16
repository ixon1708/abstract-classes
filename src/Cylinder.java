import java.util.Objects;

public class Cylinder extends Figure3D {

    private final int height;
    private final int r;

    public Cylinder(int height, int r) {
        this.height = height;
        this.r = r;
    }

    @Override
    double calculateVolume() {
        return height * (Math.PI * r * r);
    }

    @Override
    double calculatePerimeter() {
        return Double.POSITIVE_INFINITY; // можно и 0 оставить, ведь у тел вращения нет периметра
    }

    @Override
    double calculateArea() {
        return 2 * (Math.PI * r * r) + height * (2 * Math.PI * r);
    }

    @Override
    public void printInfo() {
        System.out.println("Cylinder: heght = " + height + ", r = " + r);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cylinder)) return false;
        Cylinder cylinder = (Cylinder) o;
        return height == cylinder.height &&
                r == cylinder.r;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, r);
    }
}
