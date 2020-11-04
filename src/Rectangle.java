/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-04
 * Time: 11:26
 * Project: KVALIT20-OOP-Lektion19
 * Copyright: MIT
 */
public class Rectangle {

  // Instansvariabler
  double height;
  double width;


  /**
   * En instansmetod som sätter höjd
   * @param height höjd
   */
  public void setHeight(double height){
    if(height > 0)
      this.height = height;
    else
      throw new IllegalArgumentException("Negativ höjd");
  }

}
