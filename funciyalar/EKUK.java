import java.util.Scanner;

public class EKUK {

    // Ikki sonning EKUBini hisoblaydigan metod
    public static int ekub(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Ikki sonning EKUKini hisoblaydigan metod
    public static int ekuk(int a, int b) {
        return Math.abs(a * b) / ekub(a, b);  // EKUKni EKUB orqali hisoblaymiz
    }

    // N ta sonning EKUKini hisoblaydigan metod
    public static int ekukOfNumbers(int[] numbers) {
        int result = numbers[0];  // Dastlabki sonni olib, undan keyin boshqa sonlar bilan EKUKni hisoblaymiz
        for (int i = 1; i < numbers.length; i++) {
            result = ekuk(result, numbers[i]);  // Har bir sonni oldingi EKUK bilan solishtirib yangi EKUKni hisoblash
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Foydalanuvchidan N sonni olish
        System.out.print("N sonlar sonini kiriting: ");
        int N = scanner.nextInt();
        
        int[] numbers = new int[N];
        
        // Sonlarni olish
        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) + "-sonni kiriting: ");
            numbers[i] = scanner.nextInt();
        }

        // EKUKni hisoblash
        int result = ekukOfNumbers(numbers);
        
        // Natijani chiqarish
        System.out.println("Berilgan " + N + " ta sonning EKUKi: " + result);
        
        scanner.close();
    }
}
