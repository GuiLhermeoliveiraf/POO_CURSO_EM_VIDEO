# Conceitos de POO 
## Autor: [Guilherme Guimarães](https://github.com/GuiLhermeoliveiraf/)
### Aqui temos exemplos de conceitos de POO como 📚 Classes, 🧱 Objetos, 🔧 Métodos, etc. Explicações e exemplos sobre POO.
**[![GitHub](https://img.shields.io/badge/-GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/GuiLhermeoliveiraf/)**  
**[![LinkedIn](https://img.shields.io/badge/-LinkedIn-0A66C2?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/guilhermeoliiveira/)**

## Criando uma classe em Java
Criando a classe Caneta 🖊️, com alguns atributos como modelo, cor, ponta, carga e se está tampada ou não.  
>Exemplo: 

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

## Métodos
Criando dois métodos para tampar 🔒 e destampar 🔓 a caneta:  
>Exemplo: 

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

## Visibilidade de Atributos e Métodos
Defindo a visualização de atributos e metados da classe caneta🖊️
>Exemplo:
```java
public class Caneta{
    public String modelo;      // ✏️ Modelo da caneta
    public String cor;         // 🎨 Cor da caneta
    private float ponta;       // 🖊️ Espessura da ponta
    protected int carga;       // 🔋 Quantidade de carga
    private boolean tampada;   // 🔒 Está tampada?
}
``` 
existem três principais níveis de visibilidade: public, private, protected. Abaixo, detalho cada um desses níveis:

📄 Mais exemplos na página exclusiva do meu GitHub **[Resumo de Visibilidade de Atributos e Métodos](https://github.com/GuiLhermeoliveiraf/POO_CURSO_EM_VIDEO/blob/main/Conceitos/Visibilidade.md)**




