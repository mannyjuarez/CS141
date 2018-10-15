/**
 * Emanuel Juarez
 * CS141.02
 * Programming Assignment 1
 * 01/17/16
 * COPYRIGHT: smanna@cpp.edu
 * CS 141-01
 * Programming Assignment 1
 *
 * STUDENTS SHOULD COMPLETE THIS CODE.
 * You will upload this code to Blackboard.
 *
 * Feel free to include your private fields and methods.
 * But please make sure you do not change the signature
 * of the public methods provided. If you do so, your code
 * cannot be run automatically, and you will not be graded.
 *
 * If you do not write enough comments, atleast two points
 * will be deducted from your assignment. Also make sure you
 * follow the coding conventions.
 *
 **/

import java.io.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Review
{
  //return new int[0] if the input is negative.
  public static void main(String[] args) throws IOException {
    //uses the array from loadArray method to print to a file
    output(loadArray());
  }
  //this method will create an array from user input and will return an array to be used as output
  public static int[] loadArray() {
    //create scanner to take array dimension
    Scanner kb = new Scanner(System.in);
    System.out.print("Please enter array size: ");
    //Construct array
    int dimension = kb.nextInt()+1;
    int[] a;
    //if input is negative, will return new int[0] as instructed
    if (dimension <= 0)
    {
      a = new int[0];
    }
    else
    {
      a = new int[dimension];
    }
    //now loop and scanner will be used to take input for each array element
    for(int i=1; i < a.length; i++)
    {
      System.out.print("enter element "+i+" :");
      a[i]=kb.nextInt();
    }
    return a; // make changes to the return type as needed
  }
  
  public static void output(int[] a) throws IOException {
      // Print specified array into a data file
      File file = new File("data.txt");
      PrintWriter pw = new PrintWriter(file);
      //this loop goes through the array and prints an element on each line of the file
      for (int i=1; i < a.length; i++)
      {
        pw.println(a[i]);
      }
      //close outputwriter
      pw.close();
      System.out.println("data written to file.");
  }
}
