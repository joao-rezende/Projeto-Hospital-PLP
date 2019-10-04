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
import modelos.Enfermeiro;
import modelos.Especializacao;
import modelos.Funcionario;
import modelos.Medico;
import modelos.Paciente;

/**
 *
 * @author Antonio, João Vitor e Liliana
 */
public class HospitalController implements Serializable {

    private static List<Funcionario> funcionarios;
    private static List<Enfermeiro> enfermeiros;
    private static List<Medico> medicos;
    private static List<Paciente> pacientes;
    private static List<Consulta> consultas;

    public HospitalController() {
        funcionarios = new ArrayList<>();
        enfermeiros = new ArrayList<>();
        medicos = new ArrayList<>();
        pacientes = new ArrayList<>();
        consultas = new ArrayList<>();
    }

    public HospitalController(List<Medico> medicos, List<Funcionario> funcionarios, List<Enfermeiro> enfermeiros, List<Paciente> pacientes, List<Consulta> consultas) {
        HospitalController.funcionarios = funcionarios;
        HospitalController.enfermeiros = enfermeiros;
        HospitalController.medicos = medicos;
        HospitalController.pacientes = pacientes;
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
                objetos.add(this.enfermeiros);
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
                boolean todosInseridos = true;
                ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
                List<Object> objetos = (List<Object>) objInput.readObject();
                objInput.close();

                int i = 1;
                List<Paciente> pacientes;
                List<Medico> medicos;
                List<Enfermeiro> enfermeiros;
                List<Consulta> consultas;
                for (Object objeto : objetos) {
                    switch (i) {
                        case 1:
                            pacientes = (List<Paciente>) objeto;
                            for (Paciente paciente : pacientes) {
                                if (buscaPaciente(paciente.getIdPaciente()) == null) {
                                    inserir(paciente);
                                } else {
                                    todosInseridos = false;
                                }
                            }
                            break;
                        case 2:
                            medicos = (List<Medico>) objeto;
                            for (Medico medico : medicos) {
                                if (buscaMedico(medico.getIdMedico()) == null) {
                                    inserir(medico);
                                } else {
                                    todosInseridos = false;
                                }
                            }
                            break;
                        case 3:
                            enfermeiros = (List<Enfermeiro>) objeto;
                            for (Enfermeiro enfermeiro : enfermeiros) {
                                if (buscaEnfermeiro(enfermeiro.getIdEnfermeiro()) == null) {
                                    inserir(enfermeiro);
                                } else {
                                    todosInseridos = false;
                                }
                            }
                            break;
                        case 4:
                            consultas = (List<Consulta>) objeto;
                            for (Consulta consulta : consultas) {
                                if (buscaConsulta(consulta.getIdConsulta()) == null) {
                                    inserir(consulta);
                                } else {
                                    todosInseridos = false;
                                }
                            }
                            break;
                    }

                    i++;
                }

                if (todosInseridos) {
                    ImageIcon icon = new ImageIcon(HospitalController.class.getResource("../imagens/concluido.png"));
                    JOptionPane.showMessageDialog(null, new JLabel("Arquivo importado com sucesso", icon, JLabel.LEFT), "Concluído", JOptionPane.PLAIN_MESSAGE);
                } else {
                    ImageIcon icon = new ImageIcon(HospitalController.class.getResource("../imagens/atencao.png"));
                    JOptionPane.showMessageDialog(null, new JLabel("<html><body><p>Alguns dados não foram importados por terem campos de</p> <p> identificação igual aos que já estão cadastrados</p></body></html>", icon, JLabel.CENTER), "Concluído", JOptionPane.PLAIN_MESSAGE);
                }
            }
        } catch (IOException | ClassNotFoundException erro) {
            ImageIcon icon = new ImageIcon(HospitalController.class.getResource("../imagens/erro.png"));
            JOptionPane.showMessageDialog(null, new JLabel("<html><body><p>Erro ao tentar importar o arquivo</p> <p>Erro: " + erro.getMessage() + "</p></body></html>", icon, JLabel.LEFT), "ERROR", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public Funcionario buscaFuncionario(int idFuncionario) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getIdFuncionario() == idFuncionario) {
                return funcionario;
            }
        }
        return null;
    }

    public List getFuncionarios() {
        return funcionarios;
    }

    public void inserir(Enfermeiro enfermeiro) {
        enfermeiros.add(enfermeiro);
        funcionarios.add(enfermeiro);
    }

    public List getEnfermeiros() {
        return enfermeiros;
    }

    public Enfermeiro buscaEnfermeiro(int idEnfermeiro) {
        for (Enfermeiro enfermeiro : enfermeiros) {
            if (enfermeiro.getIdEnfermeiro() == idEnfermeiro) {
                return enfermeiro;
            }
        }
        return null;
    }

    public void remover(Enfermeiro enfermeiro) {
        enfermeiros.remove(enfermeiro);
    }

    public void inserir(Medico medico) {
        medicos.add(medico);
        funcionarios.add(medico);
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

    public void remover(Medico medico) {
        medicos.remove(medico);
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

    public void remover(Paciente paciente) {
        pacientes.remove(paciente);
    }

    public void inserir(Consulta consulta) {
        consultas.add(consulta);
    }

    public List getConsultas() {
        return consultas;
    }

    public Consulta buscaConsulta(int idConsulta) {
        for (Consulta consulta : consultas) {
            if (consulta.getIdConsulta() == idConsulta) {
                return consulta;
            }
        }
        return null;
    }

    public void remover(Consulta consulta) {
        consultas.remove(consulta);
    }

    public Especializacao buscaEspecializacao(int indice) {
        switch (indice) {
            case 0:
                return Especializacao.CARDIOLOGISTA;
            case 1:
                return Especializacao.NEUROLOGISTA;
            case 2:
                return Especializacao.CLINICOGERAL;
            case 3:
                return Especializacao.PEDIATRA;
            case 4:
                return Especializacao.OFTALMOLOGISTA;
            case 5:
                return Especializacao.UROLOGISTA;
            case 6:
                return Especializacao.GINECOLOGISTA;
            case 7:
                return Especializacao.ORTOPEDISTA;
            case 8:
                return Especializacao.DERMATOLOGISTA;
            case 9:
                return Especializacao.PSIQUIATRA;
            default:
                return null;
        }
    }
}
