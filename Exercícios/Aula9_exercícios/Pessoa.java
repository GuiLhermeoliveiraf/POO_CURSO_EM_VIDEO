public class Pessoa {
    private String pessoa;
    private int idade;
    private String sexo;

    // Metado construtor
    public Pessoa(String pessoa, int idade, String sexo) {
        setPessoa(pessoa);
        setIdade(idade);
        setSexo(sexo);
    }

    // Metados Getters e Setters
    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
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

    // Metados
    public void fazeraniversario() {
        setIdade(getIdade() + 1);
    }

}
