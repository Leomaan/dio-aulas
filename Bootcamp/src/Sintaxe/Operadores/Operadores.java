package Sintaxe.Operadores;

public class Operadores {

    public static void main(String[] args) {
        char letra = 'a';
        String nome = "Leoman";
        int a = 12;
        int b = 10,c = 0;
        c = a + b;

        //Concatenação

        String sobrenome = "Cassio";
        String nomeCompleto = (nome+" "+sobrenome);
        System.out.println(nomeCompleto);

        System.out.println(1+"1"+1+1+1); //Ao identificar uma string ele já realiza a concatenação de forma automática

         int numero = 10;
        System.out.println(- numero);
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        boolean r = false;
        System.out.println(!r);

        int idade = 15;
        System.out.println(idade >= 18 ? "maior de idade" : "menor de idade"); //Operador ternário

        if(!r){
            System.out.println("Oi");
        }else
            System.out.println("hoje n filho da pouta");


    }



}
