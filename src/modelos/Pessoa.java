package modelos;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Classe responsável pela manipulação de um pessoa
 *
 * @author Antonio, João Vitor, Liliana
 */
public abstract class Pessoa implements Serializable{

    private String cpf;
    private String nome;
    private Calendar data_nasc;
    private String fixo;
    private String celular;
    private Endereco endereco;

    public Pessoa(String cpf, String nome, Calendar data_nasc, String fixo, String celular, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.fixo = fixo;
        this.celular = celular;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        Date data = this.data_nasc.getTime();
        //Formata a data
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(data);
    }

    public void setData_nasc(Calendar data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getFixo() {
        return fixo;
    }

    public void setFixo(String fixo) {
        this.fixo = fixo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
