package Volume;

public class Tbsp implements Volume {
    private final double vol;

    public Tbsp(double vol) {
        this.vol = vol;
    }

    @Override
    public double toTbsp() {
        return vol;
    }

    @Override
    public double toTsp() {
        return vol * 3;
    }

    @Override
    public double toCup() {
        return vol / 16;
    }

    @Override
    public double topint() {
        return vol / 32;
    }
}
