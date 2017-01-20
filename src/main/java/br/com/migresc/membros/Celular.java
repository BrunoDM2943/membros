package br.com.migresc.membros;

/**
 * Classe mapeando um celular
 *
 * Created by bruno on 20/01/17.
 */
public class Celular {

    /**
     * DDD
     */
    private int ddd;

    /**
     * Primeira parte do número
     */
    private int numero1;

    /**
     * Segunda parte do número
     */
    private int numero2;

    private Operadora operadora;


    /**
     * Construtor
     * @param ddd
     * @param numero1
     * @param numero2
     */
    public Celular(int ddd, int numero1, int numero2, Operadora operadora) {
        this.ddd = ddd;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operadora = operadora;
    }



    /**
     * @return ddd
     */
    public int getDdd() {
        return ddd;
    }

    /**
     * @return numero1
     */
    public int getNumero1() {
        return numero1;
    }


    /**
     * @return numero2
     */
    public int getNumero2() {
        return numero2;
    }

}
