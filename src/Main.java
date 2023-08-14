import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double baslangicTutari = 10.00, minimumTutar = 20.00, toplamTutar, kmTutar = 2.20;
        int Km;
        System.out.println("Lütfen mesafeyi giriniz...");
        Scanner km = new Scanner(System.in);
        Km = km.nextInt();
        
        toplamTutar = baslangicTutari + (Km * kmTutar);
        toplamTutar = (toplamTutar <= 20 ) ? 20 : toplamTutar;
        System.out.println("Toplam Tutar : " + toplamTutar);
    }
}