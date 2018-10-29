package shape;

import java.util.Scanner;

/**
 * @author CraftMojo
 *
 */
public class Runner {

	public static void main(String[] args) {
		// System.out.println(System.getProperty("java.version"));
		 // membuat array buah-buahan
        String[] buah = new String[5];
 
        // membuat scanner
        Scanner scan = new Scanner(System.in);
 
        // mengisi data ke array
        for( int i = 0; i < buah.length; i++ ){
            System.out.print("Buah ke-" + i + ": ");
            buah[i] = scan.nextLine();
        }
 
        System.out.println("---------------------------");
 
        // menampilkan semua isi array
        for( String b : buah ){
            System.out.println(b);
        }
		scan.close();
	}
}
