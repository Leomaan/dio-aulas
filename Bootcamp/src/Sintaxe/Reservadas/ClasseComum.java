package Sintaxe.Reservadas;


public class ClasseComum {
    public void testar(){
        PalavrasReservadas p = new PalavrasReservadas();
        p.a++;//As variaveis publicas e protected foram reconhecida em outras clases no mesmo pacote
        p.publica++;
        p.c++;
    }
}
