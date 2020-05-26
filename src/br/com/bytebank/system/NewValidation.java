package br.com.bytebank.system;

public class NewValidation {

    private int password;

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean authenticates(int password) {
        if (this.password == password) {
            return true;
        } else {
            return false;
        }
    }
}
