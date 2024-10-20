public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    // Metados Getters e Setters 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // Metado fazer aniversario
    public void fazerAniversario() {
        setIdade(getIdade() + 1);
    }

}
