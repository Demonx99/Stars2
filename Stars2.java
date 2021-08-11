import java.util.Scanner;

public class Stars2 {
    static void Meth() {
        Scanner O = new Scanner(System.in);
        int i;
        int j;
        System.out.println("Enter the row ");
        int row = O.nextInt();
        System.out.println("Type down what you have to print");
        String Print = O.next();
        for (i = 0; i < row; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(Print);
            }
            System.out.println("");
        }
        O.close();
    }

    static void Meth2() {
        Scanner K = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter the row");
        int row = K.nextInt();
        System.out.println("Type down what you have to print");
        String Print1 = K.next();
        for (a = 0; a < row; a++) {
            for (b = 0; b < a; b++) {
                System.out.print(Print1);
            }
            System.out.println("");

        }
        K.close();
    }

    public static void main(String[] args) {

        Meth();
        Meth2();

    }

}
