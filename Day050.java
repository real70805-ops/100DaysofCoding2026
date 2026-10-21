import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Harga Satuan\t: ");
        double haSat = s.nextDouble();
        
        System.out.print("Jumlah Beli\t: ");
        double jum = s.nextDouble();
        
        double totAw = haSat * jum;
        
        double dis = (totAw >= 100000) ? totAw * 0.1 : totAw * 0;
        String Dis = (totAw >= 100000) ? "(10%)" : "(0%)";
        double totBa = totAw - dis;
        
        System.out.printf("""
                Total Awal\t: Rp%.0f
                Diskon %s\t: Rp%.0f
                Total Bayar\t: Rp%.0f
                """, totAw, Dis, dis, totBa);
                
        s.close();
    }
}
