package Volume;

public class Cup implements Volume{

    private final double vol;

    public Cup(double vol) {
        this.vol = vol;
    }

    @Override
    public double toTbsp() {
        return vol * 16;
    }

    @Override
    public double toTsp() {
        return vol * 48;
    }

    @Override
    public double toCup() {
        return vol;
    }

    @Override
    public double topint() {
        return vol * 0.5;
    }
}
