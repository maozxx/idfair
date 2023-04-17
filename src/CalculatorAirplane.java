import java.util.Scanner;


public class CalculatorAirplane {

    // GLOBAL VARIABLES
    int flightAirSpeed = 140;
    double enginepower = 100000; // N ניוטון
    double masa =35000;
    double  teoza;
    double TimeTillDeparture ;
    double distance;
    int extraWeight=0;


    public void inprt() {  // GET INPUT
        Scanner scan = new Scanner(System.in);
        System.out.println("enter mishcal of airplane ");

        masa += scan.nextInt();  //
        if(!(masa > 0 && masa <2147483647))// incase input is bad
        System.out.println("MASS: " + masa);
    }
    public double calcteoza() { // calc a and return it
        teoza =enginepower/masa;
        System.out.println("ACCELERTION: " + teoza);
      return teoza;
        }

    public double calcExtraWeight() // returning the extra weight
    {
        extraWeight++;
           masa--;
        calcTimeTillDeparture();
        return extraWeight;
    }

        public double calcTimeTillDeparture() { //
        int i;
        double temp;
        calcteoza();
        temp = flightAirSpeed/teoza;  //   v/a == t
        TimeTillDeparture = temp;
            if(TimeTillDeparture>60) // extreme case too much time check
            {
                return calcExtraWeight();
            }
            System.out.println("time: " + temp + "  extra weight " + extraWeight);
            return temp;
    }
    public double calcDistance() { //
        calcTimeTillDeparture();
        distance = 0.5*teoza*TimeTillDeparture*TimeTillDeparture;
        System.out.println("Distance -> "+ distance);

        return distance;
    }

    }
