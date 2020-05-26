package br.com.bytebank.model;

import br.com.bytebank.system.NewValidation;
import br.com.bytebank.system.Validation;

public class Client implements Validation {

    private NewValidation confirm;

    public Client() {
        this.confirm = new NewValidation();
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
