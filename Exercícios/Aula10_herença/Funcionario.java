public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    // Metados Gettes e Setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    // Metados Alterar estado de trabalhando
    public void alterarTrabalho() {
        if (trabalhando = true) {
            setTrabalhando(false);
        }

        else {
            setTrabalhando(true);
        }
    }

    public void status() {
        System.out.println("Setor: " + getSetor() + "\n trabalhando: " + getTrabalhando());
    }

}
