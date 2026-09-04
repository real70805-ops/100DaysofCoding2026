public class java {
    public static void main(String[] args) {
        // TIPE DATA NUMERIK BILANGAN BULAT
        // kegunaan tipe data numerik bilangan bulat adalah untuk menyimpan data yang berupa bilangan bulat,e data numerik bilangan bulat terdiri dari beberapa jenis, yaitu:

        // variable
        // 1. byte, tipe data ini hanya bisa menyimpan bilangan bulat dari -128 hingga 127
        byte lebar = 18;

        // 2. short, tipe data ini hanya bisa menyimpan bilangan bulat dari -32.768 hingga 32.767
        short tinggi = 175;

        // 3. int, tipe data ini hanya bisa menyimpan bilangan bulat dari -2.147.483.648 hingga 2.147.483.647
        int jumlahPendudukIndonesia = 270000000;

        // 4. long, tipe data ini hanya bisa menyimpan bilangan bulat dari -9.223.372.036.854.775.808 hingga 9.223.372.036.854.775.807
        long jumlahPendudukDunia = 50000000000L;
        
        
        // output
        System.out.printf("Lebar\t\t\t\t: %d\n", lebar);
        System.out.printf("Tinggi\t\t\t\t: %d\n", tinggi);
        System.out.printf("Jumlah Penduduk Indonesia\t: %d\n", jumlahPendudukIndonesia);
        System.out.printf("Jumlah Penduduk Dunia\t\t: %d\n", jumlahPendudukDunia);
    }
}
