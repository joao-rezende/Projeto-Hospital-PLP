/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visoes;

import controladores.Hospital;
import java.util.Calendar;
import modelos.Especializacao;
import modelos.Medico;
import modelos.Paciente;

/**
 *
 * @author desenvolvedor2
 */
public class Secretaria extends javax.swing.JFrame {

    private final Hospital controller;

    /**
     * Creates new form Secretaria
     */
    public Secretaria() {
        controller = new Hospital();
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JButton();
        btn_add_paciente1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital PLP - Secretaria");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone-secretaria.png"))); // NOI18N
        jLabel1.setText("Secretaria");

        btnConsulta.setBackground(new java.awt.Color(51, 122, 183));
        btnConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consultas.png"))); // NOI18N
        btnConsulta.setText("Consultas");
        btnConsulta.setToolTipText("Adicionar um novo paciente");
        btnConsulta.setBorder(null);
        btnConsulta.setMargin(new java.awt.Insets(14, 14, 14, 14));
        btnConsulta.setMinimumSize(new java.awt.Dimension(103, 17));
        btnConsulta.setPreferredSize(new java.awt.Dimension(130, 35));
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btn_add_paciente1.setBackground(new java.awt.Color(51, 122, 183));
        btn_add_paciente1.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_paciente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/paciente.png"))); // NOI18N
        btn_add_paciente1.setText("Pacientes");
        btn_add_paciente1.setToolTipText("Adicionar um novo paciente");
        btn_add_paciente1.setBorder(null);
        btn_add_paciente1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_add_paciente1.setMargin(new java.awt.Insets(14, 14, 14, 14));
        btn_add_paciente1.setMinimumSize(new java.awt.Dimension(103, 17));
        btn_add_paciente1.setPreferredSize(new java.awt.Dimension(130, 35));
        btn_add_paciente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_paciente1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add_paciente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(btn_add_paciente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        // TODO add your handling code here:
        this.controller.listarConsultas();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btn_add_paciente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_paciente1ActionPerformed
        // TODO add your handling code here:
        FormCadPaciente formCadPaciente = new FormCadPaciente();
        formCadPaciente.setLocationRelativeTo(null);
        formCadPaciente.setVisible(true);

        Medico m = new Medico(10, Especializacao.ORTOPEDISTA, "02183679611", "Dr. Miguel", Calendar.getInstance(), 0, 0, null);
        new Hospital().inserirMedico(m);
        m = new Medico(10, Especializacao.ORTOPEDISTA, "02183679611", "Dr. João", Calendar.getInstance(), 0, 0, null);
        new Hospital().inserirMedico(m);

        Paciente p = new Paciente(10, "02183679611", "Joao Vitor", Calendar.getInstance(), 0, 0, null);
        new Hospital().inserirPaciente(p);
        p = new Paciente(10, "02183679611", "Reinaldo", Calendar.getInstance(), 0, 0, null);
        new Hospital().inserirPaciente(p);
    }//GEN-LAST:event_btn_add_paciente1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Secretaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btn_add_paciente1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
