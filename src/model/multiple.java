package model;

import java.util.Arrays;
import java.util.List;

public class multiple extends item {
    private List<String> opciones;
    
    public multiple(String tipo, String pregunta, String correcta, String[] opciones) {
        super("multiple", pregunta, correcta);
        this.opciones = Arrays.asList(opciones);
    }

    public List<String> getOpciones() {
        return opciones;
    }

    public boolean esCorrecta(String respuesta) {
        return respuesta.equalsIgnoreCase(correcta);
    }

}
