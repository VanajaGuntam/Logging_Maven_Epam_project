package com.vanaja;
public interface Types {
	double standard();
	double aboveStandard();
	double highStandard();
}
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Main {
	static int option;
	static double area;
	static int automate;
	private static Scanner in;
	private static Construction construct;
	public static void main(String args[]) {
		in = new Scanner(System.in);
		Logger logger =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
		logger.log(Level.INFO,"Construction cost per square feet is\n1."
				+ " 1200INR for standard materials\n"
				+ "2. 1500INR for above standard materials\n"
				+ "3. 1800INR for high standard material\n"
				);
		logger.log(Level.INFO,"Your choice please: ");
		option = in.nextInt();
		//in.nextLine();
		logger.log(Level.INFO,"Total area of the house (in square feets) : ");
		area=in.nextDouble();
		//in.nextLine();
		automate = 2;
		if(option == 3) {
			logger.log(Level.INFO,"2500INR for high standard maternal and fully automated home\r\n");
			logger.log(Level.INFO,"Do you want fully automated home:\n1. Yes\n2.No\n");
			automate=in.nextInt();
		}
		
		//in.nextLine();
		construct = new Construction(option,area,automate);
		logger.log(Level.INFO, "Simple Interest: " + "The cost of making home is : " + construct.getCost());
	}
}