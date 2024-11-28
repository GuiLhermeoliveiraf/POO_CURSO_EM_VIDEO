public class Youtube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Deu a louca");
        v[1] = new Video("Testee");
        v[2] = new Video("Náo");

        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto("Guilherme", 20, "Masculino", "Gmail");
        g[1] = new Gafanhoto("Daniel", 50, "Masculino", "Fapam");

        Visulacao vis = new Visulacao(g[1] ,v[0]);

        System.out.println(vis.toString());


    }
}
