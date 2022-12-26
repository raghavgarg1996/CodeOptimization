package Length;

public class main {

    public static void main(String[] args) {

        foot(25);
        inch(25);
        yard(25);
        mile(25);

    }

    public static void foot(double size) {
        Ft fooot = new Ft(size);
        double inInch = fooot.toInch();
        double inFoot = fooot.toFt();
        double inYard = fooot.toYard();
        double inMile = fooot.toMile();
        System.out.println("Foot to inch " + inInch);
        System.out.println("Foot to Foot " + inFoot);
        System.out.println("Foot to Yard " + inYard);
        System.out.println("Foot to Mile " + inMile);
    }

    public static void inch(double size) {
        Inch inc = new Inch(size);
        double inInch = inc.toInch();
        double inFoot = inc.toFt();
        double inYard = inc.toYard();
        double inMile = inc.toMile();
        System.out.println("Inch to inch " + inInch);
        System.out.println("Inch to Foot " + inFoot);
        System.out.println("Inch to Yard " + inYard);
        System.out.println("Inch to Mile " + inMile);
    }

    public static void yard(double size) {
        Yard yar = new Yard(size);
        double inInch = yar.toInch();
        double inFoot = yar.toFt();
        double inYard = yar.toYard();
        double inMile = yar.toMile();
        System.out.println("Yard to inch " + inInch);
        System.out.println("Yard to Foot " + inFoot);
        System.out.println("Yard to Yard " + inYard);
        System.out.println("Yard to Mile " + inMile);
    }

    public static void mile(double size) {
        Mile mil = new Mile(size);
        double inInch = mil.toInch();
        double inFoot = mil.toFt();
        double inYard = mil.toYard();
        double inMile = mil.toMile();
        System.out.println("Mile to inch " + inInch);
        System.out.println("Mile to Foot " + inFoot);
        System.out.println("Mile to Yard " + inYard);
        System.out.println("Mile to Mile " + inMile);
    }
}
