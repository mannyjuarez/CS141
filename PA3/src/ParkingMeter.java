/**
 * COPYRIGHT: smanna@cpp.edu
 * Emanuel Juarez
 * CS 141
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
 
//this class simulates the duty of a parking meter
public class ParkingMeter {
  //private field minutesPurchased
  private int minutesPurchased;

  //constructor to initialize the private field
  public ParkingMeter(int m)
  {
    minutesPurchased = m;
  }

  //sets Minutes purchased to the argument
  public void setMinutesPurchased(int m)
  {
    minutesPurchased = m;
  }

  //returns the minutes purchased 
  public int getMinutesPurchased()
  {
    return minutesPurchased;
  }
}
