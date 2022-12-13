package uh;

import java.util.*;
/**
 * Group members:
 * Brandon Beharrylal
 */
public class Converter {
        public static void main(String[] Strings) {
        Scanner check = new Scanner(System.in);
        System.out.print("Would you like to convert Metric/Imperial or Currency? ");
        String nav = check.next();
        if (nav.equalsIgnoreCase("Currency")){
            System.out.print("Ok, converting Currency. ");
            check.close();
            Currency CurrencyObject;
            CurrencyObject = new Currency();
            CurrencyObject.currencyConverter(); 
        } else {
            System.out.print("Converting Metric and Imperial. ");
            check.close();
            Scanner input = new Scanner(System.in);
            final double IN_TO_M = 0.00254;
            final double OZ_TO_G = 28.3495;
            final double GAL_TO_LT = 3.758;
            final double FL_TO_LT = 0.029586;
            final double LB_TO_G = 453.6;
            final double MI_TO_M = 1609.0;
            final double FT_TO_M = 0.305;
            System.out.print("Convert (fl.oz, gal, oz, lb, in, ft, mi): ");
            String convert = input.next();
            System.out.print("Convert into (ml, l, g, kg, mm, cm, m, km): ");
            String converting = input.next();
            System.out.print("Enter value: ");
            double value = input.nextDouble();
            input.close();
            double n = 0.0;
            if (convert.equals("fl.oz")) {
                if (converting.equals("ml")) {
                    n = FL_TO_LT * 1000;
                }
                else if (converting.equals("l")) {
                    n = FL_TO_LT;
                }
            }
            else if (convert.equals("gal")) {
                if (converting.equals("ml")) {
                    n = GAL_TO_LT * 1000;
                }
                else if (converting.equals("l")) {
                    n = GAL_TO_LT;
                }
            }
            else if (convert.equals("oz")) {
                if (converting.equals("g")) {
                    n = OZ_TO_G;
                }
                else if (converting.equals("kg")) {
                    n = OZ_TO_G / 1000;
                }
            }
            else if (convert.equals("lb")) {
                if (converting.equals("g")) {
                    n = LB_TO_G;
                }
                else if (converting.equals("kg")){
                    n = LB_TO_G / 1000;
                }
            }
            else if (convert.equals("in")) {
                if (converting.equals("mm")) {
                    n = IN_TO_M * 1000;
                }
                else if (converting.equals("cm")) {
                    n = IN_TO_M * 100;
                }
                else if (converting.equals("m")) {
                    n = IN_TO_M;
                }
                else if (converting.equals("km")) {
                    n = IN_TO_M / 1000;
                }
            }
            else if (convert.equals("ft")) {
                if (converting.equals("mm")) {
                    n = FT_TO_M * 1000;
                }
                else if (converting.equals("cm")) {
                    n = FT_TO_M * 100;
                }
                else if (converting.equals("m")) {
                    n = FT_TO_M;
                }
                else if (converting.equals("km")) {
                    n = FT_TO_M / 1000;
                }
	}
            else if (convert.equals("ml")) {
                if (converting.equals("mm")) {
                    n = MI_TO_M * 1000;
                }
                else if (converting.equals("cm")) {
                    n = MI_TO_M * 100;
                }
                else if (converting.equals("m")) {
                    n = MI_TO_M;
                }
                else if (converting.equals("km")) {
                    n = MI_TO_M / 1000;
                }
            }
            if (n == 0.0) {
                System.out.println("Cannot be converted.");
            }
            else {
                double converted = value * n;
                System.out.printf("%.4f %s = %.4f %s", value, convert, converted, converting);
            }
        }
    }
}