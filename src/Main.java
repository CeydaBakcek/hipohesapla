import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner giris =new Scanner(System.in);
        System.out.print("a kenarını girin:");
        a= giris.nextInt();
        System.out.print("b kenarını girin:");
        b= giris.nextInt();
        
        c = Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs:"+c);


    }
}