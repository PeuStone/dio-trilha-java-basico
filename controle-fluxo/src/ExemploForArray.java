public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS"};

        /* utilização do método For padrão
        for (int x = 0; x< alunos.length; x++) {
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        }
         */

        // Outra forma de interagir com arrays
        for (String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}
