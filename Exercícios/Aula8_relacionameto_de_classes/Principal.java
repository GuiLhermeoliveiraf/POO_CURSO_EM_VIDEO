public class Principal {
    public static void main(String[] args) {

        Lutador lut[] = new Lutador[6];

        lut[0] = new Lutador("Guilherme", "Brasileiro", 29, 1.80f, 81f, 18, 2, 0);

        lut[1] = new Lutador("Mateus", "Cubano", 22, 1.75f, 79f, 9, 6, 2);

        lut[2] = new Lutador("Vitor", "Argentino", 34, 169f, 67f, 17, 6, 6);

        lut[3] = new Lutador("Pedro", "Chileno", 27, 1.72f, 77f, 10, 2, 1);

        lut[4] = new Lutador("Felipe", "Venezuelano", 39, 1.82f, 82f, 19, 2, 7);

        lut[5] = new Lutador("Anderson", "Estadunidense", 19, 1.75f, 65f, 5, 1, 1);

        Luta luta1 = new Luta();

        luta1.marcarLuta(lut[0], lut[4]);
        luta1.luta();
        System.out.println();
        lut[0].status();
        System.out.println();
        lut[4].status();

    }
}
