public class Cachorro extends Mamifero {

    public String reagir(String frase) {
        if (frase.equals("Toma Comida") || frase.equals("Ola")) {
            return "Abanar e latir";
        } else {
            return "Rosnar";
        }

    }

    public String reagir(int hora, int min) {
        if (hora < 12) {
            return "Abanar";
        } else if (hora >= 18) {
            return "Ignorar";
        } else {
            return "Abanar e Latir";
        }

    }

    public String reagir(boolean dono) {
        if (dono) {
            return "Abanar";
        } else {
            return "Latir";
        }
    }

    public String reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                return "Abanar";
            } else {
                return "Latir";
            }
        } else {
            if (peso < 10) {
                return "Rosnar";
            } else {
                return "Ignorar";
            }
        }
    }

    @Override
    public String emitirSom() {
        return "Au Au Au";
    }

}
