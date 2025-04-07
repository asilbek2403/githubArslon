// package funciyalar;

// class Func {
//     int a;
//     int b;

//     // Konstruktor
//     // public Func(int a, int b) {
//     //     this.a = a;
//     //     this.b = b;
//     // }

//     // Metod, kichikroq qiymatni qaytaradi
//     public int fuk(int c, int d) {
//         if (c < d) {
//             return c;
//         } else {
//             return d;
//         }
//     }
// }

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Foydalanuvchidan 3 ta sonni olish
        System.out.print("Birinchi sonni kiriting: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ikkinchi sonni kiriting: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Uchinchi sonni kiriting: ");
        int num3 = scanner.nextInt();

        // Sonlarni o'sish tartibida chiqarish
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Natijani chiqarish
        System.out.println("O'sish tartibida sonlar: " + num1 + ", " + num2 + ", " + num3);
    }
}
