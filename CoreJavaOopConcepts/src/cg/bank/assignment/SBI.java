package cg.bank.assignment;

public class SBI extends Bank {
	double getRateOfInterest() {
		return 5.0;
	}

	public double simpleInterest(double principalAmount, int years) {
		return (principalAmount * years * this.getRateOfInterest()) / 100;
	}
}
