public abstract class Figure3D extends Figure {

    abstract double calculateVolume();

    public void printVolume() {
        System.out.println("Объём = " + calculateVolume());
    }

}
