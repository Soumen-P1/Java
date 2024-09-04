//1.    create an abstract class pen with abstract methods write(),refill()
//2.    use it and create a concrete class fountain pen with additional method changenib()
abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    public void write(){
        System.out.println("writing with a fountain pen");
    }
    public void refill(){
        System.out.println("Refill the fountain pen");
    }
    public void changeNib(){
        System.out.println("Change the nib");
    }
}

public class ch11_ps11Q1 {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();
    }
}
