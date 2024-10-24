// Classe Professor é filha da Classe Pessoa
public class Professor extends Pessoa {
    private String especialidade;
    private float Salario;

    // Metados Getters e Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }

    // Metados aumento de Salario
    public void aumentarSalario(int valor) {
        setSalario(getSalario() + valor);
    }

}
