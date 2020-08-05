import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LightSaberTest {

    @Test
    public void ensureSetCharge(){
        LightSaber lightSaber = new LightSaber(1L);

        lightSaber.setCharge(50.5f);
        float actual = lightSaber.getCharge();
        float expected = 50.5f;

        assertEquals(actual, expected);
    }

    @Test
    public void setTheColor(){
        LightSaber lightSaber = new LightSaber(1L);
        lightSaber.setColor("blue");

        String actual = lightSaber.getColor();
        String expected = "blue";

        assertEquals(actual, expected);
    }

    @Test
    public void getTheSerialNumber(){
        LightSaber lightSaber = new LightSaber(1L);
        long actual = lightSaber.getJediSerialNumber();
        long expected = 1L;

        assertEquals(actual, expected);
    }



}
