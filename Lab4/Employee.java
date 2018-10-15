public class Employee
{
  private String employeeName;
  private String employeeNumber;
  private String hireDate;

  private boolean validEmployeeNumber()
  {
    char[] arr = employeeNumber.toCharArray();
    if (employeeNumber.length() == 5)
    {
      if (Character.isDigit(employeeNumber.charAt(0)) && Character.isDigit(employeeNumber.charAt(1)) && Character.isDigit(employeeNumber.charAt(2)))
      {
        if (arr[3] == '-')
        {
          if (Character.isLetter(employeeNumber.charAt(4)))
          {
            return true;
          }
          else return false;
        }
        else return false;
      }
      else return false;
    }
    else return false;
  }

  public Employee()
  {
    employeeName = "";
    employeeNumber = "";
    hireDate = "";
  }

  public Employee(String name, String number, String date)
  {
    employeeName = name;
    employeeNumber = number;
    hireDate = date;
  }

  public void setEmployeeName(String name)
  {
    employeeName = name;
  }

  public void setEmployeeNumber(String number)
  {
    employeeNumber = number;
  }

  public void setHireDate(String date)
  {
    hireDate = date;
  }

  public String getEmployeeName()
  {
    return employeeName;
  }

  public String getEmployeeNumber()
  {
    return employeeNumber;
  }

  public String getHireDate()
  {
    return hireDate;
  } 

  public String toString()
  {
    String invalid = "INVALID EMPLOYEE NUMBER";
    if (validEmployeeNumber())
    {
      return "Name: " + employeeName + "\n" + "Employee Number: " + employeeNumber
              + "\n" + "Hire Date: " + hireDate;
    }
    else
    {
      return "Name: " + employeeName + "\n" + "Employee Number: " + invalid
              + "\n" + "Hire Date: " + hireDate;
    }
  }
}
