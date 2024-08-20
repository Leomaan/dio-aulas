package TiposVariaveis;

public class TiposVariáveis {
    public static void main(String[] args) {
        byte idade;  //-128 a 127
        short ano; // -32k a 32k
        int muitos; //-2Bi a 2Bi
        long slk; // muitos a muitos
        final int RODAS =  4; //Constante

        String nome = "Leoman";
        String nomeCompleto = nome.concat(" ").concat("Cássio"); //Concatenação
        System.out.println(nomeCompleto);

        muitos =  1000;
        ano = (short) muitos;
        System.out.println(ano);
        slk = 12;
        muitos = (int) slk;
        System.out.println(muitos);

    }


}
