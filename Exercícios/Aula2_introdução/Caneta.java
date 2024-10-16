public class Caneta{
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: "  + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada?: " + this.tampada);

    }
   
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro!!!!! Estou tampada");
        }

        else{
            System.out.println("Estou rabiscando....");
        }
    }

    void tampada(){
        this.tampada = true;
    }

    void destanpada(){
        this.tampada = false;
    }


}