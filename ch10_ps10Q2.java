//create a class rectangle then inherits a class cuboid

class Rectangle1{
    public void Side(){
        System.out.println("The length of the side is 5");
    }
    public void Area(){
        System.out.println("The area is 5+5");
    }
    public void Volume(){
        System.out.println("The volume is 5*5");
    }
}

class Cuboid extends Rectangle1{
    @Override
    public void Side(){
        System.out.println("The length of the side is 10");
    }
    @Override
    public void Area(){
        System.out.println("The area is --");
    }
    @Override
    public void Volume(){
        System.out.println("The volume is 5*5*5");
    }
}


public class ch10_ps10Q2 {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1();
        Cuboid c = new Cuboid();

        r1.Side();
        r1.Area();
        r1.Volume();

        System.out.println();

        c.Area();
        c.Side();
        c.Volume();
    }
}
