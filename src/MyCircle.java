public class MyCircle implements IntCircle {
    private double r;

    public MyCircle(){
        this.r = 1.0;
    }

    public MyCircle(double r){
        this.r = r;
    }

    @Override
    public double findArea(){
        return IntCircle.PI * this.r * this.r;
    }

    @Override
    public void showArea(){
        System.err.println("Radius: " + this.r);
        System.err.println("Circle area:" + this.findArea());
    }
}
