
import java.lang.System;
import java.lang.*;

import static java.lang.Math.sqrt;

public class Kwadratowe
{



    public static double delta(double a, double b, double c)
    {
        return b*b - (4 * a * c);
    }

    static void pierwiastki(double delta, double a, double b, double c)
    {
        if(delta > 0)
        {
            double d = sqrt(delta);
            double x1 = (-b - d)/(2 * a);
            double x2 = (-b + d)/(2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if(delta == 0)
        {
            double x = -b / 2 * a;
            System.out.println("x0 = " + x);
        }
        else
            System.out.println("Brak pierwiastkow rzeczywistych");
    }

    public static void main(String[] args)
    {
        if(args.length != 3)
            System.out.println("Niewlasciwa liczba parametrow");
        else
        {
            try {
                    double a = Double.parseDouble(args[0]);
                    double b = Double.parseDouble(args[1]);
                    double c = Double.parseDouble(args[2]);

                double d = delta(a, b, c);

                pierwiastki(d, a, b, c);
            }catch(NumberFormatException e) {e.printStackTrace();}
        }


    }

}