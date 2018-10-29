package arraylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Runner {
	public static void main(String[] args) throws IOException {
		ArrayList<Double> grades = readFile();

		List<Double> myList = remove_duplicate(grades);
		cetakList(myList);
		Collections.sort(myList);

		System.out.println("Nilai Min: " + Collections.min(myList));
		System.out.println("Nilai Max: " + Collections.max(myList));
		System.out.println(String.format("Avg Grade: %.2f", avgList((ArrayList<Double>) myList)));
		System.out.println("Nilai stlh sort: " + myList.toString());

		FileWriter fw = new FileWriter("output.txt", false);
		fw.write("Nilai stlh sort dan no duplicate: " + myList.toString() + "\n");
		fw.close();
	}

	private static void cetakList(List<Double> myList) {
		int i = 0;
		System.out.println("==Duplicate Removed==");
		for (Double n : myList)
			System.out.println("Nilai ke-" + ++i + ": " + n);
		System.out.println();
	}

	private static ArrayList<Double> readFile() throws FileNotFoundException {
		File inputFile = new File("nilai.txt");
		Scanner input = new Scanner(inputFile);

		ArrayList<Double> grades = new ArrayList<>();
		while (input.hasNextLine())
			grades.add(input.nextDouble());
		input.close();
		return grades;
	}

	private static List<Double> remove_duplicate(ArrayList<Double> grades) {
		return grades.stream().distinct().collect(Collectors.toList());
	}

	private static Double avgList(ArrayList<Double> grades) {
		double temp = 0.0;
		for (int i = 0; i < grades.size(); i++) {
			temp += grades.get(i);
		}
		return temp / grades.size();
	}
}
