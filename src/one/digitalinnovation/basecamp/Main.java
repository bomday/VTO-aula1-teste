package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {

        int i;
        // int i; -> Variável igual a outra acima
        int I;
        // int 1a; -> Não se começa com números
        int _1a;
        int $aq;
        // Evitar as duas acima, pois é feio

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;
        // Devemos atribuir valor às variáveis, como mostrado acima

        final int j = 10;
        // j = 15 -> Não é válido, pois com "final" a variável têm seu valor fixo
        int asrn23456md;
        // int asrn234 56md; -> Não é válido, pois contém um espaço
        int asrn23456_md;
        // int asrn234%56_md; -> Caracteres especiais não permitidos

        asrn23456md = 3;
        asrn23456_md = 8;
        // Devemos atribuir valor às variáveis, como mostrado acima

        int quantidadeProduto = 50;
        // int QuantidadeProduto; -> Não é boa prática
        final int NUMERO_TENTATIVAS = 5;
        // final int numeroTentativas = 5; -> Não é boa prática do final
        // int QUANTIDADE_OPCOES = 25; -> Não é boa prática e usa definição de final
        // int qtdProd; -> Não é boa prática, pois não é de tão fácil leitura

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn23456md);
        System.out.println(asrn23456_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
    }
}
