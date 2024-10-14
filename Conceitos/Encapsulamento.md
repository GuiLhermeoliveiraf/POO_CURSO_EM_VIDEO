# Encapsulamento 🔒
> O encapsulamento é um dos pilares da Programação Orientada a Objetos (POO), junto com herança, polimorfismo e abstração. O principal objetivo do encapsulamento é proteger e ocultar os dados de uma classe, permitindo que seu acesso seja controlado através de métodos específicos (getters e setters). Isso cria uma separação clara entre a implementação interna de uma classe e a interface pública que é exposta para os outros componentes do sistema.

<br>

## Características do Encapsulamento 🧩:

### Atributos Privados 🔐:
- **Boa Prática**: Geralmente, os atributos de uma classe são definidos como `private`, o que significa que eles não podem ser acessados diretamente de fora da classe. Isso evita que o estado interno da classe seja modificado de forma errada.
- **Objetivo**: Protege os dados e permite que qualquer modificação seja feita de maneira controlada, geralmente através de métodos `public` (getters e setters).

### Métodos Públicos 🌐:
- **Interface Bem Definida**: As classes que seguem o encapsulamento fornecem uma interface pública bem definida através de métodos `public`, que permitem interagir com a classe sem expor diretamente seus atributos.
- **Acesso Controlado**: Os métodos (geralmente getters e setters) controlam o acesso e a modificação dos atributos, permitindo que a classe valide ou ajuste as entradas conforme necessário.

### Facilita a Manutenção e Reutilização de Código 🔧:
- **Reutilização**: Ao encapsular a lógica e expor apenas a interface necessária, a classe pode ser facilmente reutilizada em diferentes partes do código.

### Redução de Efeitos Colaterais ⚙️:
- Como os atributos estão protegidos, o comportamento inesperado causado pela modificação direta dos dados por outras classes é reduzido. Qualquer mudança no estado de um objeto será feita de maneira controlada, prevenindo efeitos colaterais indesejados.

<br>

## Exemplo 💻:

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

- **Atributos Privados**: Os atributos `cor` e `tampada` estão encapsulados, ou seja, só podem ser acessados indiretamente por meio de métodos públicos (getters e setters).

- **Interface Pública**: A classe expõe métodos `public`, como `getCor()`, `setCor()`, `tampar()` e `destampar()`, para que outras partes do código possam interagir com a Caneta sem precisar saber como ela está implementada internamente.

- **Validação e Controle**: A classe pode validar dados (por exemplo, garantir que `cor` receba apenas valores válidos) ou modificar o comportamento sem que o código externo precise ser alterado.

<br>

## Encapsulamento em Resumo 📄:

- **Protege os dados**: Atributos são privados e acessados/alterados através de métodos públicos.
- **Facilita a manutenção**: Mudanças internas não afetam o código externo.
- **Reduz efeitos colaterais**: Impede alterações não controladas no estado do objeto.
- **Boas práticas**: Ajuda a criar um código mais organizado, legível e reutilizável.







