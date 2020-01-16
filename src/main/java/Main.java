import java.time.LocalDate;
import java.time.LocalTime;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

 public class Main {
     private static final Logger logger = LogManager.getLogger(Visitor.class.getName());
    public static void main(String[] args) {
        Visitor alice = new Visitor("alice cooper",30, LocalDate.now(), LocalTime.now(),"I really enjoyed this place ","Clive");
        logger.info(alice.save());
        Visitor bob = new Visitor("bob marley",45,LocalDate.now(),LocalTime.now(),"I really hate this place","Damian");
        logger.info(bob.save());
        Visitor charlie = new Visitor("charlie sheen",55,LocalDate.now(),LocalTime.now(),"I found this place good","Dominant");
        logger.info(charlie.save());


        logger.info(alice.load("Alice Cooper"));
        logger.info(bob.load("Bob Marley"));
        logger.info(charlie.load("Charlie Sheen"));
    }

}