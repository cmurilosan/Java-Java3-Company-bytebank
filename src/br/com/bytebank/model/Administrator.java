package br.com.bytebank.model;

import br.com.bytebank.system.NewValidation;
import br.com.bytebank.system.Validation;

public class Administrator extends Employee implements Validation {

    private NewValidation confirm;
    
    public Administrator() {
        this.confirm = new NewValidation();
    }
    
    public double getBonus() {
        return 50;
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
