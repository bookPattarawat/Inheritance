public class InterfaceCicle {
    public static void main(String args[]) {
        InterfaceCicle cir = new MyCircle(5.3);

        cir.showArea();

        double area = cir.findArea();
        System.err.println("Area = " + area);
    }
}
