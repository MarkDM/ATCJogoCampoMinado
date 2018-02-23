/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campominado;

import java.awt.Button;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author marcu
 */
public class BotaoJogo extends JButton {

    private String tipoBotao;
    private int nivelBotao;
    private Boolean isClicable;

    public Boolean getIsClicable() {
        return isClicable;
    }

    public void setIsClicable(Boolean clicable) {
        this.isClicable = clicable;
    }

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
        //setIsClicable(true);
        //this.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 51), new java.awt.Color(204, 204, 0)));
    }

    public void bloquear() {
        //setIsClicable(false);
        this.setEnabled(false);
        //this.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    }

    public void setImage(String filePath) {

        this.setText("");

        this.setIcon(
                new ImageIcon(((new ImageIcon(
                        getClass().getResource(filePath)
                ).getImage()
                        .getScaledInstance(64, 64,
                                java.awt.Image.SCALE_SMOOTH))))
        );
    }

}
