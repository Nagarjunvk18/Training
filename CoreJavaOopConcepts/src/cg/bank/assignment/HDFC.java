package cg.bank.assignment;

public class HDFC extends Bank {
	double getRateOfInterest() {
		return 8.00;
	}

	public double simpleInterest(double principalAmount, int years) {
		return (principalAmount * years * this.getRateOfInterest()) / 100;
	}
}
