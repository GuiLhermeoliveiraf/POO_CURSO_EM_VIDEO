# Criando um método
> Métodos da classe Caneta, da primeira atividade em Java POO

🌟 **Metodos para gerenciar o status e ações de uma caneta!**

<br>

### Método Status, onde mostra todos os atributos da classe Caneta:
Exemplo:
```java
void status() {
    System.out.println("✏️ Modelo: " + this.modelo);
    System.out.println("🎨 Cor: " + this.cor);
    System.out.println("🖊️ Ponta: " + this.ponta);
    System.out.println("🔋 Carga: " + this.carga);
    System.out.println("🔒 Está tampada?: " + this.tampada);
}
```

<br>

### Método Rabiscar, onde ele faz uma verificação se o objeto Caneta está tampado ou não:
Exemplo:
```java
void rabiscar() {
    if (this.tampada) {
        System.out.println("⚠️ Erro!!!!! Estou tampada.");
    } else {
        System.out.println("✍️ Estou rabiscando...");
    }
}
```

<br>

### Métodos **tampar** e **destampar**, onde você define se a caneta está tampada ou não:
Exemplo:
```java
void tampar() {
    this.tampada = true;
}

void destampar() {
    this.tampada = false;
}
```

### 🔗 Link para a atividade formulada: [Atividade 1]([https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html](https://github.com/GuiLhermeoliveiraf/POO_CURSO_EM_VIDEO/tree/main/Atividade/atividade1))

<br>

Agora seu código está mais amigável e com alguns detalhes adicionais! 😄

