package entity;

public class DoubleCafe extends Boisson{

    public DoubleCafe() {
        description = "Un cafe double";
    }

    @Override
    public Double getCout() {
        return 3.90;
    }

    @Override
    public String toString() {
        return "DoubleCafe{" +
            "description='" + description + '\'' +
            '}';
    }
}
