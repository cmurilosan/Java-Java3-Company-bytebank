package br.com.bytebank.system;

//Contrato de validação
//Quem assina precisa implementar os métodos
public interface Validation {

    public abstract void setPassword(int password);

    public abstract boolean authenticates (int password);
}
