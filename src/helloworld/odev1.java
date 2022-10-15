package helloworld;

import java.util.Scanner;

public class odev1 {
	static String isim;

	public static void main(String[] args) {
		System.out.println("isim giriniz:");
		try (Scanner scn = new Scanner(System.in)) {
			isim = scn.nextLine();
		}
		isimmetodu(args);
		System.out.println(isim);
	}

	public static void isimmetodu(Object uzunluk) {
		isim = isim.toUpperCase();
		uzunluk = isim.length();
		isim = isim.replaceAll("A", "1");
		isim = isim.replaceAll("E", "2");
		isim = isim.replaceAll("I", "3");
		isim = isim.replaceAll("İ", "4");
		isim = isim.replaceAll("O", "5");
		isim = isim.replaceAll("Ö", "6");
		isim = isim.replaceAll("U", "7");
		isim = isim.replaceAll("Ü", "8");
	}
}
