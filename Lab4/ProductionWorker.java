import java.text.DecimalFormat;

public class ProductionWorker extends Employee
{
  private int shift;
  private double payRate;

  public ProductionWorker()
  {
    shift = 1;
    payRate = 0.0;
  }

  public ProductionWorker(String name,String number,String hireDate,int shift,double hourlyRate)
  {
    super(name, number, hireDate);
    this.shift = shift;
    payRate = hourlyRate;
  }

  public void setShift(int shift)
  {
    this.shift = shift;
  }

  public void setPayRate(double hourlyRate)
  {
    payRate = hourlyRate;
  }

  public int getShift()
  {
    return shift;
  }

  public double getPayRate()
  {
    return payRate;
  }
  public boolean isValidShift(int i)
  {
    if (i == 1 || i == 2)
      return true;
    else
      return false;
  }

  public String toString()
  {
    DecimalFormat df = new DecimalFormat("'$'0.00");
    String str = super.toString();
    String dayOrNight = "";
    if (shift == 1)
    {
      dayOrNight = "Day";
    }
    else
    {
      dayOrNight = "Night";
    }
    String invalidShift = "INVALID SHIFT NUMBER";
    if (isValidShift(shift))
    {
      return str + "\n" + "Shift: " + dayOrNight + "\n" + "Hourly rate: " +(df.format(payRate)) + "\n";
    }
    else
    {
      return str + "\n" + "Shift: " + invalidShift + "\n" + "Hourly rate: " + (df.format(payRate)) +"\n";
    }
  }
}
