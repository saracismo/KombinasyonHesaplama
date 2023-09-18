import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int a,b,c,d;

        System.out.print("Faktöriyel sayısı giriniz: ");
        a = inp.nextInt();

        System.out.print("Kombinasyon sayısı giriniz: ");
        b =inp.nextInt();

        c=a-b;

        int fak = 1;

        for (int i = 1; i <= a; i++) {                      //döngüleri belirleyelim
            fak = i * fak;
        }
        int kom =1;
        for (int i = 1; i <= b; i++) {
            kom = i * kom;
        }
        int fark =1;
        for (int i = 1; i <= c; i++) {
            fark = i * fark;
        }
        d= fak / ( kom * fark );

        System.out.println(a + "'in "+b +"'li kombinasyonu: " + d);  // gelecek değerler ile son çıktı görüntüsünü verelim.
    }
}