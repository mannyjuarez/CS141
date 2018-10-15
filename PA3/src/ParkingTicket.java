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

//import DecimalFormat to ensure that Fine amounts are displayed
//with 2 decimal place accuracy

import java.text.DecimalFormat;


//this class simulates a Parking ticket
public class ParkingTicket
{
  //these private fields show the characteristics of a parking ticket
  private ParkedCar car;
  private PoliceOfficer officer;
  private int minutes;
  private double fine;

  //static constant members of the class, can be used in other classes
  public static final double BASE_FINE = 25.0;
  public static final double HOURLY_FINE = 10.0;

  //constructor initializing fields by passing in each value
  public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int min)
  {
    car = new ParkedCar(aCar);
    officer = new PoliceOfficer(anOfficer);
    minutes = min;
    this.calculateFine();
  }

  //constructor hard copies a ParkingTciket object
  public ParkingTicket(ParkingTicket ticket2)
  {
    car = new ParkedCar(ticket2.car);
    officer = new PoliceOfficer(ticket2.officer);
    minutes = ticket2.minutes;
    calculateFine();
  }

  //determines the fine based on the minutes over the time limit
  private void calculateFine()
  {
    //converts the minutes parked into hours
    int numHours = ((this.minutes % 60 == 0) ? (this.minutes / 60) : (this.minutes / 60) + 1);
    double fine = 0;
    //sets the base fine as the initial fine
    fine += BASE_FINE;
    //as the number of extra hours increases, the fine increments by the hourly fine
    for (int i = 0; i < numHours - 1; i++)
    {
      fine += HOURLY_FINE;
    }
    this.fine = fine;
  }

  //sets the car
  public void setCar(ParkedCar c)
  {
    car = c;
  }

  //sets the police officer
  public void setOfficer(PoliceOfficer o)
  {
    officer = o;
  }

  //sets the minutes
  public void setMinutes(int m)
  {
    minutes = m;
  }

  //returns the car
  public ParkedCar getCar()
  {
    return car;
  }

  //returns the police officer
  public PoliceOfficer getOfficer()
  {
    return officer;
  }

  //returns the fine
  public double getFine()
  {
    return fine;
  }

  //returns the relevant information from the ParkingTicket object in String format
  public String toString()
  {
    return car + " " + officer + " " + minutes + " " + fine;
  }
}
