import java.util.Scanner;

public class EKUB {
    
    // Ikki sonning EKUBini hisoblaydigan metod
    public static int ekub(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // N ta sonning EKUBini hisoblaydigan metod
    public static int ekubOfNumbers(int[] numbers) {
        int result = numbers[0];  // Dastlabki sonni olib, undan keyin boshqa sonlar bilan EKUBni hisoblaymiz
        for (int i = 1; i < numbers.length; i++) {
            result = ekub(result, numbers[i]);  // Har bir sonni oldingi EKUB bilan solishtirib yangi EKUBni hisoblash
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

        // EKUBni hisoblash
        int result = ekubOfNumbers(numbers);
        
        // Natijani chiqarish
        System.out.println("Berilgan " + N + " ta sonning EKUBi: " + result);
        
        scanner.close();
    }
}
