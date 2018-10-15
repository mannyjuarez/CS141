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

//class swhich simulates a Police Officer
public class PoliceOfficer {
  //private fields for name and badgenumber
  private String name;
  private String badgeNumber;

  //constructor for policeofficer to initialize fields
  public PoliceOfficer(String n, String bn)
  {
    name = n;
    badgeNumber = bn;
  }

  //constructor which hard copies a PoliceOfficer Object
  public PoliceOfficer(PoliceOfficer officer2)
  {
    name = officer2.getName();
    badgeNumber = officer2.getBadgeNumber();
  }

  //sets name
  public void setName(String n)
  {
    name = n;
  }

  //sets badgenumber
  public void setBadgeNumber(String bn)
  {
    badgeNumber = bn;
  }

  //gets name
  public String getName()
  {
    return name;
  }

  //gets badgenumber
  public String getBadgeNumber()
  {
    return badgeNumber;
  }

  //performs a comparison of the car's parked minutes and
  //minutes purchased off of meter
  //issues parking ticket if appropriate
  public ParkingTicket patrol(ParkedCar car, ParkingMeter meter)
  {
    //instantiates a ParkingTicket object
    ParkingTicket ticket = null;
    //calculate how many minutes the car was parked for that would result in a fine
    int ticketMinutes = car.getMinutesParked() - meter.getMinutesPurchased();
    //fines the car if it was parked for many minutes than were purchased
    if (ticketMinutes > 0)
    {
      ticket = new ParkingTicket(car, this, ticketMinutes);
    }
    return ticket;
  }

  //returns information about Officer in string format
  public String toString()
  {
    return name + " " + badgeNumber;
  }
}
