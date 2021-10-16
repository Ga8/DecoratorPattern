package voiture.decorator;

import voiture.Voiture;

public class GPS extends DecoVoiture {

    public GPS(Voiture pVoiture) {
        voiture = pVoiture;

    }

    @Override
    public String getLibelle() {
        return voiture.getLibelle() + " avec GPS";
    }

    @Override
    public Double getPrix() {
        return voiture.getPrix() + 500 ;
    }

    @Override
    public int getPoid() {
        return voiture.getPoid() + 10 ;
    }
}
