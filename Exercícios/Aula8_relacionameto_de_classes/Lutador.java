public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;

    // metado contrutor

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int empates,
            int derrotas) {
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setVitorias(vitorias);
        setEmpates(empates);
        setDerrotas(derrotas);
    }

    // metados get e set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso < 52.2) {
            categoria = "invalido";
        }

        else if (peso <= 70.3) {
            categoria = "leve";
        }

        else if (peso <= 83.9) {
            categoria = "medio";
        }

        else if (peso < 120.2) {
            categoria = "pesado";
        }

        else {
            categoria = "invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    // Metados

    public void setGanharluta() {
        setVitorias(getVitorias() + 1);
    }

    public void setEmpatarluta() {
        setEmpates(getEmpates() + 1);
    }

    public void setPerderluta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void apresentrar() {
        System.out.println("Estamos apresentando");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de altura");
        System.out.println("Pesando " + this.getPeso() + " kg");
        System.out.println("Vitorias:  " + this.getVitorias());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Derrotas: " + this.getDerrotas());
    }

    public void status() {
        System.out.println(this.getNome());
        System.out.println("E um peso: " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getEmpates() + " Empates");
        System.out.println(this.getDerrotas() + " Derrotas");
    }

}