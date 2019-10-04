package modelos;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author aluno
 */
public class Consulta implements Serializable {

    private int idConsulta;
    private int idFuncionario;
    private int idPaciente;
    private Calendar dataConsulta;
    private Calendar horaConsulta;
    private String sintomas;
    private String diagnostico;
    private double temperatura;
    private String pressao;
    private double peso;

    public Consulta(int idConsulta, int idFuncionario, int idPaciente, Calendar dataConsulta, Calendar horaConsulta, String sintomas, double temperatura,
            String pressao, double peso, String diagnostico) {
        this.idConsulta = idConsulta;
        this.idFuncionario = idFuncionario;
        this.idPaciente = idPaciente;
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
        this.sintomas = sintomas;
        this.temperatura = temperatura;
        this.pressao = pressao;
        this.peso = peso;
        this.diagnostico = diagnostico;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Calendar getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Calendar dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Calendar getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(Calendar horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getPressao() {
        return pressao;
    }

    public void setPressao(String pressao) {
        this.pressao = pressao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

}
