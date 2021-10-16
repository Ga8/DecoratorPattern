package voiture;

public abstract  class Voiture {

    private String libelle;

    public Double prix;

    private int poid;



    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public int getPoid() {
        return poid;
    }

    public void setPoid(int poid) {
        this.poid = poid;
    }

    @Override
    public String toString() {
        return "Voiture{" +
            "libelle='" + getLibelle() + '\'' +
            ", prix=" + getPrix() +
            ", poid=" + getPoid() +
            '}';
    }
}
