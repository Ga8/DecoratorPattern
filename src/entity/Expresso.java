package entity;

public class Expresso extends Boisson{

    public Expresso() {
        description = " Un expresso";
    }

    @Override
    public Double getCout() {
        return 2.0;
    }

    @Override
    public String toString() {
        return "Expresso{" +
            "description='" + description + '\'' +
            '}';
    }
}
