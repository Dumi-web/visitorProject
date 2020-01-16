import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

public class visitorTest {
    Visitor alice = new Visitor("alice cooper",30, LocalDate.now(), LocalTime.now(),"I really enjoyed this place ","Clive");
    @Test
    void save(){
        assertEquals("visitor_alice_cooper.txt File already exists!",alice.save());
        assertEquals("results in visitor_alice_cooper.txt",alice.save());

    }
}
