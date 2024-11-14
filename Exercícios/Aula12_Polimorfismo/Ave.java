public class Ave extends Animal {
    public String corPena;

    public Ave(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        setCorPena(corPena);
        ;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public String alimentar() {
        return "Comendo Frutas";
    }

    @Override
    public String emitirSom() {
        return "Som de Ave";
    }

    @Override
    public String locomover() {
        return "Voando";
    }

    public String contruindoNinho() {
        return "Contruindo Ninho";
    }

}
