package Length;

public class Mile implements Length {
    private final double size;

    public Mile(double size) {
        this.size = size;
    }

    @Override
    public double toInch() {
        return size * 63360;
    }

    @Override
    public double toFt() {
        return size * 5280;
    }

    @Override
    public double toYard() {
        return size * 1760;
    }

    @Override
    public double toMile() {
        return size;
    }
}
