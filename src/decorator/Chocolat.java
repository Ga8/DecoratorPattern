package decorator;

import entity.Boisson;

public class Chocolat extends BoissonDecorator{


    public Chocolat(Boisson boisson) {
        super(boisson);
        this.description= boisson.getDescription()+ " with Chocolate";
    }


    @Override
    public Double getCout() {
        return boisson.getCout() + 1.1;
    }

    @Override
    public String toString() {
        return "Chocolat{" +
            "boisson=" + boisson +
            ", description='" + description + '\'' +
            '}';
    }
}
