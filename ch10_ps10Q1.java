//create a class circle and use inheritance to create another class cylinder from it
class Circle{
    public void Radius(){
        System.out.println("Radius is 5");
    }

}

class Cylinder1 extends Circle{
    @Override
    public void Radius(){
        System.out.println("Radius is 2");
    }
    public void Height(){
        System.out.println("Height is 10");
    }
}

public class ch10_ps10Q1 {
    public static void main(String[] args) {
        Circle clc = new Circle();
        Cylinder1 cyl = new Cylinder1();

        clc.Radius();
        cyl.Radius();
        cyl.Height();
    }
}
