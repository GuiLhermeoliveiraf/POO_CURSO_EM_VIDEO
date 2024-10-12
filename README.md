# Conceitos de POO 
## Autor: [Guilherme Guimarães](https://github.com/GuiLhermeoliveiraf/)
### Aqui temos exemplos de conceitos de poo como Classes, objetos, metados, etc explicações e exemplos sobre a poo
 **[![GitHub](https://img.shields.io/badge/-GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/GuiLhermeoliveiraf/)**  
 **[![LinkedIn](https://img.shields.io/badge/-LinkedIn-0A66C2?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/guilhermeoliiveira/)**

## Criando uma classe em java
Criando a classe caneta, com alguns atributos como modelo, cor, ponta, carga e se esta tampada ou não.  
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
Mais exemplos na pagina exclusiva do meu github **[Resumo de classes](https://github.com/GuiLhermeoliveiraf/POO_CURSO_EM_VIDEO/blob/main/Conceitos/Classes.md)**

<br>

## Metados
Criando dois metados de tampar e destampar a caneta:  
>Exemplo: 

```java
void tampar() {
    this.tampada = true;
}

void destampar() {
    this.tampada = false;
}
``` 
Mais exemplos na pagina exclusiva do meu github **[Resumo de classes](https://github.com/GuiLhermeoliveiraf/POO_CURSO_EM_VIDEO/blob/main/Conceitos/Metados.md)**
