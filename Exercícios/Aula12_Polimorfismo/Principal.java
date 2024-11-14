public class Principal {
    public static void main(String[] args) {

        Mamifero Gato = new Mamifero(80, 40, 4, "Preto");
        Reptil Largarto = new Reptil(20, 20, 4, "Caramelo");
        Peixe Dourado = new Peixe(2, 2, 0, "Dourado");
        Ave Bentivi = new Ave(15, 10, 4, "branca");
        Cachorro Caramelo = new Cachorro(20, 20, 4, "Caramelo");
        Canguru Cangurujack = new Canguru(80, 30, 4, "Laranja");

        System.out.println(Gato.emitirSom());
        System.out.println(Gato.alimentar());
        System.out.println(Gato.locomover());

        System.out.println(Largarto.emitirSom());
        System.out.println(Largarto.alimentar());
        System.out.println(Largarto.locomover());

        System.out.println(Dourado.emitirSom());
        System.out.println(Dourado.alimentar());
        System.out.println(Dourado.locomover());

        System.out.println(Bentivi.emitirSom());
        System.out.println(Bentivi.alimentar());
        System.out.println(Bentivi.locomover());

        System.out.println(Caramelo.emitirSom());
        System.out.println(Caramelo.alimentar());
        System.out.println(Caramelo.locomover());
        System.out.println(Caramelo.abanarRabo());

        System.out.println(Cangurujack.emitirSom());
        System.out.println(Cangurujack.alimentar());
        System.out.println(Cangurujack.locomover());
        System.out.println(Cangurujack.bolsa());

    }
}
