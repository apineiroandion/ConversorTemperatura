import funionalidad.Conversor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import  org.junit.jupiter.api.Assertions;
public class ConversosrTest {
    @Test
    @DisplayName("C to F")
    public void conversosrCtoFreturnTrue() {
        Assertions.assertEquals(32, (float) Conversor.celsiusFarenheitConversor(0f));
    }
    @Test
    @DisplayName("F to C")
    public void conversosrFtoCreturnTrue() {
        Assertions.assertEquals(0.0f, Conversor.fahrenheitCelsiusConversor(32f));
    }

}
