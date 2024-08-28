package Sintaxe.Reservadas;

public class SubClasse extends PalavrasReservadas{
    public void testar(){
        a++; //public e protected são reconhecidas em subclasses, já a private, não!
        c++;
    }
}
