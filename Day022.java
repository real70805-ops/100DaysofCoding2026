public class slebew {
    public static void main(String[] args){
        String kB= "500";
        int sB = 12;

        System.out.println("=== SEBELUM DITUKAR ===");
        System.out.println("KodeBarang: " + kB);
        System.out.println("stokBarang: " + sB);

        int kB2 = Integer.parseInt(kB);
        String sB2 = String.valueOf(sB);

        System.out.println("\n=== SETELAH DITUKAR ===");
        System.out.println("kodeBarang: " + sB2 + 10);
        System.out.println("stokBarang: " + (kB2 + 10));
    }

}
