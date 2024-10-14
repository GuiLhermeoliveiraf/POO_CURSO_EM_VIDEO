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
📄 Mais exemplos na página exclusiva do meu GitHub **[Resumo de Classes](https://github.com/GuiLhermeoliveiraf/POO_CURSO_EM_VIDEO/blob/main/Conceitos/Classes.md)**

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
📄 Mais exemplos na página exclusiva do meu GitHub **[Resumo de Métodos](https://github.com/GuiLhermeoliveiraf/POO_CURSO_EM_VIDEO/blob/main/Conceitos/Metados.md)**

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

📄 Mais exemplos na página exclusiva do meu GitHub **[Resumo de Visibilidade de Atributos e Métodos](https://github.com/GuiLhermeoliveiraf/POO_CURSO_EM_VIDEO/blob/main/Conceitos/Visibilidade.md)**

<br>

## Encapsulamento 🔒
O principal objetivo do encapsulamento é proteger e ocultar os dados de uma classe, permitindo que seu acesso seja controlado através de métodos específicos (getters e setters). Isso cria uma separação clara entre a implementação interna de uma classe e a interface pública que é exposta para os outros componentes do sistema.
Exemplo 👨‍💻💻:

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



