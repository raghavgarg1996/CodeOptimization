package Volume;

public class Pint implements Volume{
    private final double vol;

    public Pint(double vol) {
        this.vol = vol;
    }

    @Override
    public double toTbsp() {
        return vol * 32;
    }

    @Override
    public double toTsp() {
        return vol * 96;
    }

    @Override
    public double toCup() {
        return vol * 2;
    }

    @Override
    public double topint() {
        return vol;
    }
}
