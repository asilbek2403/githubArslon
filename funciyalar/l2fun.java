package funciyalar;

import java.util.Scanner;

public class l2fun {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("A>> ");
        int c=d.nextInt();
        System.out.println("B>> ");
        int h=d.nextInt();
        Func n = new Func();
        
        int y=n.fuk(c, h);
        System.out.println(y);
    }
    
}
