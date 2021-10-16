package decorator;

import entity.Boisson;

public class Chocolat extends BoissonDecorator{


    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " with chocolate";
    }

    @Override
    public Double getCout() {
        return boisson.getCout() + 1.1;
    }
}
