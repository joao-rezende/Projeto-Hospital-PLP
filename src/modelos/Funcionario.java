package modelos;

import java.util.Calendar;

/**
 *
 * @author João Vitor
 */
public abstract class Funcionario extends Pessoa{
    
    private int idFuncionario;
    private Cargo cargo;
    private double salario;

    public Funcionario(int idFuncionario, Cargo cargo, double salario, String cpf, String nome, Calendar data_nasc, String fixo, String celular, Endereco endereco) {
        super(cpf, nome, data_nasc, fixo, celular, endereco);
        this.idFuncionario = idFuncionario;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
