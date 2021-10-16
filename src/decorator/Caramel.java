package decorator;

import entity.Boisson;

public class Caramel extends BoissonDecorator{


    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " with Caramel";
    }

    @Override
    public Double getCout() {
        return boisson.getCout() + 1.9;
    }
}
