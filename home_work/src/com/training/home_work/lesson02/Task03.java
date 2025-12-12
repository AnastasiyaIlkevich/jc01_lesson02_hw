package com.training.home_work.lesson02;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		/*3. Составить алгоритм нахождения среднего арифметического двух чисел*/

		double average;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please, enter the first number --->  ");
		double firstNumber = scanner.nextDouble();
		System.out.print("Please, enter the second number --->  ");
		double secondNumber = scanner.nextDouble();

		average = (firstNumber + secondNumber) / 2;

		System.out.print("The average of two numbers = " + average);
		
		scanner.close();
	}

}
