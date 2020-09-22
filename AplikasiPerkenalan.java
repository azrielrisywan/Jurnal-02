import java.util.Scanner;
import java.util.scanner;

class AplikasiPerkenalan {
    public static void main(String[] args) {

    // scanner
    Scanner inputNama = new Scanner(System.in);
    Scanner inputUmur = new Scanner(System.in);
    // inputan
    System.out.print("Nama :");
    String Nama = inputNama.nextLine();
    System.out.print("Umur : ");
    int Umur = inputUmur.nextInt();
    // proses
    System.out.println("Halo, " + Nama + ".");
    System.out.println("Ternyata usiamu baru " + Umur + " ya!");
    }
}