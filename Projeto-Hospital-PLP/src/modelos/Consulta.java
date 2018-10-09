package modelos;

/**
 *
 * @author aluno
 */
public class Consulta {

    private int idConsulta;
    private Medico medico;
    private Paciente paciente;
    private String sintomas;
    private float temperatura;
    private float pressao;
    private float peso;

    public Consulta(int idConsulta, Medico medico, Paciente paciente, String sintomas, float temperatura,
            float pressao, float peso) {
        this.idConsulta = idConsulta;
        this.medico = medico;
        this.paciente = paciente;
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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getPressao() {
        return pressao;
    }

    public void setPressao(float pressao) {
        this.pressao = pressao;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

}
