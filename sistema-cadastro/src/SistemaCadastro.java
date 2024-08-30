public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "123");

        marcos.setEndereco("RUA DO LOGO ALI");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
