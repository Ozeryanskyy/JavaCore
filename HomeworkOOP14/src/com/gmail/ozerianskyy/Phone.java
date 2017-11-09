package com.gmail.ozerianskyy;

public class Phone {

	private String number;
	public Phone(String number) {
		super();
		this.number = number;
	}

	public Phone() {
		super();
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void call(String numberTwo, String[] networkNumbers) {
		for (int i = 0; ;) {
			if (networkNumbers[i] == numberTwo) {
				System.out.println("ALO ALO");
				break;
			} else {
				i++;
			}
			if (i>networkNumbers.length) {
				System.out.println("invalid number");
				break;
			}
		}

	}

}
