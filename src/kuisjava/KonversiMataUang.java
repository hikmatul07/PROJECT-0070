package kuisjava;

import java.util.Scanner;

public class KonversiMataUang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        Scanner masukan = new Scanner(System.in);
	        float rupiah, dolar, euro;
	        System.out.print("Masukan Rupiah = ");
	        rupiah = masukan.nextFloat();
	        dolar = (float) (rupiah/14000);
	        System.out.println();
	        System.out.println("Hasil Kurs = ");
	        System.out.println("Dolar = " + dolar);
	       
	       
	}

}
