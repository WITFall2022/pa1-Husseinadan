package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
Scanner input = new Scanner(System.in);
		 
		int total_Inches;
		System.out.printf("Enter total Inches  ");
		total_Inches = input.nextInt();
		
		int yards = total_Inches / 36;
		int inchesF = (total_Inches % 36);
		int feet = (inchesF / 12);
		int inchesI = (inchesF%12);

		System.out.printf("Enter total Yards %d%n ",yards);


		System.out.printf("Enter total Feet %d%n ",feet);

		int Inches;
		System.out.printf("Enter total Inches %d%n ",inchesI);
		Inches = input.nextInt();
		int Final_values;

		Final_values = (total_Inches / yards * 36 + feet * 12 + Inches * 1);
		System.out.printf("The final values is %e%n", Final_values);
	}



		}


