package Length;

public class Ft implements Length {

    private final double size;

    public Ft(double size) {
        this.size = size;
    }


    @Override
    public double toInch() {
        return size * 12;
    }

    @Override
    public double toFt() {
        return size;
    }

    @Override
    public double toYard() {
        return size / 3;
    }

    @Override
    public double toMile() {
        return size / 5280;
    }
}
