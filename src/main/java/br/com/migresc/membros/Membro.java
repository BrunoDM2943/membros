package br.com.migresc.membros;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Classe Membro
 * @author bruno
 *
 */
public final class Membro {

    @Id
    private int id;

    /**
     * Pessoa
     */
    private Pessoa pessoa;

    /**
     * Religiao quando nasceu
     */
    private String religiaoQuandoNasceu;

    /**
     * Data de aceitação de Jesus
     */
    private LocalDate dtAceitacaoJesus;

    /**
     * Batizado
     */
    private boolean batizado;

    /**
     * Data do batismo
     */
    private LocalDate dtBatismo;

    /**
     * Local do batismo
     */
    private String localBatismo;

    /**
     * Idade que conheceu Jesus
     */
    private int idadeConheceuJesus;

    /**
     * Caso batismo tenha sido na igreja católica
     */
    private boolean batismoCatolico;

    /**
     * Verifica se o membro veio de outra igreja
     */
    private boolean veioDeOutraIgreja;

    /**
     * Igreja de origem do antigo membro
     */
    private String igrejaOrigem;

    /**
     * Cargos exercidos na igreja de origem
     */
    private String cargosExercidosIgrejaOrigem;

    /**
     * Dados da frequencia
     */
    private FrequenciaInfo frequenciaInfo;

    /**
     * Dados do dizimo
     */
    private DizimoInfo dizimoInfo;

    /**
     * Lista de funcoes exercidas
     */
    private Set<String> listaFuncoesExercidas = new HashSet<>();

    /**
     * Lista de funçóes desejadas
     */
    private Set<String> listaFuncoesDesejadas = new HashSet<>();

    /**
     * Sugestoes
     */
    private String sugestoes;

    /**
     * @return pessoa
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * Atribui o campo pessoa
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    /**
     * @return religiaoQuandoNasceu
     */
    public String getReligiaoQuandoNasceu() {
        return religiaoQuandoNasceu;
    }

    /**
     * Atribui o campo religiaoQuandoNasceu
     */
    public void setReligiaoQuandoNasceu(String religiaoQuandoNasceu) {
        this.religiaoQuandoNasceu = religiaoQuandoNasceu;
    }

    /**
     * @return dtAceitacaoJesus
     */
    public LocalDate getDtAceitacaoJesus() {
        return dtAceitacaoJesus;
    }

    /**
     * Atribui o campo dtAceitacaoJesus
     */
    public void setDtAceitacaoJesus(LocalDate dtAceitacaoJesus) {
        this.dtAceitacaoJesus = dtAceitacaoJesus;
    }

    /**
     * @return batizado
     */
    public boolean isBatizado() {
        return batizado;
    }

    /**
     * Atribui o campo batizado
     */
    public void setBatizado(boolean batizado) {
        this.batizado = batizado;
    }

    /**
     * @return dtBatismo
     */
    public LocalDate getDtBatismo() {
        return dtBatismo;
    }

    /**
     * Atribui o campo dtBatismo
     */
    public void setDtBatismo(LocalDate dtBatismo) {
        this.dtBatismo = dtBatismo;
    }

    /**
     * @return localBatismo
     */
    public String getLocalBatismo() {
        return localBatismo;
    }

    /**
     * Atribui o campo localBatismo
     */
    public void setLocalBatismo(String localBatismo) {
        this.localBatismo = localBatismo;
    }

    /**
     * @return idadeConheceuJesus
     */
    public int getIdadeConheceuJesus() {
        return idadeConheceuJesus;
    }

    /**
     * Atribui o campo idadeConheceuJesus
     */
    public void setIdadeConheceuJesus(int idadeConheceuJesus) {
        this.idadeConheceuJesus = idadeConheceuJesus;
    }

    /**
     * @return batismoCatolico
     */
    public boolean isBatismoCatolico() {
        return batismoCatolico;
    }

    /**
     * Atribui o campo batismoCatolico
     */
    public void setBatismoCatolico(boolean batismoCatolico) {
        this.batismoCatolico = batismoCatolico;
    }

    /**
     * @return veioDeOutraIgreja
     */
    public boolean isVeioDeOutraIgreja() {
        return veioDeOutraIgreja;
    }

