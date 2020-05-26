package br.com.bytebank.main;

import br.com.bytebank.model.Administrator;
import br.com.bytebank.model.Client;
import br.com.bytebank.model.Manager;
import br.com.bytebank.system.InsideSystem;

public class SystemTest {

    public static void main(String[] args) {

        Manager g = new Manager();
        g.setPassword(2222);

        Administrator adm = new Administrator();
        adm.setPassword(3333);

        Client client = new Client();
        client.setPassword(2222);

        InsideSystem si = new InsideSystem();
        si.authenticates(g);
        si.authenticates(adm);
        si.authenticates(client);

    }
}
