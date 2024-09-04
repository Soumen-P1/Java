//create a class cylinder and use getters and setters to set its radius and height
//use (1) to calculate surface area and volume of the cylinder
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
    public void setRadius(int i){
        radius = i;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int j){
        height = j;
    }
    public int getHeight(){
        return height;
    }
    public double surfceArea(){
        return 2*3.14* radius* height + 2* 3.14* radius* radius;
    }
    public double volume(){
        return 2*3.14* radius* radius* height;
    }
}

public class ch9_ps9Q1 {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(12,9);
//        myCylinder.setHeight(12);
//        myCylinder.setRadius(5);
        int h = myCylinder.getHeight();
        int r = myCylinder.getRadius();
        System.out.println(h);
        System.out.println(r);
        System.out.println(myCylinder.surfceArea());
        System.out.println(myCylinder.volume());
    }
}
