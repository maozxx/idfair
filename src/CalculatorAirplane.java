import java.util.Scanner;


public class CalculatorAirplane {
    int flightAirSpeed = 140;
    double enginepower = 100000; // N ניוטון
    double masa ;

    double  teoza;
    double TimeTillDeparture ;

    double distance;

    public void outpr() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter mishcal of airplane ");

        masa = scan.nextInt();  //
        System.out.println("mishcal: " + masa);
    }
    public double calcteoza() { // calc a
        teoza =enginepower/masa;
        System.out.println("teoza: " + teoza);
      return teoza;
        }

    public void calcExtraWeight()
    {
        // calc a
        // if(calcTimeTillDeparture()>1)
       // {
       //     int extraWeight =1;
      //      for (; calcTimeTillDeparture()>1; extraWeight++) {
      //          teoza =enginepower/(masa-extraWeight);
      //      }
        //     System.out.println("teozaSecond: " + teoza + "Extra Weight: "+ extraWeight );
    }

        public double calcTimeTillDeparture() { //
        int i;
        double temp;
        calcteoza();
        temp = flightAirSpeed/teoza;  //   v/a == t
        System.out.println("time: " + temp);
        TimeTillDeparture = temp;
        return temp;
    }
    public double calcDistance() { //
        calcTimeTillDeparture();
        distance = 0.5*teoza*TimeTillDeparture*TimeTillDeparture;
        System.out.println("Distance -> "+ distance);

        return distance;
    }

    }
