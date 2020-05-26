package br.com.bytebank.system;

import br.com.bytebank.model.Employee;

public class BonusControl {

    private double sum;

    public void register(Employee f) {
        double bonus = f.getBonus();
        this.sum += bonus;
    }

    public double getSum() {

        return sum;
    }
}
