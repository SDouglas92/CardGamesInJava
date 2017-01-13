import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class CardTests {
  private Card aceOfSpades;
  private Card queenOfHearts;

  @Before
  public void setup() {
    aceOfSpades = new Card(Suit.SPADES, Value.ACE);
    queenOfHearts = new Card(Suit.HEARTS, Value.QUEEN);
  }

  @Test
  public void canGetSuit() {
    assertEquals(Suit.SPADES, aceOfSpades.getSuit());
  }

  @Test
  public void suitIsNotHardcoded() {
    assertEquals(Suit.HEARTS, queenOfHearts.getSuit());
  }

  @Test
  public void canGetValue() {
    assertEquals(Value.ACE, aceOfSpades.getValue());
  }

  @Test
  public void valueIsNotHardcoded() {
    assertEquals(Value.QUEEN, queenOfHearts.getValue());
  }
}
