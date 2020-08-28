import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestMessageBuilder {
    @Test
    public void testNumber() {
        assertEquals(5, MessageBuilder.getNumber());
    }

    @Test
    public void testMeaningfulText() {
        assertEquals("Hello Worlds", MessageBuilder.getMeaningfulText());
    }
}
