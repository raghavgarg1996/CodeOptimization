package Temperature;

public class Celsius implements Temperature {

    private final Double temp;

    public Celsius(Double temp) {
        this.temp = temp;
    }


    @Override
    public Double toCelsius() {
        return temp;
    }

    @Override
    public Double toFareheit() {
        return temp * 1.8 + 32;
    }

    @Override
    public Double toKelvin() {
        return temp + 273.15;
    }
}
