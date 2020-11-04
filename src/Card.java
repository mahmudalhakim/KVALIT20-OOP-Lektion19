/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-30
 * Time: 09:25
 * Project: KVALIT20-OOP-Lektion18
 * Copyright: MIT
 */
public class Card {

  // Clubs = klöver (♣︎)
  // Diamonds = ruter (♦︎)
  // Hearts = hjärter (♥︎)
  // Spades = spader (♠︎)
  // https://en.wikipedia.org/wiki/Playing_cards_in_Unicode

  // Konstanter / Klassvariabler
  public static final int CLUBS = 0;
  public static final int DIAMONDS = 1;
  public static final int HEARTS = 2;
  public static final int SPADES = 3;
  // Flera konstanter för att skapa kort
  public static final int JACK = 11;
  public static final int QUEEN = 12;
  public static final int KING = 13;

  // Instansvariabler / Egenskaper / Attribut
  public int suit; // Färg - Använder konstanterna
  public int rank; // Valör - Heltal mellan 1 och 13
  //  0     1    2    3    4    5    6    7    8    9    10    11       12       13
  //  null "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"

  // Dessa arrayer används vid utskrifter
  public static final String[] RANKS = {null, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
      "Jack", "Queen", "King"};
  public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
  public static final String[] SUITS_SYMBOLS = {"♣︎", "♦", "♥︎", "♠︎"};
  public static final String[] SUITS_UNICODE = {"\u2667", "\u2662", "\u2661", "\u2664"};


  /**
   * En klassmetod som skriver ut ett kort
   * @param c är ett kort (en referensvariabel)
   */
  public static void print(Card c) {
   // System.out.println(c.rank + " of " + c.suit);
   //System.out.println(Card.RANKS[c.rank] + " of " + Card.SUITS[c.suit]);
   System.out.print(Card.RANKS[c.rank] + Card.SUITS_SYMBOLS[c.suit]);
   // System.out.println(Card.RANKS[c.rank] + " of " + Card.SUITS_UNICODE[c.suit]);
  }


  /**
   * En klassmetod som skapar ett kort
   * @param suit färg
   * @param rank valör
   * @return
   */
  public static Card getInstance(int suit, int rank) {
    Card c = new Card();
    c.suit = suit;
    c.rank = rank;
    return c;
  }

  /**
   * En klassmetod som slumpgenererar ett kort
   * @return ett kort
   */
  public static Card getInstance() {
    Card c = new Card();
    c.suit = (int) (Math.random() * 4 );  // Färg
    c.rank = (int) (Math.random() * 13) + 1;  // Valör
    return c;
  }
}
