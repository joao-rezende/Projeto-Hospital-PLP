package controladores;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JFrame;
import modelos.Consulta;
import modelos.Especializacao;
import modelos.Medico;
import modelos.Paciente;
import visoes.Consultas;
import visoes.FormCadPaciente;
import visoes.Secretaria;

/**
 *
 * @author Antonio, João Vitor e Liliana
 */
public class Hospital {

    private static final List<Consulta> consultas = new ArrayList<>();
    private static final List<Medico> medicos = new ArrayList<>();
    private static final List<Paciente> pacientes = new ArrayList<>();

    public void inserir(Consulta consulta) {
        consultas.add(consulta);
    }

    public List getConsultas() {
        return consultas;
    }

    public void listarConsultas() {
        Consultas c = new Consultas();
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }

    public void inserir(Medico medico) {
        medicos.add(medico);
    }

    public List getMedicos() {
        return medicos;
    }

    public Medico buscaMedico(int idMedico) {
        for (Medico medico : medicos) {
            if (medico.getIdMedico() == idMedico) {
                return medico;
            }
        }
        return null;
    }

    public void inserir(Paciente paciente) {
        pacientes.add(paciente);
    }

    public List getPacientes() {
        return pacientes;
    }

    public Paciente buscaPaciente(int idPaciente) {
        for (Paciente paciente : pacientes) {
            if (paciente.getIdPaciente() == idPaciente) {
                return paciente;
            }
        }
        return null;
    }

    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(FormCadPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Secretaria secretaria = new Secretaria();
        secretaria.setLocationRelativeTo(null);
        secretaria.setVisible(true);
    }
}
