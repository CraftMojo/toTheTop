package grade;

import java.util.Scanner;

public class Runner {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Masukkan jumlah mahasiswa: ");
		int jumlah = input.nextInt();
		Integer[] nilai = new Integer[jumlah];

		System.out.print(String.format("Masukkan %d nilai mahasiswa: \n", jumlah));
		for (int i = 0; i < nilai.length; i++) {
			nilai[i] = input.nextInt();
		}

		int count = 0;
		for (Integer n : nilai) {
			System.out.print(
					String.format("Nilai mhs %d = %d, Grade= %c\n", ++count, n, grade(n)));
		}
	}

	public static char grade(Integer angka) {
		if (angka >= 90) {
			return 'A';
		} else if (angka >= 80) {
			return 'B';
		}
		else if (angka >= 70) {
			return 'C';
		}
		else if (angka >= 60) {
			return 'D';
		}
		else {
			return 'E';		
		}
	}
}
