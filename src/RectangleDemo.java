/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-04
 * Time: 11:27
 * Project: KVALIT20-OOP-Lektion19
 * Copyright: MIT
 */
public class RectangleDemo {

  public static void main(String[] args) {

    Rectangle r1 = new Rectangle();
    System.out.println(r1); // Rectangle@23fc625e
    System.out.println("Bredd: " + r1.width);
    System.out.println("Längd: " + r1.height);

    // Ändra bredd och höjd
    r1.width = 10;
    r1.height = -10; // OBS! negativ höjd

    try {
      r1.setHeight(-45);
      System.out.println("Bredd: " + r1.width);
      System.out.println("Längd: " + r1.height);

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
      //e.printStackTrace();
    }

    String test = "";


  }
}
