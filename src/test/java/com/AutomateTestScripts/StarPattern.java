package com.AutomateTestScripts;

public class StarPattern {

	public static void main(String[] args) {
		int row=3;
		int star=3;
		int space=0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<space; j++) {

				System.out.print(" ");
			}

			for(int k=0; k<star; k++) {

				System.out.print("*");
			}
			star--;
			System.out.println();
		}

	}

}
