package br.com.migresc.membros;

import java.time.LocalDate;

/**
 * Classe Membro
 * @author bruno
 *
 */
public final class Membro {

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
    private boolean batizadoCatolico;



}
