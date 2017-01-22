package br.com.migresc.membros;

/**
 * Created by bruno on 20/01/17.
 */
public class Endereco {

    /**
     * Logradouro
     */
    private String logradouro;

    /**
     * Número
     */
    private int numero;

    /**
     * CEP
     */
    private long cep;

    /**
     * Observação
     */
    private String observacao;

    /**
     * Bairro
     */
    private String bairro;

    /**
     * Cidade
     */
    private String cidade;

    /**
     * UF
     */
    private String uf;

    /**
     * @return logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Atribui o campo logradouro
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Atribui o campo numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return cep
     */
    public long getCep() {
        return cep;
    }

    /**
     * Atribui o campo cep
     */
    public void setCep(long cep) {
        this.cep = cep;
    }

    /**
     * @return observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Atribui o campo observacao
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Atribui o campo bairro
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Atribui o campo cidade
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * Atribui o campo uf
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Endereco{");
        sb.append("logradouro='").append(logradouro).append('\'');
        sb.append(", numero=").append(numero);
        sb.append(", cep=").append(cep);
        sb.append(", observacao='").append(observacao).append('\'');
        sb.append(", bairro='").append(bairro).append('\'');
        sb.append(", cidade='").append(cidade).append('\'');
        sb.append(", uf='").append(uf).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
