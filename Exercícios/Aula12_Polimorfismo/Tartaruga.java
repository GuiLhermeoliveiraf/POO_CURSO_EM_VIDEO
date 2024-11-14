public class Tartaruga extends Reptil {
    public Tartaruga(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public String locomover() {
        return "Andando bem devagaaaar";
    }

}
