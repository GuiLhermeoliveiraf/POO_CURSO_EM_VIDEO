public class Canguru extends Mamifero {

    public Canguru(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    public String bolsa() {
        return "Usando Bolsa";
    }

    @Override
    public String locomover() {
        return "Saltando";
    }

}
