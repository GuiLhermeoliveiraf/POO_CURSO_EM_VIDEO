# Conceitos de POO 🚀 
## Autor: [Guilherme Guimarães](https://github.com/GuiLhermeoliveiraf/)
### Aqui temos exemplos de conceitos de POO como 📚 Classes, 🧱 Objetos, 🔧 Métodos, etc. Explicações e exemplos sobre POO.
**[![GitHub](https://img.shields.io/badge/-GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/GuiLhermeoliveiraf/)**  
**[![LinkedIn](https://img.shields.io/badge/-LinkedIn-0A66C2?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/guilhermeoliiveira/)**

## Criando uma classe em Java 🏗️
Criando a classe Caneta 🖊️, com alguns atributos como modelo, cor, ponta, carga e se está tampada ou não.  
> Exemplo 👨‍💻💻: 

```java
public class Caneta {
    String modelo;   // ✏️ Modelo da caneta
    String cor;      // 🎨 Cor da caneta
    float ponta;     // 🖊️ Espessura da ponta
    int carga;       // 🔋 Quantidade de carga
    boolean tampada; // 🔒 Está tampada?
}
``` 
📄 Mais exemplos na página exclusiva do meu GitHub **[Resumo de Classes 🏗️](https://github.com/GuiLhermeoliveiraf/POO_CURSO_EM_VIDEO/blob/main/Conceitos/Classes.md)**

<br>

## Métodos ⚙️
Criando dois métodos para tampar 🔒 e destampar 🔓 a caneta:  
> Exemplo 👨‍💻💻: 

```java
void tampar() {
    this.tampada = true;   // 🔒 Caneta está tampada
}

void destampar() {
    this.tampada = false;  // 🔓 Caneta está destampada
}
``` 
📄 Mais exemplos na página exclusiva do meu GitHub **[Resumo de Métodos ⚙️](https://github.com/GuiLhermeoliveiraf/POO_CURSO_EM_VIDEO/blob/main/Conceitos/Metados.md)**

<br>

## Visibilidade de Atributos e Métodos 👁️
Definindo a visualização 👀 de atributos e métodos da classe caneta 🖊️.
> Exemplo 👨‍💻💻:
```java
public class Caneta{
    public String modelo;      // ✏️ Modelo da caneta
    public String cor;         // 🎨 Cor da caneta
    private float ponta;       // 🖊️ Espessura da ponta
    protected int carga;       // 🔋 Quantidade de carga
    private boolean tampada;   // 🔒 Está tampada?
}
``` 
Existem três principais níveis de visibilidade: public, private, protected. Abaixo, detalho cada um desses níveis:

📄 Mais exemplos na página exclusiva do meu GitHub **[Resumo de Visibilidade de Atributos e Métodos 👁️](https://github.com/GuiLhermeoliveiraf/POO_CURSO_EM_VIDEO/blob/main/Conceitos/Visibilidade.md)**

<br>

## Encapsulamento 🔒
O principal objetivo do encapsulamento é proteger e ocultar os dados de uma classe, permitindo que seu acesso seja controlado através de métodos específicos (getters e setters). Isso cria uma separação clara entre a implementação interna de uma classe e a interface pública que é exposta para os outros componentes do sistema.

>Exemplo 👨‍💻💻:

```java
public class Caneta {
    private String cor;     // Atributo privado
    private boolean tampada;  // Atributo privado

    // Construtor para inicializar a caneta
    public Caneta(String cor) {
        this.cor = cor;
        this.tampada = true;
    }

    // Getter para acessar a cor da caneta
    public String getCor() {
        return this.cor;
    }

    // Setter para modificar a cor da caneta
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método para tampar a caneta
    public void tampar() {
        this.tampada = true;
    }

    // Método para destampar a caneta
    public void destampar() {
        this.tampada = false;
    }

    // Método para verificar o estado da caneta
    public boolean isTampada() {
        return this.tampada;
    }
}
``` 
Os atributos `cor` e `tampada` estão encapsulados, ou seja, só podem ser acessados indiretamente por meio de métodos públicos (getters e setters).

📄 Mais exemplos na página exclusiva do meu GitHub **[Resumo de Encapsulamento 🔒](https://github.com/GuiLhermeoliveiraf/POO_CURSO_EM_VIDEO/blob/main/Conceitos/Encapsulamento.md)**

<br>

## Relacionamento entre classes 👥
A agregação é um tipo de relação entre classes em que uma classe contém ou é composta por objetos de outra classe, mas ambos os objetos podem existir de forma independente. A agregação representa uma relação "tem um", onde a classe "A" tem um objeto da classe "B".

>Exemplo 👨‍💻💻:

```java
// Classe Aluno
public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Classe Universidade
import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    private List<Aluno> alunos;

    // Construtor
    public Universidade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    // Método para adicionar aluno
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Método para listar os alunos
    public void listarAlunos() {
        System.out.println("Alunos da Universidade " + nome + ":");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }
}

// Classe Principal
public class Main {
    public static void main(String[] args) {
        // Criando alunos
        Aluno aluno1 = new Aluno("Lucas");
        Aluno aluno2 = new Aluno("Maria");

        // Criando uma universidade
        Universidade universidade = new Universidade("Universidade Federal");

        // Adicionando os alunos à universidade
        universidade.adicionarAluno(aluno1);
        universidade.adicionarAluno(aluno2);

        // Listando os alunos da universidade
        universidade.listarAlunos();
    }
}
``` 
Neste exemplo, a classe Universidade contém uma lista de objetos da classe Aluno. No entanto, os alunos não dependem diretamente da universidade para existir. Eles podem existir fora do contexto da universidade.

📄 Mais exemplos na página exclusiva do meu GitHub **[Resumo de Relacionamento entre classes 👥](https://github.com/GuiLhermeoliveiraf/POO_CURSO_EM_VIDEO/blob/main/Conceitos/Relacionamento%20entre%20classes.md)**

<br>

## Arrays e ArrayList em Java 🧮
Em Java, os arrays e a classe ArrayList são usados para armazenar coleções de elementos. Ambos têm características próprias e usos diferentes dependendo do cenário.

> Exemplo Array 🔧:

```java
// Declarando e criando um array de inteiros
int[] numeros = new int[5];  // Um array de 5 elementos do tipo int
numeros[0] = 10;  // Inicializando o primeiro elemento do array
``` 

> Exemplo ArrayList 📋:

```java
ArrayList<String> nomes = new ArrayList<>();
nomes.add("Lucas");
nomes.add("Maria");
nomes.add("Guilherme");

System.out.println("Tamanho: " + nomes.size());  // Saída: 3

System.out.println("Nome na posição 1: " + nomes.get(1));  // Saída: Maria

nomes.remove(0);  // Remove "Lucas"
System.out.println("Após remoção: " + nomes);  // Saída: [Maria, Guilherme]
``` 
Diferente dos arrays, o ArrayList é uma classe que faz parte do pacote java.util e permite armazenar elementos de forma dinâmica. Ou seja, o tamanho do ArrayList pode crescer ou diminuir dinamicamente, ao contrário dos arrays, que têm tamanho fixo.

📄 Mais exemplos na página exclusiva do meu GitHub **[Resumo de Arrays e ArrayList 🧮](https://github.com/GuiLhermeoliveiraf/POO_CURSO_EM_VIDEO/blob/main/Conceitos/Arrays%20e%20ArrayList.md)**
