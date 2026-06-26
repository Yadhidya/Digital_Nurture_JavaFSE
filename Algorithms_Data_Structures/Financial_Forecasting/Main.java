package Financial_Forecasting;

public class Main {

  public static void main(String[] args) {
    double currentvalue=10000;
    double growthrate=0.10;
    int years=5;
    double result=futurevalue(currentvalue, growthrate, years);
    System.out.println("Result :"+result);
  }

  static double futurevalue(double currentvalue,double growthrate,int years)
  {
    if(years==0)
      return currentvalue;
    return futurevalue(currentvalue, growthrate, years-1)*(1+growthrate);
  }
  
}
