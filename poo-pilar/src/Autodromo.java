public class Autodromo {
    public static void main(String[] args) {
        Carro palio = new Carro();

        palio.ligar();
        palio.setChassi("897897");

        Moto pop100 = new Moto();
        pop100.setChassi("465778");
        pop100.ligar();

        Veiculo coringa = pop100;

        coringa.ligar();
    }
}
