/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-04
 * Time: 09:22
 * Project: KVALIT20-OOP-Lektion19
 * Copyright: MIT
 * <p>
 * Klassen Deck beskriver en bunt i en vanlig kortlek
 */
public class Deck {

  /**
   * cards är en instansvariabel som lagrar ett godtyckligt antal kort
   */
  public Card[] cards;


  /**
   * En klassmetod som skapar en "tom" bunt
   * (bunten innehåller en array där alla komponenter är null)
   *
   * @param count antal kort
   * @return en bunt (en instans av klassen Deck)
   */
  public static Deck getDeck(int count) {
    Deck deck = new Deck();
    deck.cards = new Card[count];
    return deck;
  }

  /**
   * En klassmetod som skriver ut alla kort i en bunt
   *
   * @param deck en bunt
   */
  public static void print(Deck deck) {
    for (Card card : deck.cards)
      Card.print(card);
    // System.out.println(c); // skriv ut referenser
  }


  /**
   * En klassmetod som skapar en bunt
   * som innehåller alla klöver.
   *
   * @return
   */
  public static Deck getClubs() {
    Deck deck = getDeck(13); // en tom bunt som innehåller 13 platser
    for (int rank = 1; rank <= 13; rank++){
      // Skapa ett kort
      Card c = new Card();
      c.suit = Card.CLUBS;
      c.rank = rank;
      // Spara kortet i arrayen
      deck.cards[rank - 1] = c;
      // Eller med hjälp av klassmetoden getInstance i klassen Card
      deck.cards[rank - 1] = Card.getInstance(Card.CLUBS, rank);
    }
    return deck;
  }
  // Återsamling 11.05


}
