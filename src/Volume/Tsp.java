package Volume;

public class Tsp implements Volume {

    private final double vol;

    public Tsp(double vol) {
        this.vol = vol;
    }

    @Override
    public double toTbsp() {
        return vol / 3;
    }

    @Override
    public double toTsp() {
        return vol;
    }

    @Override
    public double toCup() {
        return vol / 48;
    }

    @Override
    public double topint() {
        return vol / 96;
    }
}
