public class Visulacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visulacao(Gafanhoto espectador, Video filme) {
        setEspectador(espectador);
        setFilme(filme);
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visulacao [espectador=" + espectador + ", filme=" + filme + "]";
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porcetagem) {
        int nota = 0;
        if (porcetagem <= 20) {
            nota = 3;
        } else if (porcetagem <= 50) {
            nota = 5;
        } else if (porcetagem <= 90) {
            nota = 8;
        } else {
            nota = 10;
        }

        this.filme.setAvaliacao(nota);
    }

}
