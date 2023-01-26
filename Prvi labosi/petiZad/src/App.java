import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int n1, n2, rjesenje;

    Scanner scan = new Scanner(System.in);
    System.out.println("Unesite prvi broj: ");
    n1 = scan.nextInt();

    System.out.println("\nUnesite drugi broj: ");
    n2 = scan.nextInt();

    rjesenje = n1 * n2;
    System.out.println(rjesenje);
    }
}