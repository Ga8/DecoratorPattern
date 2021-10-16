package decorator;

import entity.Boisson;

public abstract class BoissonDecorator extends Boisson {

    public Boisson boisson;

    public BoissonDecorator(Boisson boisson) {
      this.boisson = boisson;
    }

    public abstract  Double getCout();


}
