/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-04
 * Time: 11:47
 * Project: KVALIT20-OOP-Lektion19
 * Copyright: MIT
 */
public class PersonDemo {
  public static void main(String[] args) {

    // Metodöverlagring (Method overload)

    Person p1 = new Person();
    p1.setName("Mahmud" , "Al Hakim");
    System.out.println(p1);

    p1.setName("Yasmin  ;  Al Hakim");
    System.out.println(p1);


  }
}
