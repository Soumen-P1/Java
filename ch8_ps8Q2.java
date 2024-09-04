class CellPhone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void vibrate(){
        System.out.println("Vibrating");
    }
}

public class ch8_ps8Q2 {
    public static void main(String[] args) {
        CellPhone vivo = new CellPhone();

        vivo.ring();
        vivo.vibrate();

    }
}
