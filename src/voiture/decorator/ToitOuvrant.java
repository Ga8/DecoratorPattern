package voiture.decorator;

import voiture.Voiture;

public class ToitOuvrant extends DecoVoiture{

    public ToitOuvrant(Voiture pVoiture ) {
        voiture = pVoiture;
    }

    @Override
    public String getLibelle() {
        return voiture.getLibelle() + " avec toit ouvrant";
    }

    @Override
    public Double getPrix() {
        return voiture.getPrix() + 1000;
    }

    @Override
    public int getPoid() {
        return voiture.getPoid() - 50 ;
    }
}
