package koversisuhu;
import java.util.Scanner;
public class KoversiSuhu {
public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     String[] listSuhu = {"Fahrenheit", "Kelvin", "Reamur", "Semua"};
     System.out.println("-----Program Konversi Suhu------");
     System.out.println("Ubah ke satuan mana?");
     for (int i = 0; i < listSuhu.length; i++) {
         System.out.println(i+". "+listSuhu[i]);
    }
     System.out.print("Masukkan pilihan anda : ");
     int pilihan = input.nextInt();
     System.out.print("Masukkan suhu dalam celcius : ");
     double suhuC = input.nextDouble();
     double suhuF = suhuC * 9/5 + 32;
     double suhuK = suhuC + 273;
     double suhuR = suhuC * 4/5;
     if (pilihan == 0) {
         System.out.println("Suhu setelah dikonversi : "+suhuF+"°F");
    } else if (pilihan == 1) {
         System.out.println("Suhu setelah dikonversi : "+suhuK+"°K");
    } else if (pilihan == 2) {
         System.out.println("Suhu setelah dikonversi : "+suhuR+"°R");
    } else if (pilihan == 3) {
         System.out.println("Suhu setelah dikonversi : "+suhuF+"°F");
         System.out.println("Suhu setelah dikonversi : "+suhuK+"°K");
         System.out.println("Suhu setelah dikonversi : "+suhuR+"°R");
    } else {
         System.out.println("Error!");
         System.out.println("Kode yang anda masukkan salah!");
    }
    }
    
}
