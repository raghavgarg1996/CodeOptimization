package Volume;

public class main {

    public static void main(String[] args) {
        tsp(20);
        tbsp(20);
        cup(20);
        pint(20);
    }

    public static void cup(double vol) {
        Cup cu = new Cup(vol);
        double toCup = cu.toCup();
        double toPint = cu.topint();
        double toTbsp = cu.toTbsp();
        double toTsp = cu.toTsp();
        System.out.println("Cup to Cup: " +toCup);
        System.out.println("Cup to Pint: " +toPint);
        System.out.println("Cup to Tbsp: " +toTbsp);
        System.out.println("Cup to Tsp: " +toTsp);

    }

    public static void pint(double vol) {
        Pint pin = new Pint(vol);
        double toCup = pin.toCup();
        double toPint = pin.topint();
        double toTbsp = pin.toTbsp();
        double toTsp = pin.toTsp();
        System.out.println("Pint to Cup: " +toCup);
        System.out.println("Pint to Pint: " +toPint);
        System.out.println("Pint to Tbsp: " +toTbsp);
        System.out.println("Pint to Tsp: " +toTsp);

    }

    public static void tbsp(double vol) {
        Tbsp table = new Tbsp(vol);
        double toCup = table.toCup();
        double toPint = table.topint();
        double toTbsp = table.toTbsp();
        double toTsp = table.toTsp();
        System.out.println("Tbsp to Cup: " +toCup);
        System.out.println("Tbsp to Pint: " +toPint);
        System.out.println("Tbsp to Tbsp: " +toTbsp);
        System.out.println("Tbsp to Tsp: " +toTsp);
    }

    public static void tsp(double vol) {
        Tsp tea = new Tsp(vol);
        double toCup = tea.toCup();
        double toPint = tea.topint();
        double toTbsp = tea.toTbsp();
        double toTsp = tea.toTsp();
        System.out.println("Tsp to Cup: " +toCup);
        System.out.println("Tsp to Pint: " +toPint);
        System.out.println("Tsp to Tbsp: " +toTbsp);
        System.out.println("Tsp to Tsp: " +toTsp);
    }
}
