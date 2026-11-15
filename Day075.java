public class CekStringSederhana {
    public static void main(String[] args) {
        String teks1 = "Java";
        String teks2 = "java";

        System.out.println(teks1.equals(teks2));          // false
        System.out.println(teks1.equalsIgnoreCase(teks2)); // true
        System.out.println("Belajar Java".contains("Java")); // true
        System.out.println("Java".isEmpty());                // true
    }
}
