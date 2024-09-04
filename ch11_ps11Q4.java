abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disConnect();
}

class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("Ringing");
    }
    void lift(){
        System.out.println("Call received");
    }
    void disConnect(){
        System.out.println("Disconnected");
    }
}

public class ch11_ps11Q4 {
    public static void main(String[] args) {
        SmartTelephone sp = new SmartTelephone();
        sp.lift();
    }
}
