package br.com.migresc.membros.model;

/**
 * Classe para armazendar as informações da frequencia
 * Created by bruno on 21/01/17.
 */
public class FrequenciaInfo {

    /**
     * Frequenta culto de oração
     */
    private boolean frequentaCultoOracao;

    /**
     * Frequenta culto de Sábado
     */
    private boolean frequentaCultoSabado;

    /**
     * Frequenta EBD
     */
    private boolean frequentaCultoEBD;

    /**
     * Frequenta culto de adoração
     */
    private boolean frequentaCultoDomingo;

    /**
     * @return frequentaCultoOracao
     */
    public boolean isFrequentaCultoOracao() {
        return frequentaCultoOracao;
    }

    /**
     * Atribui o campo frequentaCultoOracao
     */
    public void setFrequentaCultoOracao(boolean frequentaCultoOracao) {
        this.frequentaCultoOracao = frequentaCultoOracao;
    }

    /**
     * @return frequentaCultoSabado
     */
    public boolean isFrequentaCultoSabado() {
        return frequentaCultoSabado;
    }

    /**
     * Atribui o campo frequentaCultoSabado
     */
    public void setFrequentaCultoSabado(boolean frequentaCultoSabado) {
        this.frequentaCultoSabado = frequentaCultoSabado;
    }

    /**
     * @return frequentaCultoEBD
     */
    public boolean isFrequentaCultoEBD() {
        return frequentaCultoEBD;
    }

    /**
     * Atribui o campo frequentaCultoEBD
     */
    public void setFrequentaCultoEBD(boolean frequentaCultoEBD) {
        this.frequentaCultoEBD = frequentaCultoEBD;
    }

    /**
     * @return frequentaCultoDomingo
     */
    public boolean isFrequentaCultoDomingo() {
        return frequentaCultoDomingo;
    }

    /**
     * Atribui o campo frequentaCultoDomingo
     */
    public void setFrequentaCultoDomingo(boolean frequentaCultoDomingo) {
        this.frequentaCultoDomingo = frequentaCultoDomingo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FrequenciaInfo{");
        sb.append("frequentaCultoOracao=").append(frequentaCultoOracao);
        sb.append(", frequentaCultoSabado=").append(frequentaCultoSabado);
        sb.append(", frequentaCultoEBD=").append(frequentaCultoEBD);
        sb.append(", frequentaCultoDomingo=").append(frequentaCultoDomingo);
        sb.append('}');
        return sb.toString();
    }
}
