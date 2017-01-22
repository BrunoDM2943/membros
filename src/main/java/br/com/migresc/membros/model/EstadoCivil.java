package br.com.migresc.membros.model;

/**
 * Created by bruno on 20/01/17.
 */
public enum EstadoCivil {

    C("Casado/a"),
    S("Solteiro/a"),
    V("Viúvo/a"),
    D("Divorsiado/a");

    /**
     * Descricao do estado civil
     */
    private String descricao;

    /**
     * Construtor
     * @param descricao
     */
    EstadoCivil(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return descricao do estado civil
     */
    @Override
    public String toString() {
        return descricao;
    }
}
