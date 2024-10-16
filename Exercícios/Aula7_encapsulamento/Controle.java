public class Controle implements Interface{

    // atributos da classe controle 
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Metado contrutor, colocando valores inicias 
    public Controle(){
        setVolume(50);
        setLigado(false);
        setTocando(false);

    }

    // Metados get e set de cada atributo
    private int getVolume(){
        return volume;
    }

    private void setVolume(int volume){
        this.volume = volume;
    }

    private boolean getLigado(){
        return ligado;
    }

    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    private boolean getTocando(){
        return tocando;
    }

    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    // Metados abstratos da interface
    @Override
    public void ligar() {
       this.setLigado(true); 
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirmenu() {       
        System.out.println("----- Menu -----");
        System.out.println("Esta ligado? " + getLigado());
        System.out.println("Esta tocando? " + getTocando());
        System.out.print("Volume: ");
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println("");
    }


    @Override
    public void fecharmenu() {
       System.out.println("Fechando menu...");
    }

    @Override
    public void maisvolume() {
        if(this.getLigado()){
            this.setVolume(getVolume() + 5);
        }
    }

    @Override
    public void menosvolume() {
       if(this.getLigado()){
        this.setVolume(getVolume() - 5);
       }
    }

    @Override
    public void ligarmudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarmudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override  
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(false);
        }
    }


    













}

