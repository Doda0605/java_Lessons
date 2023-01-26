import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int n1, n2, suma, razlika, rezultatDjeljenja, ostatakPriDjeljenju;

    Scanner scan = new Scanner(System.in);
    System.out.println("Input first number: ");
    n1 = scan.nextInt();

    System.out.println("\nInput second number: ");
    n2 = scan.nextInt();

    suma = n1 + n2;
    System.out.println("\nSuma: "+suma);

    razlika = n1 - n2;
    System.out.println("Razlika: "+razlika);

    rezultatDjeljenja = n1 / n2;
    System.out.println("Rezultat djeljenja: "+rezultatDjeljenja);

    ostatakPriDjeljenju = n1 % n2;
    System.out.println("Ostatak pri djeljenju: "+ostatakPriDjeljenju);
    }
}