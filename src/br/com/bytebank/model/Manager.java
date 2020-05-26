//Manager é um Employee. Manager herda da Classe Employee
package br.com.bytebank.model;

import br.com.bytebank.system.NewValidation;
import br.com.bytebank.system.Validation;

public class Manager extends Employee implements Validation {

	private NewValidation confirm;

	public Manager(){
		this.confirm = new NewValidation();
	}
	public double getBonus() {
		System.out.println("Creating the Manager bonus method");
		return super.getSalary();
	}

	@Override
	public void setPassword(int password) {

		this.confirm.setPassword(password);
	}

	@Override
	public boolean authenticates(int password) {
		return this.confirm.authenticates(password);
	}
}
