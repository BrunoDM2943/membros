package br.com.migresc.membros;

import java.time.LocalDate;
import java.util.Set;

/**
 * Created by bruno on 20/01/17.
 */
public class Pessoa {

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






}