    /**
     * Atribui o campo veioDeOutraIgreja
     */
    public void setVeioDeOutraIgreja(boolean veioDeOutraIgreja) {
        this.veioDeOutraIgreja = veioDeOutraIgreja;
    }

    /**
     * @return igrejaOrigem
     */
    public String getIgrejaOrigem() {
        return igrejaOrigem;
    }

    /**
     * Atribui o campo igrejaOrigem
     */
    public void setIgrejaOrigem(String igrejaOrigem) {
        this.igrejaOrigem = igrejaOrigem;
    }

    /**
     * @return cargosExercidosIgrejaOrigem
     */
    public String getCargosExercidosIgrejaOrigem() {
        return cargosExercidosIgrejaOrigem;
    }

    /**
     * Atribui o campo cargosExercidosIgrejaOrigem
     */
    public void setCargosExercidosIgrejaOrigem(String cargosExercidosIgrejaOrigem) {
        this.cargosExercidosIgrejaOrigem = cargosExercidosIgrejaOrigem;
    }

    /**
     * @return frequenciaInfo
     */
    public FrequenciaInfo getFrequenciaInfo() {
        return frequenciaInfo;
    }

    /**
     * Atribui o campo frequenciaInfo
     */
    public void setFrequenciaInfo(FrequenciaInfo frequenciaInfo) {
        this.frequenciaInfo = frequenciaInfo;
    }

    /**
     * @return dizimoInfo
     */
    public DizimoInfo getDizimoInfo() {
        return dizimoInfo;
    }

    /**
     * Atribui o campo dizimoInfo
     */
    public void setDizimoInfo(DizimoInfo dizimoInfo) {
        this.dizimoInfo = dizimoInfo;
    }

    /**
     * @return listaFuncoesExercidas
     */
    public Set<String> getListaFuncoesExercidas() {
        return listaFuncoesExercidas;
    }

    /**
     * Atribui o campo listaFuncoesExercidas
     */
    public void setListaFuncoesExercidas(Set<String> listaFuncoesExercidas) {
        this.listaFuncoesExercidas = listaFuncoesExercidas;
    }

    /**
     * @return listaFuncoesDesejadas
     */
    public Set<String> getListaFuncoesDesejadas() {
        return listaFuncoesDesejadas;
    }

    /**
     * Atribui o campo listaFuncoesDesejadas
     */
    public void setListaFuncoesDesejadas(Set<String> listaFuncoesDesejadas) {
        this.listaFuncoesDesejadas = listaFuncoesDesejadas;
    }

    /**
     * @return sugestoes
     */
    public String getSugestoes() {
        return sugestoes;
    }

    /**
     * Atribui o campo sugestoes
     */
    public void setSugestoes(String sugestoes) {
        this.sugestoes = sugestoes;
    }

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Atribui o campo id
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Membro{");
        sb.append("id=").append(id);
        sb.append(", pessoa=").append(pessoa);
        sb.append(", religiaoQuandoNasceu='").append(religiaoQuandoNasceu).append('\'');
        sb.append(", dtAceitacaoJesus=").append(dtAceitacaoJesus);
        sb.append(", batizado=").append(batizado);
        sb.append(", dtBatismo=").append(dtBatismo);
        sb.append(", localBatismo='").append(localBatismo).append('\'');
        sb.append(", idadeConheceuJesus=").append(idadeConheceuJesus);
        sb.append(", batismoCatolico=").append(batismoCatolico);
        sb.append(", veioDeOutraIgreja=").append(veioDeOutraIgreja);
        sb.append(", igrejaOrigem='").append(igrejaOrigem).append('\'');
        sb.append(", cargosExercidosIgrejaOrigem='").append(cargosExercidosIgrejaOrigem).append('\'');
        sb.append(", frequenciaInfo=").append(frequenciaInfo);
        sb.append(", dizimoInfo=").append(dizimoInfo);
        sb.append(", listaFuncoesExercidas=").append(listaFuncoesExercidas);
        sb.append(", listaFuncoesDesejadas=").append(listaFuncoesDesejadas);
        sb.append(", sugestoes='").append(sugestoes).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
