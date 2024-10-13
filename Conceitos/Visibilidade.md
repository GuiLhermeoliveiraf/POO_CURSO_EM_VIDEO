# Visibilidade de atributos e metados
A visibilidade de atributos e métodos em Programação Orientada a Objetos (POO) é controlada pelos modificadores de acesso. Eles determinam onde esses membros (atributos e métodos) podem ser acessados no código. Existem tres principais níveis de visibilidade: public, private, protected, detalho cada um desses níveis:

<br>

## Visibilidade  Publica 
> O modificador de acesso public em Programação Orientada a Objetos (POO) permite que atributos e métodos de uma classe sejam acessados de qualquer lugar, sem restrições. Isso significa que tanto a própria classe quanto outras classes, subclasses ou objetos podem acessar os membros públicos.   

Características do public:
- Acesso irrestrito: Qualquer classe ou objeto pode acessar os membros públicos, independentemente de onde estejam localizados no programa.  

- Reutilização facilitada: Como os membros são acessíveis de qualquer parte, isso facilita a comunicação e a utilização desses métodos e atributos entre diferentes classes e objetos.

Exemplo:
```java
public class Caneta {
    public String modelo;
    public String cor;

    // Método público para exibir o status da caneta
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
 }
``` 

Como os atributos modelo e cor são public, podem ser acessados diretamente fora da classe Caneta:  

Exemplo:

```java
// Classe principal para usar o objeto Caneta
public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        // Acessando atributos públicos diretamente
        c1.modelo = "Bic";  // Pode acessar porque é público
        c1.cor = "Azul";  // Pode acessar porque é público
            
}
``` 
<br>

Resultado:

```java
Cor: Azul
Modelo: BIC
``` 

<br>

## Visibilidade Privada
> O modificador de acesso private em Programação Orientada a Objetos (POO) restringe o acesso de atributos e métodos exclusivamente à própria classe onde foram declarados.  

Características do private:

- Visibilidade limitada: Atributos e métodos private não podem ser acessados diretamente por outras classes, nem mesmo por subclasses.  

- Encapsulamento: Protege os dados sensíveis ou a lógica interna da classe, garantindo que só possam ser manipulados através de métodos públicos da própria classe (como getters e setters).  

- Controle de acesso: Garante que o acesso a esses membros seja feito de maneira controlada, evitando modificações diretas externas que poderiam comprometer a integridade do objeto.

Exemplo: 

```java
public class Caneta {
    private boolean tampada;  // Atributo privado

    // Método público para alterar o estado de 'tampada'
    public void tampar() {
        this.tampada = true;
    }

    // Método público para verificar o estado de 'tampada'
    public void destampada() {
        return this.tampada;
    }
}
``` 
Nesse exemplo, o atributo tampada é private, mas pode ser acessado e modificado indiretamente através dos métodos públicos tampar() e destampada().

<br>

## Visibilidade Protegida  
> O modificador de acesso protected em Programação Orientada a Objetos (POO) define a visibilidade de atributos e métodos de uma classe, permitindo que eles sejam acessados dentro da própria classe e por suas subclasses (classes que herdam dessa classe). No entanto, os membros protegidos não são acessíveis diretamente por outras classes fora dessa hierarquia de herança, diferentemente dos membros públicos.

Características do protected: 

- Acesso dentro da classe: Membros marcados como protected podem ser acessados normalmente dentro da classe onde foram declarados.  

- Acesso em subclasses: Classes que herdam de outra podem acessar os membros protected da classe pai.  

-  Não acessível por outras classes: Qualquer outra classe que não faça parte dessa hierarquia de herança não consegue acessar diretamente membros protegidos.
