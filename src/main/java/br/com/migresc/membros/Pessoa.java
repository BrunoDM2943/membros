package br.com.migresc.membros;

import java.time.LocalDate;

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




}
