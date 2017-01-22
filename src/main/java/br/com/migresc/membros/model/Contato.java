package br.com.migresc.membros.model;

/**
 * Classe contendo as inforamçẽos de contato
 * Created by bruno on 20/01/17.
 */
public class Contato {

    /**
     * Telefone residencial
     */
    private Telefone telefoneResidencial;

    /**
     * Telefone comercial
     */
    private Telefone telefoneComercial;

    /**
     * Celular celular
     */
    private Celular celular;

    /**
     * Celular celular
     */
    private Celular celularAux;

    /**
     * Celular
     */
    private String email;

    /**
     * @return telefoneResidencial
     */
    public Telefone getTelefoneResidencial() {
        return telefoneResidencial;
    }

    /**
     * Atribui o campo telefoneResidencial
     */
    public void setTelefoneResidencial(Telefone telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    /**
     * @return telefoneComercial
     */
    public Telefone getTelefoneComercial() {
        return telefoneComercial;
    }

    /**
     * Atribui o campo telefoneComercial
     */
    public void setTelefoneComercial(Telefone telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    /**
     * @return celular
     */
    public Celular getCelular() {
        return celular;
    }

    /**
     * Atribui o campo celular
     */
    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    /**
     * @return celularAux
     */
    public Celular getCelularAux() {
        return celularAux;
    }

    /**
     * Atribui o campo celularAux
     */
    public void setCelularAux(Celular celularAux) {
        this.celularAux = celularAux;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Atribui o campo email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contato{");
        sb.append("telefoneResidencial=").append(telefoneResidencial);
        sb.append(", telefoneComercial=").append(telefoneComercial);
        sb.append(", celular=").append(celular);
        sb.append(", celularAux=").append(celularAux);
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
