package Temperature;

public class Farenheit implements Temperature {

    private final Double temp;

    public Farenheit(Double temp) {
        this.temp = temp;
    }


    @Override
    public Double toCelsius() {
        return (temp - 32) * (5 / 9);
    }

    @Override
    public Double toFareheit() {
        return temp;
    }

    @Override
    public Double toKelvin() {
        return (temp - 32) * (5 / 9) + 273.15;
    }
}
