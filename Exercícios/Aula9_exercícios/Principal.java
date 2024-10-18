public class Principal {
    public static void main(String[] Args) {

        Pessoa pes1 = new Pessoa("Guilherme", 24, "Masculino");

        pes1.fazeraniversario();

        Livro liv1 = new Livro("Teste", "Guilherme", 250, pes1);

        liv1.Detalhes();

        liv1.folhear();

        liv1.avancarPag(19);

        liv1.Detalhes();

    }
}
