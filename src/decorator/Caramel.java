package decorator;

import entity.Boisson;

public class Caramel extends BoissonDecorator{


    public Caramel(Boisson boisson) {
        super(boisson);
        this.description= boisson.getDescription()+ " with caramel";

    }



    @Override
    public Double getCout() {
        return boisson.getCout() + 1.9;
    }

    @Override
    public String toString() {
        return "Caramel{" +
            "boisson=" + boisson +
            ", description='" + description + '\'' +
            '}';
    }
}
