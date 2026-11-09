public class PersegiPanjangPenuh {
    public static void main(String[] args) {
        int tinggi = 4;
        int lebar = 8;

        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < lebar; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
