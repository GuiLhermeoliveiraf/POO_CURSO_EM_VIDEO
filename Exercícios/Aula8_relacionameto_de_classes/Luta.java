
import java.util.Random;

public class Luta {
    private Lutador desafiando;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    // Metados especiais
    public Lutador getDesafiando() {
        return desafiando;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setDesafiando(Lutador desafiando) {
        this.desafiando = desafiando;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    // Metados

    public void marcarLuta(Lutador lut1, Lutador lut2) {
        if (lut1.getCategoria() == lut2.getCategoria() && lut1 != lut2) {
            this.aprovada = true;
            this.desafiado = lut1;
            this.desafiando = lut2;

        }

        else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiando = null;
        }
    }

    public void luta() {
        if (this.aprovada) {
            System.err.println("***** DESAFIADO *****");
            this.desafiado.apresentrar();
            System.out.println();
            System.out.println("***** DESAFIANTE *****");
            this.desafiando.apresentrar();

            System.out.println();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("== RESULTADO DA LUTA ==");
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("Tivemos um Empate ");
                    this.desafiado.setEmpatarluta();
                    this.desafiando.setEmpatarluta();

                    break;
                case 1: // Vitoria do Desafiado
                    System.out.println("A Vitoria do  " + this.desafiado.getNome());
                    this.desafiado.setGanharluta();
                    this.desafiando.setPerderluta();
                    break;
                case 2: // Vitoria do Desafiante

                    System.out.println("A Vitoria do " + this.desafiando.getNome());
                    this.desafiado.setPerderluta();
                    this.desafiando.setGanharluta();
                    break;

            }

            System.out.println("=======================");

        }

        else {
            System.out.println("Luta não pode acontecer !!!");
        }
    }

}
