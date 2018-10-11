package controladores;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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

    public void salvar(File arq) {
        try {
            arq.delete();
            arq.createNewFile();

            try (ObjectOutputStream objSaida = new ObjectOutputStream(new FileOutputStream(arq))) {
                List<Object> objetos = new ArrayList<>();
                objetos.add(this.pacientes);
                objetos.add(this.medicos);
                objetos.add(this.consultas);

                objSaida.writeObject(objetos);
            }
            ImageIcon icon = new ImageIcon(HospitalController.class.getResource("../imagens/concluido.png"));
            JOptionPane.showMessageDialog(null, new JLabel("Arquivo salvo com sucesso", icon, JLabel.LEFT), "Concluído", JOptionPane.PLAIN_MESSAGE);

        } catch (IOException erro) {
            ImageIcon icon = new ImageIcon(HospitalController.class.getResource("../imagens/erro.png"));
            JOptionPane.showMessageDialog(null, new JLabel("<html><body><p>Erro ao tentar salvar o arquivo</p> <p>Erro: " + erro.getMessage() + "</p></body></html>", icon, JLabel.LEFT), "ERROR", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void importar(File arq) {
        try {
            if (arq.exists()) {
                ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
                List<Object> objetos = (List<Object>) objInput.readObject();
                objInput.close();

                int i = 1;
                List<Consulta> consultas;
                List<Medico> medicos;
                List<Paciente> pacientes;
                for (Object objeto : objetos) {
                    switch (i) {
                        case 1:
                            pacientes = (List<Paciente>) objeto;
                            for (Paciente paciente : pacientes) {
                                inserir(paciente);
                            }
                            break;
                        case 2:
                            medicos = (List<Medico>) objeto;
                            for (Medico medico : medicos) {
                                inserir(medico);
                            }
                            break;
                        case 3:
                            consultas = (List<Consulta>) objeto;
                            for (Consulta consulta : consultas) {
                                inserir(consulta);
                            }
                            break;
                    }

                    i++;
                }
                ImageIcon icon = new ImageIcon(HospitalController.class.getResource("../imagens/concluido.png"));
                JOptionPane.showMessageDialog(null, new JLabel("Arquivo importado com sucesso", icon, JLabel.LEFT), "Concluído", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (IOException | ClassNotFoundException erro) {
            ImageIcon icon = new ImageIcon(HospitalController.class.getResource("../imagens/erro.png"));
            JOptionPane.showMessageDialog(null, new JLabel("<html><body><p>Erro ao tentar importar o arquivo</p> <p>Erro: " + erro.getMessage() + "</p></body></html>", icon, JLabel.LEFT), "ERROR", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public Consulta buscaConsulta(int idConsulta) {
        for (Consulta consulta : consultas) {
            if (consulta.getIdConsulta() == idConsulta) {
                return consulta;
            }
        }
        return null;
    }

    public void inserir(Consulta consulta) {
        consultas.add(consulta);
    }

    public List getConsultas() {
        return consultas;
    }
    
    public void remover(Consulta consulta) {
        consultas.remove(consulta);
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
