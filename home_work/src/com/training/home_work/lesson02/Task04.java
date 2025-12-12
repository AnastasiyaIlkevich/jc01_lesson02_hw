package com.training.home_work.lesson02;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		/*
		 * 4. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько
		 * литров молока в m больших бидонах, если в каждом большом бидоне на 12 л.
		 * больше, чем в малом?
		 * 
		 * 80/n – в 1 малом бидоне 
		 * 80/n+12 – молока в одном большом бидоне 
		 * (80/n+12)*m – молока в m больших бидонах
		 */

		Scanner scanner = new Scanner(System.in);

		double n;
		double m;
		double result;

		System.out.print("Please, enter how many liters are in the small can --->  ");
		n = scanner.nextDouble();
		System.out.print("Please, enter how many liters are in the small can --->  ");
		m = scanner.nextDouble();

		result = (80 / n + 12) * m;

		System.out.printf("There are %s liters of milk in 12 large cans. ", result);

		scanner.close();
	}

}
