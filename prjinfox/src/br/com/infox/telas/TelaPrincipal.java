/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.telas;

import br.com.infox.dal.ModuloConexao;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Ariane
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Connection conexao = null;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        menCadCli = new javax.swing.JMenuItem();
        menCadOs = new javax.swing.JMenuItem();
        menCadUsu = new javax.swing.JMenuItem();
        menRel = new javax.swing.JMenu();
        MenRelCli = new javax.swing.JMenuItem();
        menRelSer = new javax.swing.JMenuItem();
        menAju = new javax.swing.JMenu();
        menAjuSob = new javax.swing.JMenuItem();
        menOpc = new javax.swing.JMenu();
        menOpcSai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("X - Sistema para controle de OS ");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setPreferredSize(new java.awt.Dimension(640, 480));
        desktop.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/flor.png"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblData.setText("Data");

        menCad.setText("Cadastro");

        menCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menCadCli.setText("Cliente");
        menCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadCliActionPerformed(evt);
            }
        });
        menCad.add(menCadCli);

        menCadOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        menCadOs.setText("OS");
        menCadOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadOsActionPerformed(evt);
            }
        });
        menCad.add(menCadOs);

        menCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menCadUsu.setText("Usuários");
        menCadUsu.setEnabled(false);
        menCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadUsuActionPerformed(evt);
            }
        });
        menCad.add(menCadUsu);

        Menu.add(menCad);

        menRel.setText("Relatório");
        menRel.setEnabled(false);

        MenRelCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        MenRelCli.setText("Clientes");
        MenRelCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenRelCliActionPerformed(evt);
            }
        });
        menRel.add(MenRelCli);

        menRelSer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menRelSer.setText("Serviços");
        menRelSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelSerActionPerformed(evt);
            }
        });
        menRel.add(menRelSer);

        Menu.add(menRel);

        menAju.setText("Ajuda");

        menAjuSob.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        menAjuSob.setText("Sobre");
        menAjuSob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAjuSobActionPerformed(evt);
            }
        });
        menAju.add(menAjuSob);

        Menu.add(menAju);

        menOpc.setText("Opções");

        menOpcSai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menOpcSai.setText("Sair");
        menOpcSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOpcSaiActionPerformed(evt);
            }
        });
        menOpc.add(menOpcSai);

        Menu.add(menOpc);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(lblUsuario))
                        .addContainerGap(208, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblUsuario)
                .addGap(50, 50, 50)
                .addComponent(lblData)
                .addGap(81, 81, 81)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(965, 596));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // as linhas abaixo substituem a label lblData pela data atual
        // do sistema ao iniciar o form
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void menOpcSaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOpcSaiActionPerformed
        // exibe uma caixa de dialago
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menOpcSaiActionPerformed

    private void menAjuSobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAjuSobActionPerformed
        // chamando a tela sobre
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_menAjuSobActionPerformed

    private void menCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadUsuActionPerformed
        // as linhas abaixo irao abrir o form tela usuario dentro do painel desktop
        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        desktop.add(usuario);
    }//GEN-LAST:event_menCadUsuActionPerformed

    private void menCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadCliActionPerformed
        // chamar a tela cliente
        TelaCliente cliente = new TelaCliente();
        cliente.setVisible(true);
        desktop.add(cliente);
    }//GEN-LAST:event_menCadCliActionPerformed

    private void menCadOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadOsActionPerformed
        // chamando a tela os
        TelaOS os = new TelaOS();
        os.setVisible(true);
        desktop.add(os);
    }//GEN-LAST:event_menCadOsActionPerformed

    private void MenRelCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenRelCliActionPerformed
        // gerando um relatorio
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a emissão deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {

            try {
                JasperPrint print = JasperFillManager.fillReport("C:/reports/clientes.jasper", null, conexao);
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_MenRelCliActionPerformed

    private void menRelSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRelSerActionPerformed
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a emissão deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {

            try {
                JasperPrint print = JasperFillManager.fillReport("C:/reports/servicos.jasper", null, conexao);
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_menRelSerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenRelCli;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menAju;
    private javax.swing.JMenuItem menAjuSob;
    private javax.swing.JMenu menCad;
    private javax.swing.JMenuItem menCadCli;
    private javax.swing.JMenuItem menCadOs;
    public static javax.swing.JMenuItem menCadUsu;
    private javax.swing.JMenu menOpc;
    private javax.swing.JMenuItem menOpcSai;
    public static javax.swing.JMenu menRel;
    private javax.swing.JMenuItem menRelSer;
    // End of variables declaration//GEN-END:variables
}
