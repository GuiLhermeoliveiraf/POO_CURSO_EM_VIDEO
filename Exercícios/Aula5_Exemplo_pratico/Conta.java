public class Conta{
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Contrutor
    public Conta(float saldo, boolean status){
        setSaldo(0);
        setStatus(false);

    }
    
    // Metedos GET e SET de todos os atributos 
    public int getNumconta(){
        return numConta;
    }

    public String getTipo(){
        return tipo;
    }

    public String getDono(){
        return dono;
    }

    public float getSaldo(){
        return saldo;
    }

    public boolean getStatus(){
        return status;
    }

    public void setNumconta(int numConta){
        this.numConta = numConta;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setDono(String dono){
        this.dono = dono; 
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    // Metados da classe 
    public void abrirConta(){
        if (getTipo() == "CC"){
            this.setSaldo(50);
            this.setStatus(true);
        }

        else{
            this.setSaldo(150);
            this.setStatus(true);
        }   

    }

    public void fecharConta(){
      
        if(saldo > 0){
            System.out.println("A conta tem dinheiro não posso fechar ela");
        }
        
        if(saldo < 0){
            System.out.println("Conta em debito, não pode ser fechada");
        }
    
        else{          
            setStatus(false);
            System.out.println("Conta fechada");         
        }
    }

    public void depositar(float deposito){
        
        if(this.status = true){
            this.saldo = this.saldo + deposito;
            System.out.println("Deposito de " + deposito + " foi realizado na conta de " + getDono());
        }
    
    }

    public void sacar(float valor){
        if(getStatus() == true){
            if(saldo >= valor){
                this.saldo = this.saldo - valor;
                System.out.println("Saque realizado no valor de " + valor + " no nome de: "+ getDono());
            
            }
        }
        
        else{
            System.out.println("Valor insuficente para sacar");
        }
    
    }


    public void pagarMensalidade(){
        if(getStatus() == true){
           
            if(getSaldo() > 0){
            
                if(getTipo() == "CC"){
                    this.saldo = this.saldo - 12f;
                }
            
                else{
                    this.saldo = this.saldo - 20f;
                }
            }
        
        }       
        
    }


    public void status(){
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }







}