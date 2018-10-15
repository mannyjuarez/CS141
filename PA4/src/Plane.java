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
 
public class Plane
{
	//Private fields
	private String model;
	private String year;
	private String mileage;
	
  //Constructor
  public Plane(String model, String year, String mileage)
  {
    this.model = model;
    this.year = year;
    this.mileage = mileage;
  }
  //setter and getter methods for all fields
  public String getModel()
  {
    return model;
  }

  public void setModel(String model)
  {
    this.model = model;
  }

  public String getYear()
  {
    return year;
  }

  public void setYear(String year)
  {
    this.year = year;
  }
	    
  public String getMileage()
  {
    return mileage;
  }

  public void setMileage(String mileage)
  {
    this.mileage = mileage;
  }
		
  @Override
  public String toString()
  {
    //returns all of the private fields
    return model + year + mileage;
  }
}
