public class Peixe extends Animal {
    public String corEscama;

    public Peixe(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        setCorEscama(corEscama);
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public String alimentar() {
        return "Comendo subtancias";
    }

    @Override
    public String emitirSom() {
        return "Peixe não emiti som";
    }

    @Override
    public String locomover() {

        return "Nadando";
    }

    public String soltarBolhas() {
        return "Soltar Bolhas";
    }

}
