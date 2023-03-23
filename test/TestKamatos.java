import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

// import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
// import org.junit.Test;
import org.junit.jupiter.api.Test;


public class TestKamatos {
    Kamatos kamatos;
    @BeforeEach
    public void init() {
        this.kamatos = new Kamatos();
    }
    @Test
    public void testSzamitTenylegesKamat() {        
        double actual = kamatos.szamitTenylegesKamat(50000, 5, 1);
        assertEquals(actual, 2500.0, 0.01, "Nem 2500-t kaptam");
    }
    @Test
    public void testSzamitTenylegesKamatSecond() {
        double actual = kamatos.szamitTenylegesKamat(50000, 3, 12);
        assertEquals(actual, 1520.7, 0.1, "Nem 1520-t kaptam");
    }

    @Test
    public void testCheckInput() {
        boolean actual = kamatos.checkInput("33");
        assertTrue(actual);
    }
    @Test
    public void testCheckInputFloat() {
        boolean actual = kamatos.checkInput("33.5");
        assertTrue(actual);
    }
    @Test 
    public void testCheckInputFalse() {
        boolean actual = kamatos.checkInput("a");
        assertFalse(actual);
    }
    @Test 
    public void testCheckInputSpecial() {
        boolean actual = kamatos.checkInput("@");
        assertFalse(actual);
    }
}
