public class Principal {
    public static void main(String[] Args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Guilherme");
        aluno.pagarMatricula();

        Bolsista bolsa = new Bolsista();
        bolsa.setNome("Lucas");
        bolsa.pagarMatricula();

    }
}
