public class Livro implements Interface {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Metado construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        setTitulo(titulo);
        setAutor(autor);;
        setTotPaginas(totPaginas);
        setPagAtual(0);
        setAberto(false);
        setLeitor(leitor);
    }

    // Metados de Getter e Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // Metados importados de Interface
    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear() {
        setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void avancarPag(int num) {
        setPagAtual(getPagAtual() + num);
    }

    @Override
    public void voltarPag(int num) {
        setPagAtual(getPagAtual() - num);
    }

    // Metados que imprime os detalhes
    public void Detalhes() {
        System.out.println("Apresentando o livro " + getTitulo());
        System.out.println("Escrito pelo autor " + getAutor());
        System.out.println("Tendo um total de paginas de " + getTotPaginas());
        System.out.println("Voce esta na pagina " + getPagAtual());
        System.out.println("Ele esta aberto agora ? " + getAberto());
        System.out.println("Quem esta lendo é o " + leitor.getPessoa());

    }

}
