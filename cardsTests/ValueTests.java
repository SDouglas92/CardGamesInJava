import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class ValueTests {
  @Test
  public void one() {
    assertNotNull(Value.ONE);
  }

  @Test
  public void two() {
    assertNotNull(Value.TWO);
  }

  @Test
  public void three() {
    assertNotNull(Value.THREE);
  }

  @Test
  public void four() {
    assertNotNull(Value.FOUR);
  }

  @Test
  public void five() {
    assertNotNull(Value.FIVE);
  }

  @Test
  public void six() {
    assertNotNull(Value.SIX);
  }

  @Test public void seven() {
    assertNotNull(Value.SEVEN);
  }

  @Test
  public void eight() {
    assertNotNull(Value.EIGHT);
  }

  @Test
  public void nine() {
    assertNotNull(Value.NINE);
  }

  @Test
  public void jack() {
    assertNotNull(Value.JACK);
  }

  @Test
  public void queen() {
    assertNotNull(Value.QUEEN);
  }

  @Test
  public void king() {
    assertNotNull(Value.KING);
  }

  @Test
  public void ace() {
    assertNotNull(Value.ACE);
  }
}
