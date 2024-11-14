public class Cachorro extends Mamifero {
    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    public String enterrarOsso() {
        return "Enterrando o Osso";
    }

    public String abanarRabo() {
        return "Abanando o rabo";
    }

}
