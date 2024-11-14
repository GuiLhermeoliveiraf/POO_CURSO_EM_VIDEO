public class Principal {
    public static void main(String[] args) {

        Mamifero Cachorro = new Mamifero(80, 40, 4, "Preto");
        Reptil Largarto = new Reptil(20, 20, 4, "Caramelo");
        Peixe Dourado = new Peixe(2, 2, 0, "Dourado");
        Ave Bentivi = new Ave(15, 10, 4, "branca");

        Cachorro.emitirSom();
        Cachorro.alimentar();
        Cachorro.locomover();

        Largarto.emitirSom();
        Largarto.alimentar();
        Largarto.locomover();

        Dourado.emitirSom();
        Dourado.alimentar();
        Dourado.locomover();

        Bentivi.emitirSom();
        Bentivi.alimentar();
        Bentivi.locomover();

    }
}
