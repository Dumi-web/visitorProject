import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

public class visitorTest {
    Visitor alice = new Visitor("alice cooper",30, "08 September 2012", "14:45","I really enjoyed this place ","Clive");
    @Test
    void save(){
        assertEquals("visitor_alice_cooper.txt File already exists!",alice.save());
        assertEquals("visitor_alice cooper.txt File already exists!",alice.save());
        assertEquals("results in visitor_alice_cooper.txt",alice.save());
        assertEquals("results in visitor_alicecooper.txt",alice.save());
    }
    @Test
    void load(){
       assertEquals("Name: alice cooper Age: 30 Date: 08 September 2012 Time: 14:45 Comments: I really enjoyed this place  Aid: Clive",alice.load("Alice Cooper"));
       assertEquals("Name: " + "alice" + " Age: " + "30"  + " Date: " + "08 September 2012"  + " Time: " + "14:45" + " Comments: " + "I really enjoyed this place " + " Aid: " + "Clive",alice.load("Alice Cooper"));
    }
}
