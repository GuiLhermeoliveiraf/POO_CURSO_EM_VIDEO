public class Caneta{
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: "  + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada?: " + this.tampada);

    }
   
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro!!!!! Estou tampada");
        }

        else{
            System.out.println("Estou rabiscando....");
        }
    }

    public void tampada(){
        this.tampada = true;
    }

    public void destanpada(){
        this.tampada = false;
    }


}