import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner mec = new Scanner(System.in);
        int n,r,k,c;
        System.out.print("Faktöriyel sayısı: ");
        n = mec.nextInt();
        System.out.print("Kombinasyon sayısı: ");
        r =mec.nextInt();
        k=n-r;

        int fak = 1;

        for (int i = 1; i <= n; i++) {
            fak = i * fak;
        }
        int kom =1;
        for (int i = 1; i <= r; i++) {
            kom = i * kom;
        }
        int fark =1;
        for (int i = 1; i <= k; i++) {
            fark = i * fark;
        }
        c=fak/(kom*fark);

        System.out.println(n + "'in "+r +"'li kombinasyonu: " + c);
    }
}