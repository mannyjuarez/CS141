/**
 * Emanuel Juarez
 * COPYRIGHT: smanna@cpp.edu
 * CS 141
 * Programming Assignment 4
 * 03/11/16
 *
 * STUDENTS SHOULD COMPLETE THIS CODE.
 * You will upload this code to Blackboard.
 *
 **/
public class IllegalSizeException extends Exception
{
  //generalized exception message
  public IllegalSizeException()
  {
    super("invalid int");
  }
  
  //exception message that also prints the value of the argument
  public IllegalSizeException(int i)
  {
    super(i + " is an invalid size");
  }
	/*Write a Constructor that takes the incorrect size and 
		displays the customized error message*/	
}
