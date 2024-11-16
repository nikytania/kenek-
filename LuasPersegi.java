import java.util.Scanner;

public class LuasPersegi{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    int panjang, luas, lebar;

    System.out.print("Masukkan panjang: ");
    panjang = sc.nextInt();

    System.out.print("Masukkan lebar: ");
    lebar = sc.nextInt();

    luas=panjang*lebar;

    System.out.print("Maka luas persegi panjangnya adalah " + luas  );


  }
}