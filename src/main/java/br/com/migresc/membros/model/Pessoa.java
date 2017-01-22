package br.com.migresc.membros.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Set;

/**
 * Created by bruno on 20/01/17.
 */
public class Pessoa {

    @Id
    private int id;

    /**
     * Nome do membro
     */
    private String nome;

    /**
     * Data de nascimento
     */
    private LocalDate dtNascimento;

    /**
     * Data do casamento
     */
    private LocalDate dtCasamento;

    /**
     * Convivente da pessoa
     */
    private Pessoa convivente;

    /**
     * Endereco
     */
    private Endereco endereco;

    /**
     * Local de nascimento
     */
    private Endereco localNascimento;

    /**
     * Profissao
     */
    private String profissao;

    /**
     * Escolaridade
     */
    private Escolaridade escolaridade;

    /**
     * Pai
     */
    private Pessoa pai;

    /**
     * Mae
     */
    private Pessoa mae;

    /**
     * Lista de Irmaos
     */
    private Set<Pessoa> irmaos;

    /**
     * Lista de Filhos
     */
    private Set<Pessoa> filhos;

    /**
     * Estado civil
     */
    private EstadoCivil estadoCivil;
    /**
     * Sexo
     */
    private Sexo sexo;
    /**
     * CPF
     */
    private String cpf;
    /**
     * RG
     */
    private String rg;

    /**
     * @return sexo
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Atribui o campo sexo
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * @return cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Atribui o campo cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * Atribui o campo rg
     */
    public void setRg(String rg) {
        this.rg = rg;
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

    /**
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Atribui o campo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return dtNascimento
     */
    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    /**
     * Atribui o campo dtNascimento
     */
    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    /**
     * @return dtCasamento
     */
    public LocalDate getDtCasamento() {
        return dtCasamento;
    }

    /**
     * Atribui o campo dtCasamento
     */
    public void setDtCasamento(LocalDate dtCasamento) {
        this.dtCasamento = dtCasamento;
    }

    /**
     * @return convivente
     */
    public Pessoa getConvivente() {
        return convivente;
    }

    /**
     * Atribui o campo convivente
     */
    public void setConvivente(Pessoa convivente) {
        this.convivente = convivente;
    }

    /**
     * @return endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Atribui o campo endereco
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return localNascimento
     */
    public Endereco getLocalNascimento() {
        return localNascimento;
    }

    /**
     * Atribui o campo localNascimento
     */
    public void setLocalNascimento(Endereco localNascimento) {
        this.localNascimento = localNascimento;
    }

    /**
     * @return profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * Atribui o campo profissao
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * @return escolaridade
     */
    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    /**
     * Atribui o campo escolaridade
     */
    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    /**
     * @return pai
     */
    public Pessoa getPai() {
        return pai;
    }

    /**
     * Atribui o campo pai
     */
    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    /**
     * @return mae
     */
    public Pessoa getMae() {
        return mae;
    }

    /**
     * Atribui o campo mae
     */
    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    /**
     * @return irmaos
     */
    public Set<Pessoa> getIrmaos() {
        return irmaos;
    }

    /**
     * Atribui o campo irmaos
     */
    public void setIrmaos(Set<Pessoa> irmaos) {
        this.irmaos = irmaos;
    }

    /**
     * @return filhos
     */
    public Set<Pessoa> getFilhos() {
        return filhos;
    }

    /**
     * Atribui o campo filhos
     */
    public void setFilhos(Set<Pessoa> filhos) {
        this.filhos = filhos;
    }

    /**
     * @return estadoCivil
     */
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Atribui o campo estadoCivil
     */
    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", dtNascimento=").append(dtNascimento);
        sb.append(", dtCasamento=").append(dtCasamento);
        sb.append(", convivente=").append(convivente);
        sb.append(", endereco=").append(endereco);
        sb.append(", localNascimento=").append(localNascimento);
        sb.append(", profissao='").append(profissao).append('\'');
        sb.append(", escolaridade=").append(escolaridade);
        sb.append(", pai=").append(pai);
        sb.append(", mae=").append(mae);
        sb.append(", irmaos=").append(irmaos);
        sb.append(", filhos=").append(filhos);
        sb.append(", estadoCivil=").append(estadoCivil);
        sb.append(", sexo=").append(sexo);
        sb.append(", cpf='").append(cpf).append('\'');
        sb.append(", rg='").append(rg).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
