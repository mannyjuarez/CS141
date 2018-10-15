/**
 * Emanuel Juarez
 * COPYRIGHT: smanna@cpp.edu
 * CS 141
 * Programming Assignment 4
 * 03/10/16
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
public class PrivateJet extends Plane{
	//private fields
	private int seating;
	private double cost;
	
	//Constructor
	public PrivateJet(String model, String year, String mileage, int seating, double cost)
  {
    super(model, year, mileage);
    this.seating = seating;
    this.cost = cost;
  }
  
  //getter and setter methods for seating and cost
  public int getSeating()
  {
    return seating;
  }

  public void setSeating(int seating)
  {
    this.seating = seating;
  }
  
  public double getCost()
  {
    return cost;
  }

  public void setCost(double cost)
  {
    this.cost = cost;
  }
	    
  public void seatPassengers(int passengers) throws IllegalSizeException
  {
    //if passengers is greater than seating, throws exception
    if (passengers > seating)
    {
      throw new IllegalSizeException();
    }
  }
		
  @Override
  public String toString()
  {
    //returns string of superclass and seating and cost
    return super.toString() + seating + cost;
  }
}
