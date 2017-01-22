package br.com.migresc.membros;

/**
 * Created by bruno on 20/01/17.
 */
public class Escolaridade {

    /**
     * Nivel de escolaridade
     */
    private Nivel nivel;

    /**
     * Grau completo ou incompleto
     */
    private boolean completo;

    /**
     * Curso realizado
     */
    private String curso;

    public Escolaridade(Nivel nivel, boolean completo){
        this.nivel = nivel;
        this.completo = completo;
    }

    /**
     * @return nivel
     */
    public Nivel getNivel() {
        return nivel;
    }

    /**
     * Atribui o campo nivel
     */
    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    /**
     * @return completo
     */
    public boolean isCompleto() {
        return completo;
    }

    /**
     * Atribui o campo completo
     */
    public void setCompleto(boolean completo) {
        this.completo = completo;
    }

    /**
     * @return curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Atribui o campo curso
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Escolaridade{");
        sb.append("nivel=").append(nivel);
        sb.append(", completo=").append(completo);
        sb.append(", curso='").append(curso).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * Nivel de escolaridade
     */
    public enum Nivel {
        FUNDAMENTAL, MEDIO, SUPERIOR, POS
    }
}
