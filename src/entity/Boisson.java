package entity;

public abstract class Boisson {

    public String description;

    public Boisson() {
    }

    public abstract Double getCout() ;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
