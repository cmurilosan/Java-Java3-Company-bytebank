package br.com.bytebank.main;

import br.com.bytebank.model.*;
import br.com.bytebank.system.BonusControl;

public class ReferenceTest {

    public static void main(String[] args) {

        Manager g1 = new Manager();
        g1.setName("Itachi");
        g1.setSalary(5000.0);

        VideoEditor ev = new VideoEditor();
        ev.setSalary(2500.0);

        Designer d = new Designer();
        d.setSalary(2000.0);

        BonusControl control = new BonusControl();

        control.register(g1);
        control.register(ev);
        control.register(d);

        System.out.println(control.getSum());
    }
}
