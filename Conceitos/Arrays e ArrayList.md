
# Arrays e ArrayList em Java 🧮
> Em Java, os arrays e a classe `ArrayList` são usados para armazenar coleções de elementos. Ambos têm características próprias e usos diferentes dependendo do cenário.

<br>

# Criação de Arrays 🗂️
> Os arrays em Java são estruturas de dados que armazenam elementos de um tipo específico em posições contíguas de memória. Eles têm um tamanho fixo, determinado no momento de sua criação, e podem conter tanto tipos primitivos quanto tipos por referência.

<br>

## Características do Array 🔧

- Para declarar um array, é necessário especificar o tipo de elemento e o tamanho do array.
- O tamanho do array é fixo e não pode ser alterado após a sua criação.
- Arrays são altamente eficientes em termos de memória e velocidade de acesso, pois os elementos são armazenados de forma contígua na memória.

### Sintaxe:

```java
tipo[] nomeArray = new tipo[tamanho];
``` 
Exemplo:

```java
// Declarando e criando um array de inteiros
int[] numeros = new int[5];  // Um array de 5 elementos do tipo int
numeros[0] = 10;  // Inicializando o primeiro elemento do array
``` 

<br>

## Inicializador de Arrays 🚀

- Você pode inicializar um array no momento da sua criação usando uma lista de inicializadores, entre chaves `{}`, sem precisar especificar o tamanho, pois ele é determinado automaticamente pelo número de elementos.

### Sintaxe:

```java
tipo[] nomeArray = { valor1, valor2, valor3, ... };
``` 

Exemplo: 

```java
// Declarando e inicializando um array de inteiros
int[] numeros = {1, 2, 3, 4, 5};  // O array tem 5 elementos
``` 

#### Os elementos de um array podem ser acessados usando seus índices, começando do zero.

Exemplo:

```java
int[] numeros = {10, 20, 30, 40, 50};
System.out.println(numeros[0]);  // Saída: 10
System.out.println(numeros[3]);  // Saída: 40
``` 
#### Podemos usar loops como `for` e `for-each` para percorrer os elementos de um array.

Usando `for`:

```java
int[] numeros = {10, 20, 30, 40, 50};
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
``` 

<br>

# ArrayList 📋
> Diferente dos arrays, o `ArrayList` é uma classe que faz parte do pacote `java.util` e permite armazenar elementos de forma dinâmica. Ou seja, o tamanho do `ArrayList` pode crescer ou diminuir dinamicamente, ao contrário dos arrays, que têm tamanho fixo.

<br>

### Características do ArrayList 🌱:

- Pode aumentar ou diminuir de tamanho dinamicamente conforme você adiciona ou remove elementos.
- Permite a utilização de vários métodos prontos, como `add()`, `remove()`, `get()`, entre outros.

<br>

## Criação de um ArrayList 📦:

Para usar o `ArrayList`, é necessário importar a classe: **`import java.util.ArrayList`**

### Sintaxe:

```java
ArrayList<tipo> nomeArrayList = new ArrayList<>();
``` 

<br>

## Principais Métodos de ArrayList 🛠️:

- `add(elemento)`: Adiciona um elemento ao final do `ArrayList`.
- `add(index, elemento)`: Adiciona um elemento em uma posição específica.
- `get(index)`: Retorna o elemento na posição especificada.
- `remove(index)`: Remove o elemento na posição especificada.
- `size()`: Retorna o número de elementos no `ArrayList`.
- `clear()`: Remove todos os elementos do `ArrayList`.

<br>

### Exemplo 💻:

```java
import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criando um ArrayList de Strings
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionando elementos ao ArrayList
        nomes.add("Lucas");
        nomes.add("Maria");
        nomes.add("Guilherme");

        // Acessando um elemento pelo índice
        System.out.println(nomes.get(1));  // Saída: Maria

        // Removendo um elemento
        nomes.remove("Lucas");

        // Exibindo o tamanho do ArrayList
        System.out.println("Tamanho do ArrayList: " + nomes.size());

        // Iterando sobre o ArrayList
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
``` 

### Exemplo de Uso de Métodos 📑:

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

<br>

## Conclusão 🎯:

- **Arrays** são úteis quando você sabe o tamanho da coleção e quer eficiência em termos de memória.
- **ArrayList** é preferível quando o tamanho da coleção pode mudar durante a execução do programa, oferecendo mais flexibilidade e métodos para gerenciar os elementos.





