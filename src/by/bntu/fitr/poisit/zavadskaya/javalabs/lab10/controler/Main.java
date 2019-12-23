package by.bntu.fitr.poisit.zavadskaya.javalabs.lab10.controler;

import by.bntu.fitr.poisit.zavadskaya.javalabs.lab10.model.Array;
import by.bntu.fitr.poisit.zavadskaya.javalabs.lab10.view.Printer;

public class Main {

	public static void main(String[] args) {
		double[] array = new double[] { 1, 2, 3, -4, 5, -6, 7, 8, 9, 10 };
		Printer.print("Sum Of Negative Elements: " + Array.findSumOfNegativeElements(array));
		Printer.print("\n—omposition Of Elements: " + Array.find—ompositionOfElements(array));
	}

}
