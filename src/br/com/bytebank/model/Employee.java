package br.com.bytebank.model;

//Esta classe não pode ser instanciada por ser abstract
public abstract class Employee {

	private String name;
	private String cpf;
	private double salary;
	private int password;


	public void setPassword(int password) {
		this.password = password;
	}

	public boolean authenticates (int password) {
		if (this.password == password) {
			return true;
		} else {
			return false;
		}
	}

	public abstract double getBonus();

	public String getName() {

		return name;
	}
	public void setName(String name) {

		this.name = name;
	}
	public String getCpf() {

		return cpf;
	}
	public void setCpf(String cpf) {

		this.cpf = cpf;
	}
	public double getSalary() {

		return salary;
	}
	public void setSalary(double salary) {

		this.salary = salary;
	}
	
	
	
}
