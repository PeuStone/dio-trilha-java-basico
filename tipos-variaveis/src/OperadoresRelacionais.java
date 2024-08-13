public class OperadoresRelacionais {
    public static void main(String[] args) {
        // Comparações com string
        String nomeUm = "Jurandir";
        String nomeDois = new String ("Jurandir");

        // System.out.println(nomeUm == nomeDois); Comparações de string e objetos é utilizado o método equals
        System.out.println(nomeUm.equals(nomeDois));

        // Comparações com números
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("NumeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("NumeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("NumeroUm é maior que numeroDois? " + simNao);
    }
}
