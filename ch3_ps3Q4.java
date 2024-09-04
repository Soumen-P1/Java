//Write a java program to detect double and triple spaces in a string

public class ch3_ps3Q4 {
    public static void main(String[] args) {
        String str = "It is  a   java program";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));

    }
}
