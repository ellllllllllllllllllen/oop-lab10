package by.bntu.fitr.poisit.zavadskaya.javalabs.lab10.model;

public class Array {

	public static int findMaxIndex(double[] array) {
		int maxIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[maxIndex] <= array[i]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static int findMinIndex(double[] array) {
		int minIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[minIndex] >= array[i]) {
				minIndex = i;
			}
		}
		return minIndex;
	}

	public static double findSumOfNegativeElements(double[] array) {

		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				sum += array[i];
			}
		}

		return sum;
	}

	public static double findÑompositionOfElements(double[] array) {
		int mul = 1;
		for (int i = findMinIndex(array) + 1; i < findMaxIndex(array); i++) {
			mul *= array[i];
		}

		return mul;
	}
}
