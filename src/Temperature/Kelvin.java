package Temperature;

public class Kelvin implements Temperature {

    private final double temp;

    public Kelvin(double temp) {
        this.temp = temp;
    }

    @Override
    public Double toCelsius() {
        return temp - 273.15;
    }

    @Override
    public Double toFareheit() {
        return (temp - 273.15) * 1.8 + 32;
    }

    @Override
    public Double toKelvin() {
        return temp;
    }
}
