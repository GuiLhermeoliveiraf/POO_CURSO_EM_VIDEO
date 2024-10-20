public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Aluno pessoa2 = new Aluno();
        Professor pessoa3 = new Professor();
        Funcionario pessoa4 = new Funcionario();

        pessoa1.setNome("Julio");
        pessoa2.setNome("Gilber");
        pessoa3.setNome("Lucas");
        pessoa4.setNome("Lucas");

        pessoa2.setCurso("informatica");
        pessoa3.setSalario(2400);
        pessoa4.setSetor("almoxarifado");

    }
}
