public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        setCorpelo(corPelo);
    }

    public String getCorpelo() {
        return corPelo;
    }

    public void setCorpelo(String corpelo) {
        corPelo = corpelo;
    }

    @Override
    public String alimentar() {
        return "Mamando";
    }

    @Override
    public String emitirSom() {
        return "Som de Mamifero";
    }

    @Override
    public String locomover() {
        return "Correndo";
    }

}
