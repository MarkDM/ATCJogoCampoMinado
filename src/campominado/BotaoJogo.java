/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campominado;

import java.awt.Button;
import javax.swing.JButton;

/**
 *
 * @author marcu
 */
public class BotaoJogo extends JButton {

    private String tipoBotao;
    private int nivelBotao;

    public String getTipoBotao() {
        return tipoBotao;
    }

    public void setTipoBotao(String tipoBotao) {
        this.tipoBotao = tipoBotao;
    }

    public int getNivelBotao() {
        return nivelBotao;
    }

    public void setNivelBotao(int nivelBotao) {
        this.nivelBotao = nivelBotao;
    }

    public void liberar() {
        this.setEnabled(true);
    }

    public void bloquear() {
        this.setEnabled(false);
    }

}
