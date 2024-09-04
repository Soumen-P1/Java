//create a class monkey with jump,bite methods. create a class humans which inherits this monkey class and implements BasicAnimal interface with eat and sleep methods

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    public void jump(){
        System.out.println("Jump");
    }
    public void bite(){
        System.out.println("Bite");
    }
}

class Humans extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("eating");
    }
    @Override
    public void sleep(){
        System.out.println("sleeping");
    }
}

public class ch11_ps11Q3 {
    public static void main(String[] args) {
        Humans hu = new Humans();
        hu.eat();
        hu.sleep();
    }
}
