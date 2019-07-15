import java.util.ArrayList;

public class Hangar {

    public static void main(String[] args) {

     // la référence  clio reçoit une nouvelle instance de la classe Car
     Car clio = new Car("Clio");

     // utilisation de getter
     System.out.println(clio.doStuff());



     // la référence titanic reçoit une nouvelle instance de la classe Boat
     Boat titanic = new Boat("Titanic");

     // utilisation de getter  
     System.out.println(titanic.doStuff());

    }

}