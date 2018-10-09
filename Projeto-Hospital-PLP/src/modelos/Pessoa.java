package modelos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Classe responsável pela manipulação de um pessoa
 *
 * @author Antonio, João Vitor, Liliana
 */
public class Pessoa {

    private String cpf;
    private String nome;
    private Calendar data_nasc;
    private int fixo;
    private int celular;
    private List<Endereco> enderecos;

    public Pessoa(String cpf, String nome, Calendar data_nasc, int fixo, int celular, List<Endereco> enderecos) {
        this.cpf = cpf;
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.fixo = fixo;
        this.celular = celular;
        this.enderecos = enderecos;
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

    public void setData_nasc(Calendar data_nasc) throws Exception {
        Calendar data_atual = Calendar.getInstance();
        if (data_nasc.get(Calendar.YEAR) > data_atual.get(Calendar.YEAR)) {
            throw new Exception("O ano é inválido");
        } else if (data_nasc.get(Calendar.YEAR) == data_atual.get(Calendar.YEAR) && data_nasc.get(Calendar.MONTH) > data_atual.get(Calendar.MONTH)) {
            throw new Exception("O mês é inválido");
        } else if (data_nasc.get(Calendar.YEAR) == data_atual.get(Calendar.YEAR) && data_nasc.get(Calendar.MONTH) == data_atual.get(Calendar.MONTH)
                && data_nasc.get(Calendar.DAY_OF_MONTH) > data_atual.get(Calendar.DAY_OF_MONTH)) {
            throw new Exception("O dia do mês é inválido");
        } else {
            System.out.println("Data atualizada com sucesso");
            this.data_nasc = data_nasc;
        }
    }

    public int getFixo() {
        return fixo;
    }

    public void setFixo(int fixo) {
        this.fixo = fixo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

}
