public class Reptil extends Animal {
    private String corEscama;

    public Reptil(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);

    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public String locomover() {
        return "Rastejando";
    }

    @Override
    public String alimentar() {
        return "Coemendo Vegetais";
    }

    @Override
    public String emitirSom() {
        return "Som de Reptil";
    }

}
