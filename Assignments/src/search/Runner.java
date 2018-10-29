package search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author CraftMojo
 */
public class Runner {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> nilai = new ArrayList<>();
		int tambah = 0;
		Boolean lanjut = true;

		while (lanjut) {
			System.out.print("Tambah nilai (1: Ya, 2: Tidak) ?");
			if (input.nextInt() == 1) {
				System.out.print("Masukkan Nilai: ");
				tambah = input.nextInt();
				nilai.add(tambah);
			}
			else
				lanjut = false;
			System.out.println();
		}

		System.out.println("Data sebelum sort:");
		nilai.forEach(System.out::println);

		System.out.println("\nData sesudah sort:");
		Collections.sort(nilai);
		nilai.forEach(System.out::println);

		// Binary Search
		System.out.print("\nNilai yang ingin dicari: ");
		int result = Collections.binarySearch(nilai, input.nextInt());

		if (result > 0) {
			System.out.println(String.format("Ditemukan pada element Array ke (start from 0): %d", result));

		} else {
			System.out.println("Nilai tidak ditemukan!");
		}
	}
}
