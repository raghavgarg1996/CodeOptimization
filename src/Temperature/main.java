package Temperature;

public class main {

    public static void main(String[] args) {

        celsius(25);
        farenheit(25);
        kelvin(25);
    }

    public static void celsius(double temp) {
        Celsius celsi = new Celsius(temp);
        double inFarenheit = celsi.toFareheit();
        double inCelsius = celsi.toCelsius();
        double inKelvin = celsi.toKelvin();
        System.out.println("Celsius to Farenheit: "+inFarenheit);
        System.out.println("Celsius to Celsius: "+inCelsius);
        System.out.println("Celsius to Kelvin: "+inKelvin);
    }

    public static void farenheit(double temp) {
        Farenheit faren = new Farenheit(temp);
        double inFarenheit = faren.toFareheit();
        double inCelsius = faren.toCelsius();
        double inKelvin = faren.toKelvin();
        System.out.println("Farenheit to Farenheit: "+inFarenheit);
        System.out.println("Farenheit to Celsius: "+inCelsius);
        System.out.println("Farenheit to Kelvin: "+inKelvin);
    }

    public static void kelvin(double temp) {
        Kelvin kelv = new Kelvin(temp);
        double inFarenheit = kelv.toFareheit();
        double inCelsius = kelv.toCelsius();
        double inKelvin = kelv.toKelvin();
        System.out.println("Kelvin to Farenheit: "+inFarenheit);
        System.out.println("Kelvin to Celsius: "+inCelsius);
        System.out.println("Kelvin to Kelvin: "+inKelvin);
    }
}
