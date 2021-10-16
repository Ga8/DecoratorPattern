package voiture.decorator;

import voiture.Voiture;

public abstract class DecoVoiture extends Voiture {

    protected Voiture voiture;

    public abstract String getLibelle();
    public abstract Double getPrix();
    public abstract int getPoid();


}
