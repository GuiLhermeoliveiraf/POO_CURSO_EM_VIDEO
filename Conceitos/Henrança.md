# Herança
> Herança é um dos pilares da Programação Orientada a Objetos (POO). Ela permite que uma classe herde características (atributos) e comportamentos (métodos) de outra classe. Isso facilita a reutilização de código e a criação de hierarquias de classes.

 <br>

## Caracteriscas de Henrança 

### Reutilização de Código
- Um dos principais benefícios é a reutilização de código existente. A herança permite que classes filhas herdem métodos e atributos de classes pais, evitando a duplicação de código, reduzindo erros e melhorando a manutenção.

### Organização 

- A herança ajuda a criar uma estrutura de classes de forma hierárquica, onde conceitos mais genéricos estão no topo (superclasses) e conceitos mais específicos estão na base (subclasses). Isso reflete melhor o modelo do mundo real e permite uma organização clara e consistente do código.  

- Ao centralizar código comum em uma superclasse, mudanças ou correções feitas em métodos ou atributos herdados são automaticamente refletidas em todas as subclasses. Isso facilita a manutenção do sistema, pois o código relacionado está em um único lugar.

- Ao herdar atributos e métodos comuns, reduz-se a quantidade de código redundante, promovendo um código mais limpo e modular. Isso resulta em um software mais legível e fácil de entender.

### Polimorfismo

- A herança está fortemente ligada ao conceito de polimorfismo, que permite que objetos de diferentes classes filhas sejam tratados de forma uniforme por meio de uma referência à superclasse. Isso aumenta a flexibilidade do código, permitindo que métodos aceitem objetos de qualquer subclasse e comportem-se de acordo com o tipo de objeto recebido.

> Exemplo: Em um sistema de pagamento, se você tem uma classe Pagamento e subclasses Cartao e Boleto, um método que aceita um objeto Pagamento pode operar sobre instâncias de Cartao ou Boleto sem precisar conhecer o tipo específico.

<br>

## Exemplo
> Imagine que você tenha uma superclasse Animal e várias subclasses como Cachorro e Gato. A superclasse define os atributos e métodos básicos que todos os animais possuem.  

<br>

```java
// Superclasse
public class Animal {
    // Atributo
    String nome;

    // Método
    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

// Subclasse Cachorro que herda de Animal
public class Cachorro extends Animal {
    // Método específico para Cachorro
    public void abanarRabo() {
        System.out.println(nome + " está abanando o rabo.");
    }

    // Sobrescreve o método fazerSom
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}

// Subclasse Gato que herda de Animal
public class Gato extends Animal {
    // Sobrescreve o método fazerSom
    @Override
    public void fazerSom() {
        System.out.println("O gato mia");
    }
}


``` 
### Explicação:
 
- Superclasse Animal: Define o atributo nome e o método fazerSom().   

- Subclasse Cachorro e Gato: Herdam o atributo nome e o método fazerSom() da classe Animal.   

- A subclasse Cachorro define um método específico chamado abanarRabo() e sobrescreve (@Override) o método fazerSom() para fornecer um comportamento específico.   

- A subclasse Gato também sobrescreve o método fazerSom().    

<br>


## Herança em resumo

- Subclasses herdam características comuns da superclasse.

- Permite adicionar novos comportamentos específicos nas subclasses.

- Estrutura classes em hierarquias, refletindo melhor o mundo real.  

-  Métodos podem ser adaptados nas subclasses, mantendo um comportamento base.
