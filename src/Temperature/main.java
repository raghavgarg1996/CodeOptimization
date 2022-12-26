package Temperature;

public class main {

    public static void main(String[] args) {

        celsius(25.00);
        farenheit(25.00);
        kelvin(25.00);
    }

    public static void celsius(double temp) {
        Celsius c = new Celsius(temp);
        double inFarenheit = c.toFareheit();
        double inCelsius = c.toCelsius();
        double inKelvin = c.toKelvin();
        System.out.println("Celsius to Farenheit: "+inFarenheit);
        System.out.println("Celsius to Celsius: "+inCelsius);
        System.out.println("Celsius to Kelvin: "+inKelvin);
    }

    public static void farenheit(double temp) {
        Farenheit f = new Farenheit(temp);
        double inFarenheit = f.toFareheit();
        double inCelsius = f.toCelsius();
        double inKelvin = f.toKelvin();
        System.out.println("Farenheit to Farenheit: "+inFarenheit);
        System.out.println("Farenheit to Celsius: "+inCelsius);
        System.out.println("Farenheit to Kelvin: "+inKelvin);
    }

    public static void kelvin(double temp) {
        Kelvin k = new Kelvin(temp);
        double inFarenheit = k.toFareheit();
        double inCelsius = k.toCelsius();
        double inKelvin = k.toKelvin();
        System.out.println("Kelvin to Farenheit: "+inFarenheit);
        System.out.println("Kelvin to Celsius: "+inCelsius);
        System.out.println("Kelvin to Kelvin: "+inKelvin);
    }
}
