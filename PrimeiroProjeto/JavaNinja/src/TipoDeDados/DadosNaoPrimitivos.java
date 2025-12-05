package TipoDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados não primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja e atribuir métodos a ele
        * */

        String nome = "Naruto";
        String nomeCaixaAlta = nome.toUpperCase();
        System.out.println("O nome é " + nomeCaixaAlta);

        String aldeia = "Aldeia da folha";
        String aldeiaCaixaBaixa = aldeia.toLowerCase();
        System.out.println("Aldeia: " + aldeiaCaixaBaixa);
    }
}
