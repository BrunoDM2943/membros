package br.com.migresc.membros;

/**
 * Created by bruno on 22/01/17.
 */
public enum Sexo {

    M("Masculino"),
    F("Feminino");

    /**
     * Descricao do sexo
     */
    private String descricao;

    Sexo(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
