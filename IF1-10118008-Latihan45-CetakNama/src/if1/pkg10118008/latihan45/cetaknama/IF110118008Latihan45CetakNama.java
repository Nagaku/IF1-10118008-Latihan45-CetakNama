/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan45.cetaknama;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class IF110118008Latihan45CetakNama {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Printer pt = new Printer();
		System.out.print("Masukkan nama anda : ");
		pt.setNama(sc.nextLine());
		System.out.print("Mau cetak nama berapa kali? : ");
		pt.setJmlCetak(sc.nextInt());
		pt.cetak(pt.getNama());
		pt.cetak(pt.getJmlCetak(), pt.getNama());
	}
	
}
