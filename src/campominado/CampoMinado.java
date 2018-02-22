/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campominado;

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author marcu
 */
public class CampoMinado extends javax.swing.JFrame {

    private String[] valores = new String[4];
    private List<BotaoJogo> listaBotoes;
    private int nivelAtual;
    private int qtdVidas;
    private boolean ganho = false;

    public CampoMinado() {
        listaBotoes = new ArrayList<>();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneJogo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblQtdVidas = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout paneJogoLayout = new javax.swing.GroupLayout(paneJogo);
        paneJogo.setLayout(paneJogoLayout);
        paneJogoLayout.setHorizontalGroup(
            paneJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paneJogoLayout.setVerticalGroup(
            paneJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        jLabel1.setText("Vidas:");

        lblQtdVidas.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQtdVidas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblQtdVidas))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneJogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                        .addComponent(btnReset)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        setup();
    }//GEN-LAST:event_btnResetActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CampoMinado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CampoMinado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CampoMinado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CampoMinado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                CampoMinado tela = new CampoMinado();
                tela.paneJogo.setLayout(new GridLayout(4, 4));
                tela.setup();
                tela.setVisible(true);
                //new TelaTeste().setVisible(true);
            }
        });
    }

    void setup() {
        qtdVidas = 10000000;
        nivelAtual = 1;
        listaBotoes.clear();
        lblQtdVidas.setText(String.valueOf(qtdVidas));
        paneJogo.removeAll();
        paneJogo.add(gerarNivel(4));
        paneJogo.add(gerarNivel(3));
        paneJogo.add(gerarNivel(2));
        paneJogo.add(gerarNivel(1));

        liberarNivel(nivelAtual);
    }

    public JPanel gerarNivel(int nivelBotao) {

        valores[0] = "BOMBA";
        valores[1] = "SETA";
        valores[2] = "BOMBA";
        valores[3] = "VIDA";

        JPanel painel = new JPanel(new GridLayout());
        painel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Collections.shuffle(Arrays.asList(valores));

        for (int i = 0; i < 4; i++) {

            BotaoJogo btn = new BotaoJogo();
            btn.setTipoBotao(valores[i]);
            btn.setNivelBotao(nivelBotao);
            btn.setSize(20, 10);
            //btn.setLocation(x += 15, y += 15);
            btn.setText("Click NV: " + btn.getNivelBotao());
            btn.setMargin(new Insets(0, 10, 0, 20));
            btn.bloquear();
            listaBotoes.add(btn);
            painel.add(btn);

            btn.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    processarJogada(btn);
                }
            });

        }

        return painel;
    }

    public void bloquearNivel(int nivel) {
        for (BotaoJogo btn : listaBotoes) {
            if (btn.getNivelBotao() == nivel) {
                btn.bloquear();
            }
        }
    }

    public void processarJogada(BotaoJogo btn) {
        btn.bloquear();

        switch (btn.getTipoBotao()) {
            case "BOMBA":
                btn.setText("BOMBA");
                qtdVidas--;
                lblQtdVidas.setText(String.valueOf(qtdVidas));
                if (qtdVidas == 0) {
                    perdeu();
                }

                break;
            case "SETA":

                btn.setText("SETA");

                if (nivelAtual == 4) {
                    ganhou();

                }

                if (!ganho) {
                    bloquearNivel(nivelAtual);
                    nivelAtual++;
                    liberarNivel(nivelAtual);
                } else {
                    this.ganho = false;
                }

                break;
            case "VIDA":
                btn.setText("VIDA");
                qtdVidas++;
                lblQtdVidas.setText(String.valueOf(qtdVidas));
                break;
            default:
                break;
        }
    }

    public void liberarNivel(int nivel) {
        for (BotaoJogo btn : listaBotoes) {
            if (btn.getNivelBotao() == nivel) {
                btn.liberar();
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblQtdVidas;
    private javax.swing.JPanel paneJogo;
    // End of variables declaration//GEN-END:variables

    private void perdeu() {
        JOptionPane.showMessageDialog(null, "Você perdeu");
        this.ganho = false;
        setup();
        return;
    }

    private void ganhou() {
        JOptionPane.showMessageDialog(null, "Você ganhou");
        this.ganho = true;
        setup();
        return;
    }
}
