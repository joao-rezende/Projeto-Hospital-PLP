/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visoes;

import controladores.HospitalController;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelos.Especializacao;
import modelos.Medico;
/**
 *
 * @author desenvolvedor2
 */
public class Medicos extends javax.swing.JFrame {

    private final HospitalController controlador;

    /**
     * Creates new form Consultas
     *
     * @param controlador
     */
    public Medicos(HospitalController controlador) {
        initComponents();
        this.controlador = controlador;
        preencherTabela();
    }

    Medicos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public final void preencherTabela() {
        List<Medicos> medicos = controlador.getConsultas();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("IdMédico");
        modelo.addColumn("CRM");
        modelo.addColumn("Especialização");
        modelo.addColumn("Salário");
        modelo.addColumn("HorasSemanais");
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("DataNasc");
        modelo.addColumn("TelFixo");
        modelo.addColumn("Celular");
        modelo.addColumn("Endereço");
        

        int qtdCol = modelo.getColumnCount();

        if (medicos == null || medicos.isEmpty()) {
            modelo.addRow(new String[]{
                "-",
                "-",
                "-",
                "-",
                "-"
            });
        } 
        tbmedicos.setModel(modelo);

        tbmedicos.getColumnModel().getColumn(0).setPreferredWidth(60);
        tbmedicos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbmedicos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbmedicos.getColumnModel().getColumn(3).setPreferredWidth(90);
        tbmedicos.getColumnModel().getColumn(4).setPreferredWidth(70);
        tbmedicos.getColumnModel().getColumn(5).setPreferredWidth(180);

        tbmedicos.setEnabled(false);
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
        tbmedicos = new javax.swing.JTable();
        btnNovoMédico = new javax.swing.JButton();
        btnApagaMedico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hospital PLP - Consultas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Médicos");

        jScrollPane2.setViewportView(tbmedicos);

        btnNovoMédico.setBackground(new java.awt.Color(92, 184, 92));
        btnNovoMédico.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoMédico.setText("Novo Médico");
        btnNovoMédico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoMédicoActionPerformed(evt);
            }
        });

        btnApagaMedico.setBackground(new java.awt.Color(217, 83, 79));
        btnApagaMedico.setForeground(new java.awt.Color(255, 255, 255));
        btnApagaMedico.setText("Médicos");
        btnApagaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagaMedicoActionPerformed(evt);
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
                        .addComponent(btnApagaMedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovoMédico)))
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
                    .addComponent(btnNovoMédico)
                    .addComponent(btnApagaMedico))
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

    private void btnNovoMédicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoMédicoActionPerformed
        // TODO add your handling code here:
        FormCadMedicos formCadMedicos = new FormCadMedicos(controlador);
        formCadMedicos.setResizable(false);
        formCadMedicos.setLocationRelativeTo(null);
        formCadMedicos.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnNovoMédicoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosed

    private void btnApagaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagaMedicoActionPerformed
        // TODO add your handling code here:
        FormExclusaoMedicos formExclusaoMedicos = new FormExclusaoMedicos(controlador);
        formExclusaoMedicos.setResizable(false);
        formExclusaoMedicos.setLocationRelativeTo(null);
        formExclusaoMedicos.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnApagaMedicoActionPerformed

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
            java.util.logging.Logger.getLogger(Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
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
    private javax.swing.JButton btnApagaMedico;
    private javax.swing.JButton btnNovoMédico;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbmedicos;
    // End of variables declaration//GEN-END:variables
}
