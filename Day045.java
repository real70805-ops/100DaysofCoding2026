public class Day045 {
    public static void main(String[] args) {
        int nomorHari = 3;
        String namaHari;

        // Menggunakan switch-case
        switch (nomorHari) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Nomor hari tidak valid!";
                break;
        }

        // Output hasil
        System.out.println("Hari ke-" + nomorHari + " adalah " + namaHari);
    }
}
