package uh;
/**
 * Group members:
 * Amaya Burris
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Currency {
	  public void currencyConverter() {
		  
		  Scanner input = new Scanner(System.in);
		  double money, yen, rupee, peso, pound, euro, usd, cad, aud;
		  int choice;
		  DecimalFormat f = new DecimalFormat ("##.##");
		  System.out.println("1: USD ");
		  System.out.println("2: YEN ");
		  System.out.println("3: POUND ");
		  System.out.println("4: RUPEE ");
		  System.out.println("5: PESO ");
		  System.out.println("6: EURO ");
		  System.out.println("7: CAD ");
		  System.out.println("8: AUD ");
		  
		  System.out.print("\n Please choose which option ");
		  choice = input.nextInt();
		  
		  System.out.print("enter amount ");
		  money = input.nextFloat();
		  input.close();
		  switch (choice)
		  {
		  case 1:
			  yen = money * .007259;
			  System.out.println("your amount is in yen is " + f.format(yen) + " usd");
			  
			  rupee = money * .012;
			  System.out.println("your amount is is rupee is " + f.format(rupee) +" usd");
			  
			  peso = money * .050;
			  System.out.println("your amount is in peso is " + f.format(peso) +" usd");
			  
			  pound = money * 1.23;
			  System.out.println("your amount is in pound is " + f.format(pound) +" usd");
			  
			  euro = money * 1.05;
			  System.out.println("your amount is in euro is " + f.format(euro) +" usd");
			  
			  cad = money * .73;
			  System.out.println("your amount is in CAD is " + f.format(cad) +" usd");
			  
			  aud = money * .68;
			  System.out.println("your amount is in AUD is " + f.format(aud) +" usd");
			  break;
			  
		  case 2:
			  usd = money * 137.68;
			  System.out.println("your amount" + money + " in usd is " + f.format(usd) + " yen");
			  
			  rupee = money * 1.66;
			  System.out.println("your amount" + money + " in rupee is " + f.format(rupee) +" yen");
			  
			  peso = money * 2.47;
			  System.out.println("your amount" + money + " in peso is " + f.format(peso) +" yen");
			  
			  pound = money * 168.75;
			  System.out.println("your amount" + money + " in pound is " + f.format(pound) +" yen");
			  
			  euro = money * 144.96;
			  System.out.println("your amount" + money + " in euro is " + f.format(euro) +" yen");
			  
			  cad = money * 100.89;
			  System.out.println("your amount" + money + " in CAD is " + f.format(cad) +" yen");
			  
			  aud = money * 92.87;
			  System.out.println("your amount" + money + " in AUD is " + f.format(aud) +" yen");
			  break;
			  
		  case 3:
			  usd = money * .81;
			  System.out.println("your amount" + money + " in usd is " + f.format(usd) + " pound");
			  
			  rupee = money * .0099;
			  System.out.println("your amount" + money + " in rupee is " + f.format(rupee) +" pound");
			  
			  peso = money * .041;
			  System.out.println("your amount" + money + " in peso is " + f.format(peso) +" pound");
			  
			  yen = money * .0059;
			  System.out.println("your amount" + money + " in pound is " + f.format(yen) +" pound");
			  
			  euro = money * .86;
			  System.out.println("your amount" + money + " in euro is " + f.format(euro) +" pound");
			  
			  cad = money * .60;
			  System.out.println("your amount" + money + " in CAD is " + f.format(cad) +" pound");
			  
			  aud = money * .55;
			  System.out.println("your amount" + money + " in AUD is " + f.format(aud) +" pound");
			  break;
			  
		  case 4:
			  usd = money * 82.64;
			  System.out.println("your amount" + money + " in usd is " + f.format(usd) + " rupee");
			  
			  pound = money * 101.39;
			  System.out.println("your amount" + money + " in rupee is " + f.format(pound) +" rupee");
			  
			  peso = money * 1.48;
			  System.out.println("your amount" + money + " in peso is " + f.format(peso) +" rupee");
			  
			  yen = money * .60;
			  System.out.println("your amount" + money + " in pound is " + f.format(yen) +" rupee");
			  
			  euro = money * 84.12;
			  System.out.println("your amount" + money + " in euro is " + f.format(euro) +" rupee");
			  
			  cad = money * 60.63;
			  System.out.println("your amount" + money + " in CAD is " + f.format(cad) +" rupee");
			  
			  aud = money * 55.81;
			  System.out.println("your amount" + money + " in AUD is " + f.format(aud) +" rupee");
			  break;
			  
		  case 5:
			  usd = money * 19.86;
			  System.out.println("your amount" + money + " in usd is " + f.format(usd) + " peso");
			  
			  pound = money * 68.29;
			  System.out.println("your amount" + money + " in rupee is " + f.format(pound) +" peso");
			  
			  rupee = money * .64;
			  System.out.println("your amount" + money + " in peso is " + f.format(rupee) +" peso");
			  
			  yen = money * .40;
			  System.out.println("your amount" + money + " in pound is " + f.format(yen) +" peso");
			  
			  euro = money * 58.67;
			  System.out.println("your amount" + money + " in euro is " + f.format(euro) +" peso");
			  
			  cad = money * 14.57;
			  System.out.println("your amount" + money + " in CAD is " + f.format(cad) +" peso");
			  
			  aud = money * 37.60;
			  System.out.println("your amount" + money + " in AUD is " + f.format(aud) +" peso");
			  break;
			  
		  case 6:
			  usd = money * .95;
			  System.out.println("your amount" + money + " in usd is " + f.format(usd) + " Euro");
			  
			  pound = money * 1.16;
			  System.out.println("your amount" + money + " in rupee is " + f.format(pound) +" Euro");
			  
			  rupee = money * .011;
			  System.out.println("your amount" + money + " in peso is " + f.format(rupee) +" Euro");
			  
			  yen = money * .0069;
			  System.out.println("your amount" + money + " in pound is " + f.format(yen) +" Euro");
			  
			  peso = money * .048;
			  System.out.println("your amount" + money + " in euro is " + f.format(peso) +" Euro");
			  
			  cad = money * .70;
			  System.out.println("your amount" + money + " in CAD is " + f.format(cad) +" Euro");
			  
			  aud = money * .64;
			  System.out.println("your amount" + money + " in AUD is " + f.format(aud) +" Euro");
			  break;
			  
		  case 7:
			  usd = money * 1.36;
			  System.out.println("your amount" + money + " in usd is " + f.format(usd) + " CAD");
			  
			  pound = money * 1.67;
			  System.out.println("your amount" + money + " in rupee is " + f.format(pound) +" CAD");
			  
			  rupee = money * .016;
			  System.out.println("your amount" + money + " in peso is " + f.format(rupee) +" CAD");
			  
			  yen = money * .0099;
			  System.out.println("your amount" + money + " in pound is " + f.format(yen) +" CAD");
			  
			  peso = money * .069;
			  System.out.println("your amount" + money + " in euro is " + f.format(peso) +" CAD");
			  
			  euro = money * 1.44;
			  System.out.println("your amount" + money + " in CAD is " + f.format(euro) +" CAD");
			  
			  aud = money * .92;
			  System.out.println("your amount" + money + " in AUD is " + f.format(aud) +" CAD");
			  break;
			  
		  case 8:
			  usd = money * 1.48;
			  System.out.println("your amount" + money + " in usd is " + f.format(usd) + " AUD");
			  
			  pound = money * 1.82;
			  System.out.println("your amount" + money + " in rupee is " + f.format(pound) +" AUD");
			  
			  rupee = money * .018;
			  System.out.println("your amount" + money + " in peso is " + f.format(rupee) +" AUD");
			  
			  yen = money * .011;
			  System.out.println("your amount" + money + " in pound is " + f.format(yen) +" AUD");
			  
			  peso = money * .027;
			  System.out.println("your amount" + money + " in euro is " + f.format(peso) +" AUD");
			  
			  euro = money * 1.56;
			  System.out.println("your amount" + money + " in CAD is " + f.format(euro) +" AUD");
			  
			  cad = money * 1.09;
			  System.out.println("your amount" + money + " in AUD is " + f.format(cad) +" AUD");
			  
			  System.out.println("Thank you for using currency converter");
		  }
	  }
}
