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
public class CargoPlane extends Plane
{
	//Private fields
	private int cargoCapacity;
	
  //Constructor
  public CargoPlane(String model, String year, String mileage, int cargoCapacity)
  {
    //use super to set three parameters using constructor of super class
    super(model, year, mileage);
    this.cargoCapacity = cargoCapacity;
  }
		
		
  public int getCargoCapacity()
  {
    return cargoCapacity;
  }

  public void setCargoCapacity(int cargoCapacity)
  {
    this.cargoCapacity = cargoCapacity;
  }
		
  //Method for checking if the weight is too heavy or not
  public void fillCargo(int weight) throws IllegalSizeException
  {
    //if weight is larger than capacity, then throws exception
    if (weight > cargoCapacity)
    {
      throw new IllegalSizeException();
    }
  }
	    
  @Override
  public String toString()
  {
    //returns string of the superclass plus cargo capacity
    return super.toString() + cargoCapacity;
  }

}
