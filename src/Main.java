public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(8);
        Rectangle rectangle1 = new Rectangle(5,6);
        Rectangle rectangle2 = new Rectangle(4,6);
        Figure[] figures = {circle1, circle2, rectangle1, rectangle2};
        for (Figure figure : figures) {
            figure.printInfo();
            figure.printArea();
            figure.printPerimeter();
            System.out.println();
        }

        Cylinder cylinder1 = new Cylinder(9, 5);
        Cylinder cylinder2 = new Cylinder(5, 9);
        Parallelepiped parallelepiped1 = new Parallelepiped(2,3,4);
        Parallelepiped parallelepiped2 = new Parallelepiped(3,4,2);
        Figure3D[] figure3Ds = {cylinder1, cylinder2, parallelepiped1, parallelepiped2};
        for (Figure3D figure3D : figure3Ds) {
            figure3D.printInfo();
            figure3D.printArea();
            figure3D.printPerimeter();
            figure3D.printVolume();
            System.out.println();
        }

        System.out.println(circle1.equals(circle2));
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(cylinder1.equals(cylinder2));
        System.out.println(parallelepiped1.equals(parallelepiped2));
    }
}
