/**
 * COPYRIGHT: smanna@cpp.edu
 * Emanuel Juarez
 * CS 141.02
 * Programming Assignment 3
 * 02/17/16
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
 * will be deducted from your assignment. Also, make sure you
 * follow coding conventions or you will be deducted points.
 *
 **/
 
//this class simulates a parked car
public class ParkedCar
{
  //these private fields give all the characteristics of a parked car
  //including make, model, color, license number, and minutes parked
  private String make;
  private String model;
  private String color;
  private String licenseNumber;
  private int minutesParked;

  //first constructor involves passing each individual argument
  public ParkedCar(String mk, String mod, String col, String lic, int min)
  {
    make = mk;
    model = mod;
    color = col;
    licenseNumber = lic;
    minutesParked = min;
  }

  //this constructor makes a hard copy of a parkedcar object
  public ParkedCar(ParkedCar car2)
  {
    this.make = car2.getMake();
    this.model = car2.getModel();
    this.color = car2.getColor();
    this.licenseNumber = car2.getLicenseNumber();
    this.minutesParked = car2.getMinutesParked();
  }

  //setter method for make
  public void setMake(String m)
  {
    make = m;
  }

  //setter method for model
  public void setModel(String m)
  {
    model = m;
  }

  //setter method for color
  public void setColor(String c)
  {
    color = c;
  }

  //setter method for license number
  public void setLicenseNumber(String l)
  {
    licenseNumber = l;
  }

  //setter method for minutes parked
  public void setMinutesParked(int m)
  {
    minutesParked = m;
  }

  //getter method for make
  public String getMake()
  {
    return make;
  }

  //getter method for model
  public String getModel()
  {
    return model;
  }

  //getter method for color
  public String getColor()
  {
    return color;
  }

  //getter method for license number
  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  //getter method for minutes parked
  public int getMinutesParked()
  {
    return minutesParked;
  }

  //returns the relevant ParkedCar object information in string form
  public String toString()
  {
    return make + " " + model + " " + color + " " + licenseNumber + " " + String.valueOf(minutesParked);
  }
}
