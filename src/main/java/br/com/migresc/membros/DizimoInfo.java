package br.com.migresc.membros;

/**
 * Classe criada para manter as informações sobre o dizimo
 *
 * Created by bruno on 21/01/17.
 */
public class DizimoInfo {

    /**
     * Conhecimento da doutrina do Dizimo
     */
    private boolean conheceDoutrina;

    /**
     * Concorda com a doutrina do Dizimo
     */
    private boolean concordaDoutrina;

    /**
     * É dizimista
     */
    private boolean dizimista;

    /**
     * @return conheceDoutrina
     */
    public boolean isConheceDoutrina() {
        return conheceDoutrina;
    }

    /**
     * Atribui o campo conheceDoutrina
     */
    public void setConheceDoutrina(boolean conheceDoutrina) {
        this.conheceDoutrina = conheceDoutrina;
    }

    /**
     * @return concordaDoutrina
     */
    public boolean isConcordaDoutrina() {
        return concordaDoutrina;
    }

    /**
     * Atribui o campo concordaDoutrina
     */
    public void setConcordaDoutrina(boolean concordaDoutrina) {
        this.concordaDoutrina = concordaDoutrina;
    }

    /**
     * @return dizimista
     */
    public boolean isDizimista() {
        return dizimista;
    }

    /**
     * Atribui o campo dizimista
     */
    public void setDizimista(boolean dizimista) {
        this.dizimista = dizimista;
    }
}
