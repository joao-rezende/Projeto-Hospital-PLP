package controladores;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.Consulta;
import modelos.Endereco;
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

    private static List<Medico> medicos;
    private static List<Paciente> pacientes;
    private static List<Consulta> consultas;

    public Hospital() {
    }

    public Hospital(List<Paciente> pacientes, List<Medico> medicos, List<Consulta> consultas) {
        Hospital.pacientes = pacientes;
        Hospital.medicos = medicos;
        Hospital.consultas = consultas;

    }

    public void iniciar() {
        Secretaria secretaria = new Secretaria();
        secretaria.setLocationRelativeTo(null);
        secretaria.setVisible(true);
    }

    public void salvar(String nomeArq) {
        FileWriter f;
        try {
            f = new FileWriter(nomeArq);
            PrintWriter gravaArq = new PrintWriter(f);

            gravaArq.printf("Teste");

            gravaArq.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo");
            Logger.getLogger(Medico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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

        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medicos = new ArrayList<>();
        List<Consulta> consultas = new ArrayList<>();

        Calendar data;
        Calendar hora;
        Endereco e;
        Paciente p;
        Medico m;
        Consulta c;

        e = new Endereco(37200000, "MG", "Lavras", "Rua 1", 150, "", "Bairro A");
        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 15);
        data.set(Calendar.MONTH, Calendar.JANUARY);
        data.set(Calendar.YEAR, 1990);
        p = new Paciente(10001, "505.397.636-83", "Maria Silva", data, "(35) 3333-3333", "(35) 98761-9999", e);

        pacientes.add(p);

        e = new Endereco(37200000, "MG", "Lavras", "Rua 32", 354, "Apt 102", "Bairro C");
        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 8);
        data.set(Calendar.MONTH, Calendar.JUNE);
        data.set(Calendar.YEAR, 1975);
        p = new Paciente(10002, "186.638.736-70", "Ana Costa", data, "(35) 3441-3333", "(35) 95555-3030", e);

        pacientes.add(p);

        e = new Endereco(37200000, "MG", "Lavras", "Rua 50", 1414, "", "Bairro E");
        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 7);
        data.set(Calendar.MONTH, Calendar.MARCH);
        data.set(Calendar.YEAR, 1977);
        p = new Paciente(10003, "079.854.079-60", "Thales Enzo da Cruz", data, "(35) 3333-3333", "(35) 98761-9999", e);

        pacientes.add(p);

        e = new Endereco(37200000, "MG", "Lavras", "Rua 108", 227, "", "Bairro J");
        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 8);
        data.set(Calendar.MONTH, Calendar.JANUARY);
        data.set(Calendar.YEAR, 1996);
        p = new Paciente(10014, "316.417.383-08", "Julia Marina Gonçalves", data, "(82) 3752-9825", "(82) 98151-4037", e);

        pacientes.add(p);

        e = new Endereco(37200000, "MG", "Lavras", "Rua 34", 180, "", "Bairro C");
        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 22);
        data.set(Calendar.MONTH, Calendar.DECEMBER);
        data.set(Calendar.YEAR, 1993);
        p = new Paciente(10101, "640.555.394-95", "Evelyn Patrícia Drumond", data, "(35) 2963-5864", "(35) 99614-9165", e);

        pacientes.add(p);

        e = new Endereco(37200000, "MG", "Lavras", "Rua 5", 928, "", "Bairro A");
        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 1);
        data.set(Calendar.MONTH, Calendar.AUGUST);
        data.set(Calendar.YEAR, 1975);
        m = new Medico(57366, Especializacao.CARDIOLOGISTA, "002.352.066-36", "Dr. José Brasil", data, "(35) 3333-0011", "(35) 91111-9999", e);

        medicos.add(m);

        e = new Endereco(37200000, "MG", "Lavras", "Rua 159", 439, "", "Bairro H");
        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 24);
        data.set(Calendar.MONTH, Calendar.FEBRUARY);
        data.set(Calendar.YEAR, 1986);
        m = new Medico(1837, Especializacao.CLINICOGERAL, "093.934.923-01", "Dra. Isabelle Monteiro", data, "(35) 3920-0920", "(35) 99929-8500", e);

        medicos.add(m);

        e = new Endereco(37200000, "MG", "Lavras", "Rua 36", 718, "", "Bairro C");
        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 13);
        data.set(Calendar.MONTH, Calendar.AUGUST);
        data.set(Calendar.YEAR, 1980);
        m = new Medico(16654, Especializacao.DERMATOLOGISTA, "109.848.552-11", "Dr. Julio Cauê Lima", data, "(95) 3622-1304", "(95) 99503-6179", e);

        medicos.add(m);

        e = new Endereco(37200000, "MG", "Lavras", "Rua 199", 439, "", "Bairro N");
        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 21);
        data.set(Calendar.MONTH, Calendar.APRIL);
        data.set(Calendar.YEAR, 1971);
        m = new Medico(1975, Especializacao.GINECOLOGISTA, "503.967.866-50", "Dra. Marcela Bianca Mota", data, "(35) 2772-2874", "(35) 98822-9973", e);

        medicos.add(m);

        e = new Endereco(37200000, "MG", "Lavras", "Rua 19", 450, "Sala 4", "Bairro B");
        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 8);
        data.set(Calendar.MONTH, Calendar.MAY);
        data.set(Calendar.YEAR, 1961);
        m = new Medico(36239, Especializacao.PEDIATRA, "733.358.686-33", "Dr. Francisco Julio Novaes", data, "(35) 2657-9681", "(35) 98128-4898", e);

        medicos.add(m);

        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 10);
        data.set(Calendar.MONTH, Calendar.OCTOBER);
        data.set(Calendar.YEAR, 2018);

        hora.set(Calendar.HOUR_OF_DAY, 8);
        hora.set(Calendar.MINUTE, 0);
        c = new Consulta(1, 1, 1, data, hora, "Fortes dores no peito", 36.7, "14/10", 69.8);

        consultas.add(c);

        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 4);
        data.set(Calendar.MONTH, Calendar.NOVEMBER);
        data.set(Calendar.YEAR, 2018);

        hora.set(Calendar.HOUR_OF_DAY, 11);
        hora.set(Calendar.MINUTE, 0);
        c = new Consulta(2, 2, 5, data, hora, "Diareia e febre alta", 39.7, "12/8", 66.1);

        consultas.add(c);

        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 10);
        data.set(Calendar.MONTH, Calendar.OCTOBER);
        data.set(Calendar.YEAR, 2018);

        hora.set(Calendar.HOUR_OF_DAY, 8);
        hora.set(Calendar.MINUTE, 0);
        c = new Consulta(3, 3, 2, data, hora, "Fortes dores no peito", 36.7, "14/10", 69.8);

        consultas.add(c);

        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 10);
        data.set(Calendar.MONTH, Calendar.OCTOBER);
        data.set(Calendar.YEAR, 2018);

        hora.set(Calendar.HOUR_OF_DAY, 8);
        hora.set(Calendar.MINUTE, 0);
        c = new Consulta(4, 4, 4, data, hora, "Fortes dores no peito", 36.7, "14/10", 69.8);

        consultas.add(c);

        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 10);
        data.set(Calendar.MONTH, Calendar.OCTOBER);
        data.set(Calendar.YEAR, 2018);

        hora.set(Calendar.HOUR_OF_DAY, 8);
        hora.set(Calendar.MINUTE, 0);
        c = new Consulta(5, 5, 3, data, hora, "Fortes dores no peito", 36.7, "14/10", 69.8);

        consultas.add(c);

        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 10);
        data.set(Calendar.MONTH, Calendar.OCTOBER);
        data.set(Calendar.YEAR, 2018);

        hora.set(Calendar.HOUR_OF_DAY, 8);
        hora.set(Calendar.MINUTE, 0);
        c = new Consulta(6, 1, 5, data, hora, "Fortes dores no peito", 36.7, "14/10", 69.8);

        consultas.add(c);

        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 10);
        data.set(Calendar.MONTH, Calendar.OCTOBER);
        data.set(Calendar.YEAR, 2018);

        hora.set(Calendar.HOUR_OF_DAY, 8);
        hora.set(Calendar.MINUTE, 0);
        c = new Consulta(7, 2, 1, data, hora, "Fortes dores no peito", 36.7, "14/10", 69.8);

        consultas.add(c);

        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 10);
        data.set(Calendar.MONTH, Calendar.OCTOBER);
        data.set(Calendar.YEAR, 2018);

        hora.set(Calendar.HOUR_OF_DAY, 8);
        hora.set(Calendar.MINUTE, 0);
        c = new Consulta(8, 3, 3, data, hora, "Fortes dores no peito", 36.7, "14/10", 69.8);

        consultas.add(c);

        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 10);
        data.set(Calendar.MONTH, Calendar.OCTOBER);
        data.set(Calendar.YEAR, 2018);

        hora.set(Calendar.HOUR_OF_DAY, 8);
        hora.set(Calendar.MINUTE, 0);
        c = new Consulta(9, 4, 2, data, hora, "Fortes dores no peito", 36.7, "14/10", 69.8);

        consultas.add(c);

        data = Calendar.getInstance();
        hora = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, 10);
        data.set(Calendar.MONTH, Calendar.OCTOBER);
        data.set(Calendar.YEAR, 2018);

        hora.set(Calendar.HOUR_OF_DAY, 8);
        hora.set(Calendar.MINUTE, 0);
        c = new Consulta(10, 5, 4, data, hora, "Fortes dores no peito", 36.7, "14/10", 69.8);

        consultas.add(c);

        Hospital hospital = new Hospital(pacientes, medicos, consultas);

        hospital.iniciar();
    }
}
