import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

 public class Main {
     private static final Logger logger = LogManager.getLogger(Visitor.class.getName());
    public static void main(String[] args) {
        Visitor alice = new Visitor("alice cooper",30, "08 September 2012", "14:45","I really enjoyed this place","Clive");
        /*logger.info(alice.save());
        Visitor bob = new Visitor("bob marley",45,"18 December 2015","15:00","I really hate this place","Damian");
        logger.info(bob.save());
        Visitor charlie = new Visitor("charlie sheen",55,"13 July 2018","16:00","I found this place good","Dominant");
        logger.info(charlie.save());*/


        System.out.println((alice.load("Alice Cooper")));
        //logger.info(bob.load("Bob Marley"));
        //logger.info(charlie.load("Charlie Sheen"));
    }

}