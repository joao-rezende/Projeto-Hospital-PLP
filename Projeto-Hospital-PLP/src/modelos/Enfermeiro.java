package modelos;

import java.util.Calendar;

/**
 *
 * @author João Vitor
 */
public class Enfermeiro extends Funcionario {

    private int idEnfermeiro;
    private int coren;

    public Enfermeiro(int idEnfermeiro, int coren, int idFuncionario, double salario, String cpf, String nome, Calendar data_nasc, String fixo, String celular, Endereco endereco) {
        super(idFuncionario, Cargo.ENFERMEIRO, salario, cpf, nome, data_nasc, fixo, celular, endereco);
        this.idEnfermeiro = idEnfermeiro;
        this.coren = coren;
    }

    public int getIdEnfermeiro() {
        return idEnfermeiro;
    }

    public void setIdEnfermeiro(int idEnfermeiro) {
        this.idEnfermeiro = idEnfermeiro;
    }

    public int getCoren() {
        return coren;
    }

    public void setCoren(int coren) {
        this.coren = coren;
    }

}
