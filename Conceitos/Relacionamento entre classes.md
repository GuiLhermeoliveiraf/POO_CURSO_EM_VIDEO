# Relacionamento entre classes
#### Relação de Agregação
> A agregação é um tipo de relação entre classes em que uma classe contém ou é composta por objetos de outra classe, mas ambos os objetos podem existir de forma independente. A agregação representa uma relação "tem um", onde a classe "A" tem um objeto da classe "B".

<br>

## Características Principais da Agregação:

### Ciclo de Vida Independente 


- Por exemplo, em uma relação entre Departamento e Funcionário, o departamento pode conter vários funcionários, mas se o departamento for fechado, os funcionários ainda existem e podem ser realocados para outros departamentos.


### Relacionamento "Tem um":

- A agregação descreve uma relação "tem um", onde uma classe contém objetos de outra classe como parte de seu estado interno, mas não estabelece uma dependência forte entre eles.


### Acesso Controlado:

- A classe agregadora pode acessar os objetos agregados, gerenciar seus estados e fornecer operações que manipulam esses objetos.

<br>

## Exemplo de Agregação:

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

### Universidade e Aluno:

- Neste exemplo, a classe Universidade contém uma lista de objetos da classe Aluno. No entanto, os alunos não dependem diretamente da universidade para existir. Eles podem existir fora do contexto da universidade

- Se a universidade for "destruída" ou deixada de lado, os objetos Aluno ainda podem existir e continuar sendo usados em outros contextos.

### Operações de Agregação:

- A classe Universidade gerencia a lista de alunos, permitindo que novos alunos sejam adicionados ou listados. Isso mostra como a agregação permite que uma classe controle o estado e as operações relacionadas aos objetos agregados.

<br>

## Benefícios da Agregação:

### Reutilização de Código:

- A manutenção do código é facilitada porque as classes que são usadas em agregação podem ser modificadas ou reutilizadas sem afetar as outras classes que dependem delas.

### Flexibilidade: 

- Como as instâncias dos objetos agregados podem ser criadas fora da classe que os contém, a agregação oferece flexibilidade no design do sistema.

<br>

## Resumo

Agregação é um tipo de relacionamento onde uma classe (agregadora) "tem" outra classe como parte de sua composição, mas ambas as classes podem existir independentemente. dando um exemplo, a classe Luta possui uma relação de agregação com a classe Lutador.

  









 
