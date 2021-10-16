package decorator;

import entity.Boisson;

public class Lait extends BoissonDecorator {


    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " with lait";
    }

    @Override
    public Double getCout() {
        return boisson.getCout() + 1.00;
    }
}
