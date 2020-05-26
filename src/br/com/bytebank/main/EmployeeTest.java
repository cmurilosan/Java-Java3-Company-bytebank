package br.com.bytebank.main;

import br.com.bytebank.model.Manager;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Manager sakura = new Manager();
		sakura.setName("Sakura");
		sakura.setCpf("223355646-9");
		sakura.setSalary(2600.00);
		
		System.out.println(sakura.getName());
		System.out.println(sakura.getBonus());
	}

}
