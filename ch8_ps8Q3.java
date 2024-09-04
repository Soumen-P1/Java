class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class ch8_ps8Q3 {
    public static void main(String[] args) {
        Square sqr1 = new Square();

        sqr1.side = 3;
        System.out.println(sqr1.area());
        System.out.println(sqr1.perimeter());
    }
}
