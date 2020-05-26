package br.com.bytebank.system;

public class InsideSystem {

    private int password = 2222;

    public void authenticates (Validation fa) {
        boolean authenticated =  fa.authenticates(this.password);
        if (authenticated) {
            System.out.println("You are able to the system!");
        } else {
            System.out.println("You are not able to the system!");
        }
    }
}
