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
public class Medico extends Funcionario {

    private int idMedico;
    private int crm;
    private Especializacao especializacao;

    public Medico(int idMedico, int crm, Especializacao especializacao, int idFuncionario, double salario, String cpf, String nome, Calendar data_nasc, String fixo, String celular, Endereco endereco) {
        super(idFuncionario, Cargo.MEDICO, salario, cpf, nome, data_nasc, fixo, celular, endereco);
        this.idMedico = idMedico;
        this.crm = crm;
        this.especializacao = especializacao;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public Especializacao getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(Especializacao especializacao) {
        this.especializacao = especializacao;
    }

}
