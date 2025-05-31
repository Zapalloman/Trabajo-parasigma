package model;
import java.util.List;

public abstract class item {

    protected String tipo;
    protected String pregunta;
    protected String correcta;

    public item(String tipo, String pregunta, String correcta) {
        this.tipo = tipo;
        this.pregunta = pregunta;
        this.correcta = correcta;
    }

    public String getTipo() { return tipo; }
    public String getPregunta() { return pregunta; }
    public String getCorrecta() { return correcta; }

    public abstract List<String> getOpciones();
    public abstract boolean esCorrecta(String respuestauser);
}
