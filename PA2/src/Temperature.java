/**
 * COPYRIGHT: smanna@cpp.edu
 * Emanuel Juarez
 * CS 141-02
 * Programming Assignment 2
 * 02/09/16
 *
 * STUDENTS SHOULD COMPLETE THIS CODE.
 * You will upload this code to Blackboard.
 *
 * Feel free to include your private fields and methods.
 * But please make sure you do not change the signature
 * of the public methods provided. If you do so, your code
 * cannot be run automatically, and you will not be graded.
 *
 * If you do not write enough comments, at least two points
 * will be deducted from your assignment. Also make sure you
 * follow the coding conventions or you will lose points.
 *
 **/
import java.text.DecimalFormat;

public class Temperature
{

  public double degrees;

  public char scale;

  /**
   * No args constructor for temperature, initiates degrees to 0.0 and scale to C
   */
  public Temperature()
  {
    degrees = 0.0;
    scale = 'C';
  }

  /**
   * Constructor for temperature given the value for degrees
   * @param degrees the initial value to set degrees to
   */
  public Temperature(double degrees)
  {
    this.degrees = degrees;
    scale = 'C';
  }

  /**
   * Constructor for temperature given the value for scale, set to C if invalid
   * character
   * @param scale the initial value to set scale to
   */
  public Temperature(char scale)
  {
    degrees = 0.0;
    if (scale == 'f'|| scale == 'c'|| scale == 'F' || scale == 'C')
    {
      this.scale = scale;
    }
    else
    {
      scale = 'C';
    }
  }

  /**
   * Constructor for temperature given the value for degrees and scale
   * @param degrees the initial value to set degrees to
   * @param scale the initial value to set scale to
   */
  public Temperature(double degrees, char scale)
  {
    this.degrees = degrees;
    if (scale == 'f'|| scale == 'c'|| scale == 'F' || scale == 'C')
    {
      this.scale = scale;
    }
    else
    {
      scale = 'C';
    }
  }

  /**
   * @return the degrees field in the form of degrees Fahrenheit
   */
  public double getTemperatureFahrenheit()
  {
    if (scale == 'C' || scale == 'c')
    {
      return (9 * (degrees)/5 + 32); // using the formula supplied, we can convert from C to F
    }
    else
    {
      return degrees;
    }
  }

  /**
   * @return the degrees field in the form of degrees Celsius
   */
  public double getTemperatureCelsius()
  {
    if (scale == 'F' || scale == 'f')
    {
      return (5 * (degrees - 32)/9); //using the formula supplied, we can convert from F to C
    }
    else
    {
      return degrees;
    }
  }

  /**
   * sets the degrees to the value supplied
   * @param degrees the new value to set degrees to
   */
  public void setDegrees(double degrees) //setter method for degrees
  {
    this.degrees = degrees;
  }

  /**
   * sets the scale to the value supplied
   * @param scale the new value to set the scale to
   */
  public void setScale(char scale) //setter method for scale
  {
    this.scale = scale;
  }

  /**
   * sets the temperature and scale to the values supplied
   * @param degrees the new value to set degrees to
   * @param scale the new value to set the scale to
   */
  public void setDegreesScale(double degrees, char scale)
  {
    this.degrees = degrees;
    if (scale == 'C' || scale == 'c' || scale == 'F' || scale == 'f')
    {
      this.scale = scale;
    }
    else
    {
      this.scale = 'C';
    }
  }
  /**
   * this method is used to check if the scales are equal in the following
   * three comparison methods, equals, greaterThan, and lessThan
   */
  public char compareScale(char scale)
  {
    if (scale == 'F' || scale == 'f')
      return scale = 'F';
    else
      return scale = 'C';
  }
  
  /**
   * the following three methods will have essentially the same skeleton, just
   * diferent comparisons in the if statements.
   */

  /**
   * checks whether this temperature is equal to temperature 2
   * @param temp2 the temperature to compare this Temperature to
   * @return
   */
  public boolean equals(Temperature temp2)
  {
    double currentDegrees = degrees;
    char currentScale = compareScale(scale);
    char temp2Scale = compareScale(temp2.scale);
    if (currentScale == temp2Scale) //make sure the compared temperatures are using the same scale
    {
      if (currentDegrees == temp2.degrees) // confirms scales are equal
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    else // if scale is different, convert currentDegrees to corresponding scale
    {
      if (currentScale == 'F')
        currentDegrees = getTemperatureCelsius();
      else
        currentDegrees = getTemperatureFahrenheit();
      if (currentDegrees == temp2.degrees)
        return true;
      else
        return false;
    }
  }

  /**
   * checks whether this temperature is greater than temperature 2
   * @param temp2 the temperature to compare this Temperature to
   * @return whether this temperature is greater than temperature 2
   */
  public boolean greaterThan(Temperature temp2)
  {
    double currentDegrees = degrees;
    char currentScale = compareScale(scale);
    char temp2Scale = compareScale(temp2.scale);
    if (currentScale == temp2Scale)
    {
      if (currentDegrees > temp2.degrees)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    else //if scales are different, convert currentDegrees to corresponding scale
    {
      if (currentScale == 'F')
        currentDegrees = getTemperatureCelsius();
      else
        currentDegrees = getTemperatureFahrenheit();
      if (currentDegrees > temp2.degrees)
        return true;
      else
        return false;
    }

  }

  /**
   * checks whether this temperature is less than temperature 2
   * @param temp2 the temperature to compare this Temperature to
   * @return whether this temperature is less than temperature 2
   */
  public boolean lessThan(Temperature temp2)
  {
    double currentDegrees = degrees;
    char currentScale = compareScale(scale);
    char temp2Scale = compareScale(temp2.scale);
    if (currentScale == temp2Scale)
    {
      if (currentDegrees < temp2.degrees) //if scales are same, compare degrees
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    else // if scales are different, convert one to the correct scale
    {
      if (currentScale == 'F')
        currentDegrees = getTemperatureCelsius();
      else
        currentDegrees = getTemperatureFahrenheit();
      if (currentDegrees < temp2.degrees)
        return true;
      else
        return false;
    }
  }

  @ Override
  /**
   * this is already done for you
   * @return the Temperature object as a String of the format
   * #,##0.0 C or #,##0.0 F
   */
  public String toString()
  {
    DecimalFormat formatter = new DecimalFormat("#,##0.0");
    String value = formatter.format(degrees) + " " + scale;
    return value;
  }
}