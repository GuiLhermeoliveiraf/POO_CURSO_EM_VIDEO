# Criando uma classe 🏗️
> Uma classe em Programação Orientada a Objetos (POO) é um modelo ou estrutura que define as características e comportamentos de um conjunto de objetos. Ela encapsula atributos (dados) e métodos (funções) que descrevem o estado e as ações que os objetos podem realizar.

<br>

## Classe Caneta ✒️
### Criei uma classe Caneta, passando seus atributos como modelo, cor, ponta, carga e se está tampada ou não. 
> Exemplo:

```java
public class Caneta {
    String modelo;   // ✏️ Modelo da caneta
    String cor;      // 🎨 Cor da caneta
    float ponta;     // 🖊️ Espessura da ponta
    int carga;       // 🔋 Quantidade de carga
    boolean tampada; // 🔒 Está tampada?
}
```

<br>

## Estrutura de Classe 🏗️

#### Atributos 🧩

- São as variáveis que armazenam o estado de um objeto. Cada objeto pode ter diferentes valores para seus atributos.
- Exemplo: Em uma classe Caneta, os atributos podem ser cor, modelo e ponta.

#### Métodos ⚙️
- São as operações ou comportamentos que o objeto pode realizar. Eles podem manipular os atributos ou realizar ações baseadas no estado do objeto.
- Exemplo: Em uma classe Caneta, os métodos podem ser escrever(), tampar(), ou destampar().

#### Construtores 🔨
- São métodos especiais que são executados quando um objeto é criado. Eles servem para inicializar os atributos e definir o estado inicial do objeto.
- Exemplo: Ao criar uma Caneta, o construtor pode definir que a caneta está com tampada, ela é azul da marca Bic.

<br>

## Benefícios 🎯

#### Encapsulamento 🔒

- As classes encapsulam dados e métodos, protegendo a integridade dos objetos. Através de modificadores de acesso como `private`, `protected` e `public`, o programador pode controlar como os atributos e métodos podem ser acessados.

#### Reutilização de Código ♻️

- As classes permitem a criação de objetos reutilizando código. Uma vez que a classe é definida, ela pode ser usada para criar quantos objetos forem necessários, sem a necessidade de reescrever o código.

#### Facilidade de Manutenção 🔧

- Como os métodos são definidos dentro da classe, se precisarmos alterar o comportamento da caneta (como mudar a lógica de rabiscar), fazemos isso em um só lugar.

Exemplo: 

```java
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
}
``` 

## Resumo 📝
- **Atributos**: Variáveis que representam as propriedades do objeto.
- **Métodos**: Funções que definem o comportamento do objeto.
- **Objetos**: Instâncias da classe, ou seja, exemplos concretos baseados no modelo da classe.

