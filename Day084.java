public class NilaiTertinggi {
    public static void main(String[] args) {
        int[] nilai = {70, 85, 90, 65, 95, 80};
        int max = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }

        System.out.println(max);
    }
}