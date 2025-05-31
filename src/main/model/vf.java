package model;

import java.util.List;

public class vf extends item {
    public vf(String tipo, String pregunta, String correcta) {
        super("vf", pregunta, correcta);
    }

    public List<String> getOpciones() {
        return List.of("Verdadero", "Falso");
    }

    public boolean esCorrecta(String respuestaUser) {
        return respuestaUser.equalsIgnoreCase(correcta);
    }
    
}
