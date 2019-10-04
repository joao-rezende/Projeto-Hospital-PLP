/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Calendar;

/**
 *
 * @author aluno
 */
public class Paciente extends Pessoa {

    private int idPaciente;
    private int numPlano;

    public Paciente(int idPaciente, int numPlano, String cpf, String nome, Calendar data_nasc, String fixo, String celular, Endereco endereco) {
        super(cpf, nome, data_nasc, fixo, celular, endereco);
        this.idPaciente = idPaciente;
        this.numPlano = numPlano;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getNumPlano() {
        return numPlano;
    }

    public void setNumPlano(int numPlano) {
        this.numPlano = numPlano;
    }

}
