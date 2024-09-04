//use (1) to calculate surface area and volume of the cylinder

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public Rectangle() {
        this.length = 5;
        this.breadth = 8;
    }
    public Rectangle(int length) {
        this.length = length;
        this.breadth = 8;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class ch9_ps9Q2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}

