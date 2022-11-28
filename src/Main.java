import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("İşleminizi seçiniz");
        System.out.println("1 Toplama ");
        System.out.println("2 Cıkarma");
        System.out.println("3 Carpma");
        System.out.println("4 Bolme");

        int sec = scan.nextInt();
        System.out.println("İki sayı giriniz");

        int x = scan.nextInt();
        int y = scan.nextInt();

        if (sec == 1) {
            System.out.println("Cevap " + top(x, y));

        } else if (sec == 2) {
            System.out.println("Cevap " + cik(x,y));

        } else if (sec == 3) {
            System.out.println("Cevap " + carp(x,y));

        } else if (sec == 4) {
            System.out.println("Cevap " + bol(x,y));

        } else {
            System.out.println("Yanlıs hesap");
        }
    }
        public static int top (int x, int y) {
        int n;
        n=x+y;
        return n;
    }
    public static int cik (int x, int y) {
        int n;
        n=x-y;
        return n;
    }
    public static int carp (int x, int y) {
        int n;
        n=x*y;
        return n;
    }
    public static int bol (int x, int y) {
        int n;
        n=x/y;
        return n;
    }
}