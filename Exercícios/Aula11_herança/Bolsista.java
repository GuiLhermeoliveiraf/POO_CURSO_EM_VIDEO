// A classe bolsista é filha da classe Aluno(Aluno é filho da Classe Pessoa)
public class Bolsista extends Aluno {
    private int bolsa;

    // Metados Getters e Setters
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    // Renovar Bolsa
    public void renovarBolsa() {
        System.err.println("Renovando a bolsa do aluno " + getNome());
    }

    // Metado Pagar Mensalidade metado sobreexposto da Classe Aluno
    public void pagarMatricula() {
        System.out.println("Matricula paga com Desconto do aluno " + getNome());
    }
}
