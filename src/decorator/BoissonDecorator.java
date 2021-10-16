package decorator;

import entity.Boisson;

public abstract class BoissonDecorator extends Boisson {

    public Boisson boisson;

    public BoissonDecorator(Boisson boisson) {
      super();
      this.boisson = boisson;
    }
    public abstract String getDescription();
    public abstract  Double getCout();


}
