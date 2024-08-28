package Sintaxe.Metodos;

public class App {
    public static void main(String[] args) {
        Tv tv = new Tv(true,18,25);
        System.out.println(tv.isLigada());
        System.out.println(tv.getVolume());
        System.out.println(tv.getCanal());
        tv.ligar();
        System.out.println(tv.isLigada());
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.aumentarCanal();
        tv.diminuitCanal();
        tv.mudarCanal(20);


    }
}
