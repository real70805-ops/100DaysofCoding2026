public class Day017 {
  public static void main(String[] args) {
    int a = 10;
    int b = 6;
    System.out.printf("nilai a: %d \n",a);
    System.out.printf("nilai b: %d \n",b);
    a += b;
    System.out.println("nilai a + b = " + (a+=b));
    a -= b;
    System.out.println("nilai a - b = " + (a-=b));
    a *= b;
    System.out.println("nilai a x b = " + (a*=b));
    a /= b;
    System.out.println("nilai a : b = " + (a/=b));
    a %= b;
    System.out.println("nilai a % b = " + (a%=b));
  }
}
