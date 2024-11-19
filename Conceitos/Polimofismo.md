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

## 🌟 Abstração em Java

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
// Classe abstrata Pessoa
public abstract class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract void exibirInformacoes();
}

// Classe Aluno
public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Aluno:");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Matrícula: " + matricula);
    }
}

// Classe Professor
public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String cpf, String disciplina) {
        super(nome, cpf);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Professor:");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Disciplina: " + disciplina);
    }
}

// Classe principal para testar
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas Maciel", "123.456.789-00", "2024001");
        Professor professor = new Professor("Rafael Silva", "987.654.321-00", "Matemática");

        aluno.exibirInformacoes();
        System.out.println();
        professor.exibirInformacoes();
    }
}

```

---

### 🔍 Explicação do Exemplo:

- 🔹 A classe **Pessoa** é abstrata e contém atributos e métodos comuns para **Aluno** e **Professor**. Também define um método abstrato `exibirInformacoes()` que deve ser implementado pelas subclasses.
- 📐 **Aluno** e **Professor** herdam de **Pessoa** e implementam o método `exibirInformacoes()` para exibir informações específicas de cada tipo.
- 📏 O método `exibirInformacoes()` é sobrescrito (`@Override`) nas subclasses.
- 🔧 Este código demonstra como criar uma estrutura de classes bem organizada em Java, aplicando abstração, herança, e polimorfismo. A classe **Pessoa** encapsula os comportamentos básicos, enquanto **Aluno** e **Professor** representam especializações, adicionando comportamentos e atributos únicos.

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

<br>


## 🧱 Sobrecarga

> O Polimorfismo de Sobrecarga (ou Overloading) ocorre quando vários métodos na mesma classe têm o mesmo nome, mas diferem na assinatura (quantidade, tipo ou ordem dos parâmetros). É um exemplo de polimorfismo em tempo de compilação, pois o método que será executado é determinado pelo compilador com base nos argumentos passados.

---

### 🔑 Características do Polimorfismo de Sobrecarga

- 📛 **Métodos com o mesmo nome**: Os métodos devem ter o mesmo nome, mas assinaturas diferentes.
- 🕒 **Decisão em tempo de compilação**: O compilador decide qual método chamar com base nos argumentos passados.
- 📦 **Mesma classe**: Os métodos sobrecarregados devem estar na mesma classe (não envolve herança).

---

### 💻 Exemplo Prático

```java
class Calculadora {
    // Método para somar dois números inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método para somar três números inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Método para somar dois números de ponto flutuante
    public double somar(double a, double b) {
        return a + b;
    }
}

public class TesteSobrecarga {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(2, 3));          // Saída: 5
        System.out.println(calc.somar(2, 3, 4));       // Saída: 9
        System.out.println(calc.somar(2.5, 3.5));      // Saída: 6.0
    }
}
```

---

### 🔍 Como o compilador escolhe o método?

- ✅ O compilador avalia os argumentos passados para determinar qual assinatura de método é compatível.
- 🔄 Ele verifica o tipo de dado e a ordem dos parâmetros.
- ⚠️ Se houver várias opções possíveis, pode ocorrer um erro de ambiguidade.

---

### 📜 Regras para Sobrecarga

- **📋 Assinatura diferente**: O número, tipo ou ordem dos parâmetros deve ser diferente.
  - Apenas mudar o tipo de retorno **não é suficiente** para sobrecarga.
- **🔐 Pode incluir modificadores de acesso**: Os métodos sobrecarregados podem ter diferentes níveis de acesso (ex.: `public`, `protected`).

---

### ✅ Vantagens da Sobrecarga

- 📝 **Clareza**: Permite usar o mesmo nome para métodos que realizam ações semelhantes, tornando o código mais legível.
- 🔧 **Flexibilidade**: Permite adaptar o comportamento dos métodos para diferentes tipos e números de parâmetros.
- 📚 **Organização**: Evita a criação de vários métodos com nomes diferentes para ações relacionadas.
