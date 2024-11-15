# 🌟 Polimorfismo em Java

## 🌀 Sobreposição 

> O Polimorfismo de Sobreposição em Java, também conhecido como **polimorfismo de tempo de execução** ou **overriding**, ocorre quando uma classe filha redefine um método que já foi declarado em sua classe pai. Essa é uma forma de polimorfismo em que o comportamento do método é determinado durante a execução do programa.

---

### 🔑 Características principais do Polimorfismo de Sobreposição:

- 🧩 **Herança**: É necessário que a classe filha herde de uma classe pai.
- 🔄 **Mesma assinatura**: O método redefinido na classe filha deve ter o mesmo nome, tipo de retorno e parâmetros que o método na classe pai.
- ✅ **Anotação @Override**: Embora não obrigatória, é recomendada para indicar que um método está sendo sobrescrito. Isso ajuda a identificar erros de compilação caso a assinatura não seja exatamente a mesma.

---

### 💻 Exemplo Prático

```java
// Classe Pai
class Animal {
    public void emitirSom() {
        System.out.println("O animal faz um som genérico.");
    }
}

// Classe Filha 1
class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

// Classe Filha 2
class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato mia: Miau!");
    }
}

// Classe principal
public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal meuAnimal;

        meuAnimal = new Cachorro(); // Referência genérica para Cachorro
        meuAnimal.emitirSom(); // Saída: O cachorro late: Au Au!

        meuAnimal = new Gato(); // Referência genérica para Gato
        meuAnimal.emitirSom(); // Saída: O gato mia: Miau!
    }
}
```

### 🔍 Explicação do Exemplo:

- 🐾 A classe **Animal** possui o método `emitirSom`, que pode ser sobrescrito pelas classes filhas.
- 🐶 As classes **Cachorro** e **Gato** sobrescrevem o método `emitirSom` para fornecer comportamentos específicos.
- 🔄 Na classe principal, usamos uma variável do tipo **Animal** (classe pai) para armazenar objetos das classes filhas (**Cachorro** e **Gato**).
- ⏱️ O método chamado é decidido **em tempo de execução**, com base no tipo real do objeto.

---

### ✅ Vantagens do Polimorfismo de Sobreposição:

- 🎯 Flexibilidade: Permite usar referências genéricas para manipular objetos de diferentes tipos.
- 🔧 Expansibilidade: Facilita a extensão de funcionalidades ao sobrescrever métodos específicos.
- 🛠️ Manutenção: Torna o código mais modular e fácil de manter.

<br>

# 🌟 Abstração em Java

## 🔍 O que é Abstração?

> A abstração permite focar no **"o que"** um objeto faz, em vez de **"como"** ele faz.
> 
> É um processo de modelagem em que você extrai os atributos e comportamentos mais relevantes de um objeto do mundo real, deixando de lado os detalhes desnecessários. Em termos práticos, você projeta classes que representam conceitos de alto nível, enquanto os detalhes técnicos são tratados de forma privada ou em classes específicas.

---

### 🔑 Classes Abstratas

> Uma classe abstrata é uma classe que não pode ser instanciada diretamente. Ela serve como uma base para outras classes e pode conter:

- 📝 **Métodos abstratos**: Métodos sem implementação (apenas a assinatura), que devem ser obrigatoriamente implementados pelas subclasses.
- 🛠️ **Métodos concretos**: Métodos com implementação, que podem ser utilizados ou sobrescritos pelas subclasses.

---

### 💻 Exemplo Prático

```java
// Classe abstrata
abstract class Forma {
    double altura;
    double largura;

    public Forma(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    // Método abstrato (sem implementação)
    public abstract double calcularArea();

    // Método concreto (com implementação)
    public void exibirDimensoes() {
        System.out.println("Altura: " + altura + ", Largura: " + largura);
    }
}

// Classe concreta que estende a classe abstrata
class Retangulo extends Forma {
    public Retangulo(double altura, double largura) {
        super(altura, largura);
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }
}

public class TesteAbstracao {
    public static void main(String[] args) {
        Forma retangulo = new Retangulo(5, 10);
        retangulo.exibirDimensoes(); // Saída: Altura: 5.0, Largura: 10.0
        System.out.println("Área: " + retangulo.calcularArea()); // Saída: Área: 50.0
    }
}
```

---

### 🔍 Explicação do Exemplo:

- 🔹 A classe **Forma** é abstrata e serve como um modelo genérico para formas geométricas.
- 📐 O método `calcularArea` é abstrato, ou seja, não tem implementação na classe **Forma**. Cada classe que herda de **Forma** é obrigada a fornecer sua própria implementação.
- 📏 O método `exibirDimensoes` é concreto e pode ser utilizado diretamente pelas subclasses.
- 🔧 A classe **Retangulo** implementa o método abstrato `calcularArea`, fornecendo um comportamento específico.

---

### 📜 Regras importantes para Classes Abstratas:

- **📝 Métodos abstratos devem ser implementados**: Toda classe que herda de uma classe abstrata deve implementar os métodos abstratos.
- **🛠️ Podem conter métodos concretos**: Classes abstratas podem misturar métodos abstratos e concretos.
- **⚙️ Construtores podem ser usados**: Embora não possam ser instanciadas, classes abstratas podem ter construtores que serão chamados pelas subclasses.

---

### ✅ Vantagens da Abstração:

- 🤹‍♀️ **Redução de Complexidade**: Os detalhes de implementação são ocultos, facilitando o uso da classe.
- ♻️ **Reutilização de Código**: Classes abstratas permitem criar estruturas genéricas reutilizáveis.
- 🛡️ **Manutenção**: Como as implementações são separadas, é mais fácil fazer mudanças sem afetar o código que utiliza essas abstrações.
- 🌟 **Facilita a Extensibilidade**: Novas funcionalidades podem ser adicionadas sem modificar o código existente.

