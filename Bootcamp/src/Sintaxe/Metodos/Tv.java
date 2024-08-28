package Sintaxe.Metodos;
/**
 * @author Leoman Cássio
 * @version 1.0
 * @since 08/24
 * */
public class Tv {
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 1;

    public Tv(boolean ligada, int canal, int volume) {
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;

    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: "+volume);
        ;
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: "+volume);
        ;
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando canal para: "+canal);
    }

    /**
     * Método utilizado para alterar o canal para algum em específico
     * @param novoCanal
     * */

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal alterado para: "+canal);
    }
    public void diminuitCanal(){
        canal--;
        System.out.println("Diminuindo canal para: "+canal);
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}




