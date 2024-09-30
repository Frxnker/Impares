public class Impares {
    
    public static void main(String[] args) {

        int a, b;

        System.out.println("Introduce 2 números enteros: ");
        a = Integer.parseInt(System.console().readLine());
        b = Integer.parseInt(System.console().readLine());

        if (a < b) {
            while (a <= b) {
                if (a % 2 != 0) {
                    System.out.println(a);
                }
                a++;
            }
        } else {
            while (b <= a) {
                if (b % 2 != 0) {
                    System.out.println(b);
                }
                b++;
            }
        }
    }
}