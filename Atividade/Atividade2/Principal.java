public class Principal {
    public static void main(String[] args){
        
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; metado privado, erro 
        c1.carga = 80;
        // c1.tampada = true; metado privado, erro 
        c1.destanpada();
        c1.status();
        c1.rabiscar();
       
        






    }
}
