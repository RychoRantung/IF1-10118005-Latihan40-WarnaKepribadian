/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan40.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi Program yang menampilkan kepribadian seseorang dari warna yang dipilih
 */
public class Warna {
        public static final String Reset = "\u001B[0m";
    	public static final String Black = "\u001B[30m";
    	public static final String Red = "\u001B[31m";
    	public static final String Green = "\u001B[32m";
    	public static final String Yellow = "\u001B[33m";
    	public static final String Blue = "\u001B[34m";
    	public static final String Purple = "\u001B[35m";
    	public static final String Cyan = "\u001B[36m";
    	public static final String White = "\u001B[37m";
	public static final String BLACK_BACKGROUND = "\u001B[40m";
	public static final String RED_BACKGROUND = "\u001B[41m";
	public static final String GREEN_BACKGROUND = "\u001B[42m";
	public static final String YELLOW_BACKGROUND = "\u001B[43m";
	public static final String BLUE_BACKGROUND = "\u001B[44m";
	public static final String PURPLE_BACKGROUND = "\u001B[45m";
	public static final String CYAN_BACKGROUND = "\u001B[46m";
	public static final String WHITE_BACKGROUND = "\u001B[47m";
	private String[][] Kep = {
			{ 
				"Menyenangkan,",
				"Bijaksana,",
				"Pembawaan diri tenang saat menghadapi masalah,",
				"Dinamis,",
				"Senang Berbagi,",
				"Bersahabat,",
				"Tidak terlalu suka menjadi sorotan banyak orang,",
				"Menyembunyikan persaan karena karakternya yang cenderung mencari jalan damai."
			},
			{
				"Periang,",
				"Pemberani,",
				"Berani mengambil risiko dalam setiap langkah,",
				"Menyukai tantangan,",
				"Kurang sabar,",
				"Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,",
				"Memiliki energi kehangatan dan cinta."
			},
			{
				"Optimis,",
				"Suka bergaul,",
				"Periang,",
				"Senang menolong,",
				"Lincah dan Aktif,",
				"Tidak suka meremehkan kekurangan orang lain,",
				"Loyal,",
				"Hangat,",
				"Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,",
				"Cenderung penakut."
			},
			{
				"Optimis,",
				"Tidak pernah ragu,",
				"Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,",
				"Memiliki ambisi yang besar,",
				"Memiliki empati yang besar,",
				"Memiliki sisi misterius sebab seringkali menutupi persaannya,",
				"Terkadang bersikap keras kepala dan angkuh."
			},
			{
				"Romantis,",
				"Menyukai hal yang berbau alami dan keindahan,",
				"Teguh pada prinsip,",
				"Menginginkan Kesempurnaan,",
				"Mudah Cemburu,",
				"Mudah merasa iri,",
				"Menjunjung tinggi suatu nilai toleransi dan kepercayaan."
			}
		};
	private int[] pnjg = {8, 7, 10, 7, 7};
	int pilih = 0;
	String favorit, Nama;
	
	private void printWarna(){
		System.out.println(Red + "YUK " + Green + "CEK " + Yellow + "KEPRIBADIANMU " + Cyan + "DARI " + Purple + "WARNA " + Blue + "FAVORITMU " + Reset);	
		System.out.println(White+RED_BACKGROUND+ "\t\tMERAH\t\t");
		System.out.println(White+GREEN_BACKGROUND+ "\t\tHIJAU\t\t");
		System.out.println(White+YELLOW_BACKGROUND+ "\t\tKUNING\t\t");
		System.out.println(White+BLUE_BACKGROUND+ "\t\tBIRU\t\t");
		System.out.println(White+PURPLE_BACKGROUND+ "\t\tUNGU\t\t" + WHITE_BACKGROUND);
	}
	
	private String pilihWarna(){
		switch(this.favorit){
			case "BIRU":
				pilih = 0;
				System.out.print(Blue);
				break;
			case "MERAH":
				pilih = 1;
				System.out.print(Red);
				break;
			case "KUNING":
				pilih = 2;
				System.out.print(Yellow);
				break;
			case "UNGU":
				pilih = 3;
				System.out.print(Purple);	
				break;
			case "HIJAU":
				pilih = 4;
				System.out.print(Green);
				break;
			default:
				pilih = 5;
				break;
				
		};
		return "";
	}
	
	private void inputAwal(){
		System.out.print("PILIH WARNA FAVORITMU : ");
		Scanner sc = new Scanner(System.in);
		favorit = sc.next().toUpperCase();
		Nama = sc.nextLine();
	}
	
	private void printKepribadian(){
		System.out.print("\n===HASIL TEST KEPRIBADIAN " + Nama + "===" + "\nWarna Favoritmu Adalah ");
		System.out.println(pilihWarna() +  favorit + Reset);
		if (pilih == 5)
			System.out.println("Ooops.. Belum teridentifikasi");
		else {
			for( int i = 0; i < pnjg[pilih]; i++){
				System.out.println((i+1) + ". " + Kep[pilih][i]);
			}
		}	
	}

	public void run(){
		printWarna();
		inputAwal();
		printKepribadian();
	}
    
}
