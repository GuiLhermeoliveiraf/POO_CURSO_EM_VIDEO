// A classe Aluno é filha da Classe Pessoa
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    // Metados Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Metado Pagar Matricula
    public void pagarMatricula() {
        System.out.println("Matricula Paga do aluno: " + getNome());
    }
}
