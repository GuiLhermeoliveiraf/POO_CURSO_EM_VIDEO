public class Principal {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();

        System.out.println(dog.reagir(true));
        System.out.println(dog.reagir("Ola"));
        System.out.println(dog.reagir(10, 30f));
        System.out.println(dog.reagir(10, 12));

    }
}
