public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    // Metados Getters e Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    // Metado de aumentar salario
    public void aumentarSalario(float aumento) {
        setSalario(getSalario() + aumento);
    }

}
