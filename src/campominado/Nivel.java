/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campominado;

import java.util.List;

/**
 *
 * @author marcu
 */
public class Nivel {

    private List<BotaoJogo> botoes;
    private int numeroNivel;

    public List<BotaoJogo> getBotoes() {
        return botoes;
    }

    public void setBotoes(List<BotaoJogo> botoes) {
        this.botoes = botoes;
    }

    public int getNumeroNivel() {
        return numeroNivel;
    }

    public void setNumeroNivel(int numeroNivel) {
        this.numeroNivel = numeroNivel;
    }

}
