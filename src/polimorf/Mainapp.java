package polimorf;

public class Mainapp {
    public static void main(String[] args) {
        Automain ironmoney = new Ironmoney();
        Automain papermoney = new Papermoney();

        workWith(ironmoney);
        workWith(papermoney);
    }

    public static void workWith(Automain a) {
        a.check();
    }
}
