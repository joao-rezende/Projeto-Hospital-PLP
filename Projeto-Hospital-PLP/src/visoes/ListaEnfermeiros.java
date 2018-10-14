/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visoes;

import controladores.HospitalController;
import java.awt.Image;
import java.awt.Toolkit;
import java.math.BigDecimal;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import modelos.Consulta;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelos.Enfermeiro;
import modelos.Especializacao;
import modelos.Medico;
import modelos.Paciente;

/**
 *
 * @author desenvolvedor2
 */
public class ListaEnfermeiros extends javax.swing.JFrame {

    private final HospitalController controlador;

    /**
     * Creates new form Consultas
     *
     * @param controlador
     */
    public ListaEnfermeiros(HospitalController controlador) {
        initComponents();
        this.controlador = controlador;
        preencherTabela();
        URL url = this.getClass().getResource("../imagens/hospital.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
    }

    ListaEnfermeiros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public final void preencherTabela() {
        List<Enfermeiro> enfermeiros = controlador.getEnfermeiros();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Número");
        modelo.addColumn("COREN");
        modelo.addColumn("CPF");
        modelo.addColumn("Nome");
        modelo.addColumn("Salário");

        int qtdCol = modelo.getColumnCount();

        if (enfermeiros == null || enfermeiros.isEmpty()) {
            modelo.addRow(new String[]{
                "-",
                "-",
                "-",
                "-",
                "-"
            });
        } else {
            for (Enfermeiro enfermeiro : enfermeiros) {
                BigDecimal salarioFormatado = new BigDecimal(enfermeiro.getSalario());
                modelo.addRow(new String[]{
                    String.valueOf(enfermeiro.getIdEnfermeiro()),
                    String.valueOf(enfermeiro.getCoren()),
                    String.valueOf(enfermeiro.getCpf()),
                    enfermeiro.getNome(),
                    "R$ " + salarioFormatado.setScale(2, BigDecimal.ROUND_HALF_UP)
                });
            }
        }

        tbConsultas.setModel(modelo);

        tbConsultas.getColumnModel().getColumn(0).setPreferredWidth(60);
        tbConsultas.getColumnModel().getColumn(1).setPreferredWidth(140);
        tbConsultas.getColumnModel().getColumn(2).setPreferredWidth(110);
        tbConsultas.getColumnModel().getColumn(3).setPreferredWidth(270);
        tbConsultas.getColumnModel().getColumn(4).setPreferredWidth(120);

        tbConsultas.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbConsultas = new javax.swing.JTable();
        btnNovoEnfermeiro = new javax.swing.JButton();
        btnApagaConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hospital PLP - Enfermeiros");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enfermeiros");

        jScrollPane2.setViewportView(tbConsultas);

        btnNovoEnfermeiro.setBackground(new java.awt.Color(92, 184, 92));
        btnNovoEnfermeiro.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoEnfermeiro.setText("Novo enfermeiro");
        btnNovoEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoEnfermeiroActionPerformed(evt);
            }
        });

        btnApagaConsulta.setBackground(new java.awt.Color(217, 83, 79));
        btnApagaConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnApagaConsulta.setText("Apagar enfermeiro");
        btnApagaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagaConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnApagaConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovoEnfermeiro)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoEnfermeiro)
                    .addComponent(btnApagaConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoEnfermeiroActionPerformed
        // TODO add your handling code here:
        FormCadEnfermeiro formCadEnfermeiro = new FormCadEnfermeiro(controlador);
        formCadEnfermeiro.setResizable(false);
        formCadEnfermeiro.setLocationRelativeTo(null);
        formCadEnfermeiro.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnNovoEnfermeiroActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosed

    private void btnApagaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagaConsultaActionPerformed
        // TODO add your handling code here:
        FormExclusaoEnfermeiro formExclusaoEnfermeiro = new FormExclusaoEnfermeiro(controlador);
        formExclusaoEnfermeiro.setResizable(false);
        formExclusaoEnfermeiro.setLocationRelativeTo(null);
        formExclusaoEnfermeiro.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnApagaConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(ListaEnfermeiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaEnfermeiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaEnfermeiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaEnfermeiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagaConsulta;
    private javax.swing.JButton btnNovoEnfermeiro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbConsultas;
    // End of variables declaration//GEN-END:variables
}
