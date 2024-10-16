public class Principal {
    public static void main(String[] args){
        
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destanpada();
        c1.status();
        c1.rabiscar();
        
        System.out.println(  );
        
        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Vermelha";
        c2.tampada();
        c2.status();
        c2.rabiscar();







    }
}
