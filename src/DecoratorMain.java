import decorator.Caramel;
import decorator.Chocolat;
import decorator.Lait;
import entity.Boisson;
import entity.DoubleCafe;
import entity.Expresso;
import voiture.C3;
import voiture.Voiture;
import voiture.decorator.GPS;
import voiture.decorator.ToitOuvrant;

public class DecoratorMain {

    public static void main(String[] args) {

        Boisson expresso = new Expresso();


        System.out.println(expresso.getDescription() + "| Boisson cost : " + expresso.getCout());

        expresso = new Caramel(expresso);
        System.out.println(expresso.getDescription()+ " | Boisson cost : " + expresso.getCout());
        expresso = new Chocolat(expresso);
        System.out.println(expresso.getDescription()+ " | Boisson cost : " + expresso.getCout());

        Boisson doubleExpresso = new Lait(new DoubleCafe());
        System.out.println(doubleExpresso.getDescription() + " | Boisson cost : " + doubleExpresso.getCout());


        Voiture voiture =  new GPS(new ToitOuvrant(new C3()));
        System.out.println(voiture);
        System.out.println(voiture.prix);

    }


}
