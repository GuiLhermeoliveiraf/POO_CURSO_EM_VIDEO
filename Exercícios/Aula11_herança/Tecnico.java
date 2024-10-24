// Classe Tecnico é filha da Classe Aluno(Aluno é filho da Classe Pessoa)
public class Tecnico extends Aluno {
    private boolean registro;

    // Metados Getters e Setters
    public boolean getRegistro() {
        return registro;
    }

    private void setRegistro(boolean registro) {
        this.registro = registro;
    }

    // Metado para ativar registro
    public void ativarRegistro() {
        setRegistro(true);
    }

    // Metado Praticar
    public void patricar() {
        System.out.println("O aluno " + getNome() + " esta praticando");
    }
}
