/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Medico extends Pessoa {

    private int idMedico;
    private int crm;
    private Especializacao especializacao;
    private static int seq_id = 0;

    public Medico(int crm, Especializacao especializacao, String cpf, String nome, Calendar data_nasc, int fixo, int celular, List<Endereco> enderecos) {
        super(cpf, nome, data_nasc, fixo, celular, enderecos);
        this.idMedico = seq_id;
        seq_id++;
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
