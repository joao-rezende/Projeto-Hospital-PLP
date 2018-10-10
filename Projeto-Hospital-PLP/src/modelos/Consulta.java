package modelos;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author aluno
 */
public class Consulta {

    private int idConsulta;
    private int idMedico;
    private int idPaciente;
    private Calendar dataConsulta;
    private String sintomas;
    private double temperatura;
    private String pressao;
    private double peso;
            
    public Consulta(int idConsulta, int idMedico, int idPaciente, Calendar dataConsulta, String sintomas, double temperatura,
            String pressao, double peso) {
        this.idConsulta = idConsulta;
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
        this.dataConsulta = dataConsulta;
        this.sintomas = sintomas;
        this.temperatura = temperatura;
        this.pressao = pressao;
        this.peso = peso;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
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

}
