import decorator.Caramel;
import decorator.Chocolat;
import decorator.Lait;
import entity.Boisson;
import entity.DoubleCafe;
import entity.Expresso;

public class DecoratorMain {

    public static void main(String[] args) {

        Boisson expresso = new Expresso();


        System.out.println(expresso.description + "| Boisson cost : " + expresso.getCout());

        expresso = new Caramel(expresso);
        expresso = new Chocolat(expresso);
        System.out.println(expresso.getDescription()+ " | Boisson cost : " + expresso.getCout());

        Boisson doubleExpresso = new Lait(new DoubleCafe());
        System.out.println(doubleExpresso.getDescription() + " | Boisson cost : " + doubleExpresso.getCout());


    }


}
