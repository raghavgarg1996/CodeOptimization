package Length;

public class Yard implements Length {

    private final double size;

    public Yard(double size) {
        this.size = size;
    }

    @Override
    public double toInch() {
        return size * 36;
    }

    @Override
    public double toFt() {
        return size * 3;
    }

    @Override
    public double toYard() {
        return size;
    }

    @Override
    public double toMile() {
        return size / 1760;
    }
}
