package decorator;

import entity.Boisson;

public class Lait extends BoissonDecorator {


    public Lait(Boisson boisson) {
        super(boisson);
        this.description= boisson.getDescription()+ " with milk";
    }



    @Override
    public Double getCout() {
        return boisson.getCout() + 1.00;
    }

    @Override
    public String toString() {
        return "Lait{" +
            "boisson=" + boisson +
            ", description='" + description + '\'' +
            '}';
    }
}
