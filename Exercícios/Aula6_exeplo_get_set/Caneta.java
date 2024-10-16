public class Caneta{
    public String modelo;
    public String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta){          
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampar();   
    }
    
    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public float getPonta(){
        return this.ponta;
    
    }

    public void setPonta(float ponta){
        this.ponta = ponta;
    }


    public void status(){
        System.out.println("Sobre a Caneta: " );
        System.out.println("Modelo: " + this.getModelo());
        System.err.println("Ponta: " + this.getPonta());
        System.out.println("Cor " + this.cor);
        System.out.println("Tampada " +this.tampada);
    }


    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }




}