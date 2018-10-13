/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visoes;

import controladores.HospitalController;
import java.text.SimpleDateFormat;
import modelos.Consulta;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelos.Especializacao;
import modelos.Medico;
import modelos.Paciente;

/**
 *
 * @author desenvolvedor2
 */
public class Consultas extends javax.swing.JFrame {

    private final HospitalController controlador;

    /**
     * Creates new form Consultas
     *
     * @param controlador
     */
    public Consultas(HospitalController controlador) {
        initComponents();
        this.controlador = controlador;
        preencherTabela();
    }

    Consultas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public final void preencherTabela() {
        List<Consulta> consultas = controlador.getConsultas();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Número");
        modelo.addColumn("Médico");
        modelo.addColumn("Paciente");
        modelo.addColumn("Data");
        modelo.addColumn("Hora");
        modelo.addColumn("Sintomas");

        int qtdCol = modelo.getColumnCount();

        if (consultas == null || consultas.isEmpty()) {
            modelo.addRow(new String[]{
                "-",
                "-",
                "-",
                "-",
                "-"
            });
        } else {
            //Formato da data
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            //Formato da hora
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
            for (Consulta consulta : consultas) {
                Date dataConsulta = consulta.getDataConsulta().getTime();
                Date horaConsulta = consulta.getHoraConsulta().getTime();
                Medico m = controlador.buscaMedico(consulta.getIdMedico());
                Paciente p = controlador.buscaPaciente(consulta.getIdPaciente());
                modelo.addRow(new String[]{
                    String.valueOf(consulta.getIdConsulta()),
                    m.getNome(),
                    p.getNome(),
                    formatoData.format(dataConsulta),
                    formatoHora.format(horaConsulta),
                    consulta.getSintomas()
                });
            }
        }

        tbConsultas.setModel(modelo);

        tbConsultas.getColumnModel().getColumn(0).setPreferredWidth(60);
        tbConsultas.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbConsultas.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbConsultas.getColumnModel().getColumn(3).setPreferredWidth(90);
        tbConsultas.getColumnModel().getColumn(4).setPreferredWidth(70);
        tbConsultas.getColumnModel().getColumn(5).setPreferredWidth(180);

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
        btnNovaConsulta = new javax.swing.JButton();
        btnApagaConsulta = new javax.swing.JButton();

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
        jLabel2.setText("Consultas");

        jScrollPane2.setViewportView(tbConsultas);

        btnNovaConsulta.setBackground(new java.awt.Color(92, 184, 92));
        btnNovaConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnNovaConsulta.setText("Nova consulta");
        btnNovaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaConsultaActionPerformed(evt);
            }
        });

        btnApagaConsulta.setBackground(new java.awt.Color(217, 83, 79));
        btnApagaConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnApagaConsulta.setText("Apagar consulta");
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
                        .addComponent(btnNovaConsulta)))
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
                    .addComponent(btnNovaConsulta)
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

    private void btnNovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaConsultaActionPerformed
        // TODO add your handling code here:
        FormCadMedicos formCadConsulta = new FormCadMedicos(controlador);
        formCadConsulta.setResizable(false);
        formCadConsulta.setLocationRelativeTo(null);
        formCadConsulta.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnNovaConsultaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosed

    private void btnApagaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagaConsultaActionPerformed
        // TODO add your handling code here:
        FormExclusaoMedicos formExclusaoConsulta = new FormExclusaoMedicos(controlador);
        formExclusaoConsulta.setResizable(false);
        formExclusaoConsulta.setLocationRelativeTo(null);
        formExclusaoConsulta.setVisible(true);

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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnNovaConsulta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbConsultas;
    // End of variables declaration//GEN-END:variables
}
