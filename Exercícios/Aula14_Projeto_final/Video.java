public class Video implements Interface {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        setTitulo(titulo);
        setAvaliacao(1);
        setCurtidas(0);
        setViews(0);
        setReproduzindo(false);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void like() {
        setCurtidas(curtidas++);
    }

    @Override
    public void pause() {
        setReproduzindo(false);
    }

    @Override
    public void play() {
        setReproduzindo(true);
    }

    @Override
    public String toString() {
        return "Titulo= " + titulo + ", avaliacao= " + avaliacao + ", views= " + views + ", curtidas= " + curtidas
                + ", reproduzindo= " + reproduzindo;
    }

}
