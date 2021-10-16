package entity;

public class Expresso extends Boisson{

    public Expresso() {
        description = " Un expresso";
    }

    @Override
    public Double getCout() {
        return 2.0;
    }
}
