import java.util.Scanner;

public class Tugas1 {
	public static void main(String args[]){

		Scanner input = new Scanner (System.in);

		int bil1, bil2, hasil;

		System.out.println("Masukkan bilangan pertama: ");
		bil1 = input.nextInt();
		System.out.println("Masukkan bilangan kedua: ");
		bil2 = input.nextInt();

		if (bil1>bil2){
			System.out.println("Yang terbesar adalah " +bil1);
		}
		else if (bil2>bil1){
			System.out.println("Bilangan ysng terbesar adalah " +bil2);
		}

	}

}