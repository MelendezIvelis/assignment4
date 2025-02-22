package com.meritamerica.assignment4;

public class CDOffering {
	private double interestRate;
	private int term;

	public CDOffering(int term, double interestRate) {
		this.term = term;
		this.interestRate = interestRate;
	}

	public static CDOffering readFromString(String cdOfferingDataString) {
		String[] sArray = cdOfferingDataString.split(",");
		if (sArray.length < 2)
			throw new NumberFormatException();

		byte term;
		try {
			term = Byte.parseByte(sArray[0]);
		} catch (NumberFormatException e) {
			throw e;
		}

		double interestRate;
		try {
			interestRate = Double.parseDouble(sArray[1]);
		} catch (NumberFormatException e) {
			throw e;
		}

		CDOffering offering = new CDOffering(term, interestRate);
		return offering;
	}

	public int getTerm() {
		return term;
	}

	public double getInterestRate() {
		return interestRate;
	}

//	// Outputs account info
	public String toString() {
		String info = getTerm() + "," + getInterestRate() + "\n";

		return info;
	}
}