package controladores;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.Consulta;
import modelos.Medico;
import modelos.Paciente;

/**
 *
 * @author Antonio, João Vitor e Liliana
 */
public class HospitalController implements Serializable {

    private static List<Medico> medicos;
    private static List<Paciente> pacientes;
    private static List<Consulta> consultas;

    public HospitalController() {
        medicos = new ArrayList<>();
        pacientes = new ArrayList<>();
        consultas = new ArrayList<>();
    }

    public HospitalController(List<Paciente> pacientes, List<Medico> medicos, List<Consulta> consultas) {
        HospitalController.pacientes = pacientes;
        HospitalController.medicos = medicos;
        HospitalController.consultas = consultas;

    }

    public void iniciar() {
        visoes.Hospital secretaria = new visoes.Hospital();
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
}
