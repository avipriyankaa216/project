package org.company;
import org.client.Client;

public class Company extends Client {
	private void company() {
		// TODO Auto-generated method stub
		System.out.println("the name of the company is TCS");

	}
	public static void main(String[] args) {
		Company c=new Company();
		c.clientName();
		c.company();
		
	}

}
