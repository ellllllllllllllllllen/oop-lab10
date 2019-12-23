package by.bntu.fitr.poisit.zavadskaya.javalabs.lab10.util;

import java.util.Scanner;

public class Scaner {

	private static Scanner scanner = new Scanner(System.in);

	public static double scan(String message) {
		System.out.print(message);
		return scanner.nextDouble();

	}
}
