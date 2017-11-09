package com.gmail.ozerianskyy;

import java.util.Arrays;

public class Network {

	private String phoneNumbers[] = new String[20];
	private int i=0;

	public Network() {
		super();
	}
	
	public String[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneInNetwork(String phone) {
		if(i<=phoneNumbers.length) {
			phoneNumbers[i]=phone;
			i++;
		} else {
			System.out.println("Network full");
		}
	}

	@Override
	public String toString() {
		return "Network [phoneNumbers=" + Arrays.toString(phoneNumbers) + "]";
	}
	
	
}
