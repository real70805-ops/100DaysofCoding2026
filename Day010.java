public class java {
    public static void main(String[] args) throws InterruptedException {
        // Nah untuk menentukan bats nilai suatu tipe data numnerik kita bisa menggunakan format seperti ini di dalam keluaran seperti berikut :

        System.out.println("Byte : " + Byte.MIN_VALUE + " s/d " + Byte.MAX_VALUE);
        System.out.println("Short : " + Short.MIN_VALUE + " s/d " + Short.MAX_VALUE);
        System.out.println("Integer : " + Integer.MIN_VALUE + " s/d " + Integer.MAX_VALUE);
        System.out.println("Long : " + Long.MIN_VALUE + " s/d " + Long.MAX_VALUE);
        System.out.println("Float : " + Float.MIN_VALUE + " s/d " + Float.MAX_VALUE);
        System.out.println("Double : " + Double.MIN_VALUE + " s/d " + Double.MAX_VALUE);
        // nah  tipe data character ini beda dengan String yang tidak mempunyai nilai. nah char ini mempunyai nilai karena hanya ada 1 huruf atau karakter, untuk mengkonversi char menjadi angka kita menggunaka type casting atau merubah tipe data seperti yang dilakukan di dalam kode nya
        System.out.println("Character : " + (int) Character.MIN_VALUE + " s/d " + (int) Character.MAX_VALUE); 

        // baris ini akan error karena java tidak membaca boolean sebagai tipe data numerik yang mempunyai nilai positive dan negative
        //System.out.println("Boolean : " + Boolean.MIN_VALUE + " s/d " + Boolean.MAX_VALUE);

       //nah kalo baris ini error karena String itu bukan juga sebuah tipe data numerik jadi tidak mempunyai nilai langsung
        //System.out.println("String : " + String.MIN_VALUE + " s/d " + String.MAX_VALUE); 
    }
}
