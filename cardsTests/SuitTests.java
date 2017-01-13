import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class SuitTests {
  @Test
  public void hearts() {
    assertNotNull(Suit.HEARTS);
  }

  @Test
  public void spades() {
    assertNotNull(Suit.SPADES);
  }

  @Test
  public void diamonds() {
    assertNotNull(Suit.DIAMONDS);
  }

  @Test
  public void clubs() {
    assertNotNull(Suit.CLUBS);
  }

}
