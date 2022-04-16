public abstract class Figure {

    abstract double calculatePerimeter();

    abstract double calculateArea();

    public abstract void printInfo();

    public void printPerimeter() {
        System.out.println("Периметр = " + calculatePerimeter());
    }

    public void printArea() {
        System.out.println("Площадь = " + calculateArea());
    }

}
