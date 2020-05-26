package br.com.bytebank.main;

import br.com.bytebank.model.Manager;
import br.com.bytebank.system.Validation;

public class ManagerTest {

	public static void main(String[] args) {
		Manager g1 = new Manager();
		g1.setName("Orochimaru");
		g1.setCpf("223342513");
		g1.setSalary(5000.0);
		g1.setPassword(2222);

		System.out.println(g1.getName());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalary());
		
		boolean authentication = g1.authenticates(2222);

		System.out.println(authentication);

		System.out.println(g1.getBonus());
		
		

	}

}
