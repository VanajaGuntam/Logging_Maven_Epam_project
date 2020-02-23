package com.vanaja;
public class Construction implements Types {
	double area;
	int choice;
	int automatic;
	Construction(int option, double area, int automate){
		this.area = area;
		this.choice = option;
		this.automatic = automate;
	}
	double getCost() {
		switch(choice) {
		case 2:
			return aboveStandard();
		case 3:
			return highStandard();
		default:
			return standard();
		}
	}
	@Override
	public double standard() {
			return 1200 * area;
	}
	@Override
	public double aboveStandard() {
		return 1500 * area;
	}
	@Override
	public double highStandard() {
		if(automatic == 1)
			return 2500 * area;
		return 1800 * area;
	}
}
