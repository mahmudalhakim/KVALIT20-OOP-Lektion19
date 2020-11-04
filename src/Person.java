/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-04
 * Time: 11:46
 * Project: KVALIT20-OOP-Lektion19
 * Copyright: MIT
 */
public class Person {

  // Instansvariabler
  String firstName;
  String lastName;

  public void setName(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void setName(String name) {  // "Yasmin, Al Hakim"
    int comma = name.indexOf(';');
    if (comma < 1)
      throw new IllegalArgumentException(
          "Namnet måste anges i formatet förnamn ; efternamn");

    this.firstName = name.substring(0, comma).trim();
    this.lastName = name.substring(comma + 1).trim();
  }

  @Override
  public String toString() {
    return firstName + " " +lastName;
  }

}
