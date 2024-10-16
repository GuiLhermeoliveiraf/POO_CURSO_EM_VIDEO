# Criando um método ⚙️
> Métodos da classe Caneta, da primeira atividade em Java POO

🌟 **Métodos para gerenciar o status e ações de uma caneta!** 🖊️✏️

<br>

### Exemplos de Métodos:
### Método Status, onde mostra todos os atributos da classe Caneta:
Exemplo:

```java
void status() {
    System.out.println("✏️ Modelo: " + this.modelo);
    System.out.println("🎨 Cor: " + this.cor);
    System.out.println("🖊️ Ponta: " + this.ponta);
    System.out.println("🔋 Carga: " + this.carga);
    System.out.println("🔒 Está tampada?: " + this.tampada);
}
```

<br>

### Métodos **tampar** 🔒 e **destampar** 🔓, onde você define se a caneta está tampada ou não:

Exemplo:

```java
void tampar() {
    this.tampada = true;
}

void destampar() {
    this.tampada = false;
}
```

<br>

## Getters 🔍
> Função: Os getters permitem o acesso aos valores dos atributos privados de uma classe. Eles geralmente não recebem parâmetros e apenas retornam o valor do atributo.  

Exemplo:  

```java
public class Caneta {
    private String cor;

    // Getter para acessar o valor do atributo 'cor'
    public String getCor() {
        return this.cor;
    }
}
``` 

Nesse exemplo, o método `getCor()` retorna o valor do atributo privado `cor`.

<br>

## Setters 🛠️
> Função: Os setters são usados para modificar o valor de um atributo privado de uma classe. Eles geralmente recebem um parâmetro, que é o novo valor que será dado ao atributo.  

Exemplo:

```java
public class Caneta {
    private String cor;

    // Setter para modificar o valor do atributo 'cor'
    public void setCor(String cor) {
        this.cor = cor;
    }
}
``` 

Nesse exemplo, o método `setCor()` recebe um parâmetro e atribui esse valor ao atributo `cor`.

<br>

## Métodos Construtores 🏗️

> Função: Os construtores são métodos especiais que são chamados quando um objeto da classe é criado. Eles podem ou não ter parâmetros, dependendo da função desejada. O construtor inicializa os atributos da classe e configura o estado inicial do objeto.

### Características:

- Não tem tipo de retorno (`void`).
- Pode ter parâmetros para inicializar atributos com valores específicos.
- Se nenhum construtor for definido, um construtor padrão sem parâmetros é fornecido pelo compilador.  

Exemplo:

```java
public class Caneta {
    private String cor;

    // Construtor que define a cor da caneta
    public Caneta(String corInicial) {
        this.cor = corInicial;
    }

    // Getter para acessar o valor da cor
    public String getCor() {
        return this.cor;
    }
}
``` 
Aqui, o construtor `Caneta(String corInicial)` permite criar objetos da classe Caneta já definindo o valor do atributo `cor` na criação do objeto.











