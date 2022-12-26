package Length;

public class Inch implements Length {

    private final double size;

    public Inch(double size) {
        this.size = size;
    }

    @Override
    public double toInch() {
        return size;
    }

    @Override
    public double toFt() {
        return size / 12;
    }

    @Override
    public double toYard() {
        return size / 36;
    }

    @Override
    public double toMile() {
        return size / 63360;
    }
}
