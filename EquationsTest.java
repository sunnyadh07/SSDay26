import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquationsTest {

    @Test
    void areaOfTriangle() {
        assertEquals(2, Equations.areaOfTriangle(2,2));

    }
    @Test
    void circumferenceOfSphere(){
        assertEquals(78.5, 5.0);
    }

    @Test

    void hypotenuseOfTraingle(){
        assertEquals(5, Equations.hypotenuseOfTraingle(0.0,4.0,3.0));
    }

}