/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campominado;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author marcu
 */
public class CampoMinado {

    static String[] valores = new String[4];

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//
//        List<BotaoJogo> btnList = new ArrayList<BotaoJogo>();
//
//        valores[0] = "BOMBA";
//        valores[1] = "SETA";
//        valores[2] = "BOMBA";
//        valores[3] = "INTERROGAÇÃO";
//
//        JFrame tela = new JFrame();
//        //painel.setLocation(10, 5);
//        //painel.setSize(550, 100);
//
//        tela.setLayout(new GridLayout(4, 1));
//        tela.setSize(600, 400);
//
//        tela.add(gerarNivel());
//        tela.add(gerarNivel());
//        tela.add(gerarNivel());
//        tela.add(gerarNivel());
//        tela.setVisible(true);
//
//    }

    public static JPanel gerarNivel() {

        JPanel painel = new JPanel(new GridLayout());
        painel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Random rdn = new Random();

        Collections.shuffle(Arrays.asList(valores));

        for (int i = 0; i < 4; i++) {

            BotaoJogo btn = new BotaoJogo();
            btn.setTipoBotao(valores[i]);
            btn.setSize(20, 10);
            //btn.setLocation(x += 15, y += 15);
            btn.setText("Click");
            btn.setMargin(new Insets(0, 10, 0, 20));

            //tela.getContentPane().add(btn);
            painel.add(btn);

            btn.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, btn.getTipoBotao());
                }
            });

        }

        return painel;
    }

    public void bloquearNivel() {

    }

    public void liberarNivel() {

    }

}
