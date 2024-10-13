public class Principal {
    public static void main(String[] args){

    Conta c1 = new Conta(0, false);

    c1.setDono("Guilherme");
    c1.setTipo("CP");   
    c1.abrirConta();
    c1.depositar(80);   
    c1.sacar(230);
    c1.fecharConta();
    c1.status();

    System.out.println();
    Conta c2 = new Conta(0, false);

    c2.setDono("Maju");
    c2.setTipo("CC");
    c2.abrirConta();
    c2.depositar(200);
    c2.sacar(120);
    c2.status();








    }
    
}
